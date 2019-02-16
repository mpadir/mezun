import { Component } from '@angular/core';
import { Router } from '../../node_modules/@angular/router';
import { LoginservisService } from '../app/servisler/login/loginservis.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  constructor(private router: Router, private loginService: LoginservisService) {}

  clickLogin() {
    this.router.navigate(['']);
  }
  clickLogout() {
   localStorage.removeItem('currentUser');
   this.router.navigate(['']);
  }
}
