import { HttpClient, HttpHeaders, HttpParams } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Router } from '@angular/router';
import { jwtDecode } from 'jwt-decode';

@Injectable({
  providedIn: 'root'
})
export class AuthService {

  isAuthenticated : boolean = false;
  role : any;
  username : any;
  accessToken!: string;

  constructor(private http: HttpClient,private router:Router) { }

  public login(username:string, password:string){
    let options = {
      headers : new HttpHeaders().set("Content-Type","application/x-www-form-urlencoded")
    }
    let params = new HttpParams().set("username",username).set("password",password);
    return this.http.post("http://localhost:7700/auth/login",params,options)
  }

  public logout() {
    this.isAuthenticated = false;
    this.role = null;
    this.username = null;
    this.accessToken = '';

    this.router.navigate(['/login']);
  }

  getUsername(): string | null {
    return this.username ? this.username.split('@')[0] : null;
  }

  public clearUserData() {
    this.isAuthenticated = false;
    this.role = null;
    this.username = null;
    this.accessToken = '';
  }

  loadProfile(data: any) {
    this.isAuthenticated = true;
    this.accessToken = data['access-token'];
    let decodedJwt:any = jwtDecode(this.accessToken);
    this.username = decodedJwt.sub;
    this.role = decodedJwt.scope;
  }
}
