import { Component, OnInit, ViewChild } from '@angular/core';
import {Router} from '@angular/router';
import {NgForm} from '@angular/forms';
import { LoginservisService } from '../../servisler/login/loginservis.service';
import { Ogrenci } from 'src/app/models/ogrenci';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  error = '';

  constructor(private router: Router, private loginService: LoginservisService) { }
  @ViewChild('loginForm') loginForm: NgForm;

  ngOnInit() {
  }
  onSubmit() {
    const value = this.loginForm.value;
    let ogrenci = {
      email: value.email,
      password: value.password,
    };
    if (value.email && value.password) {
      this.loginService.login(ogrenci).subscribe(
        (response) => {
          if (response != null) {
            localStorage.setItem('currentUser', JSON.stringify(response));
            this.router.navigate(['Ogrenciler']);
          }
          this.error = 'There is no user';
        }
      );
    } else {
      // tslint:disable-next-line:no-debugger
      debugger;
      this.error = 'Mail or Password is incorrect';
    }
  }
  clickKayit(login) {
    this.loginService.setSelectedLogin(login);
    this.router.navigate(['Kayit']);
  }

}
