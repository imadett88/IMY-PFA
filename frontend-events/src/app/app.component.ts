import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { AuthService } from './auth.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'frontend-events';
  showDropdown = false;

  constructor(private router: Router, private authService: AuthService) {}

  navigateToHome() {
    this.router.navigate(['/home']);
  }

  isAuthenticated() {
    return this.authService.isAuthenticated;
  }

  getUsername() {
    return this.authService.getUsername();
  }

  logout() {
    this.authService.logout();
    this.showDropdown = false; // Close the dropdown after logout
    console.log('Logout clicked');
  }

  toggleDropdown() {
    this.showDropdown = !this.showDropdown;
  }
}
