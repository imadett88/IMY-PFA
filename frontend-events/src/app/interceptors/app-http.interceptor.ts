import { Injectable } from '@angular/core';
import {
  HttpRequest,
  HttpHandler,
  HttpEvent,
  HttpInterceptor
} from '@angular/common/http';
import { Observable } from 'rxjs';
import { AuthService } from '../auth.service';

@Injectable()
export class AppHttpInterceptor implements HttpInterceptor {

  constructor(private authService: AuthService) {}

  intercept(request: HttpRequest<unknown>, next: HttpHandler): Observable<HttpEvent<unknown>> {
    //console.log("*******")
    console.log(request.url)
    if(!request.url.includes("/auth/login")){
      let newRequest = request.clone({
        headers : request.headers.set('Authorization','Bearer ' + this.authService.accessToken)
      })
      return next.handle(newRequest);

    } else return next.handle(request);

  }
}
