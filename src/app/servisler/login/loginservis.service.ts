import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import { map } from 'rxjs/operators';
import { Ogrenci } from 'src/app/models/ogrenci';


@Injectable({
  providedIn: 'root'
})
export class LoginservisService {
  public token: string;
  selectedLogin: Ogrenci;
  constructor(private http: HttpClient) {
  }
  login(ogrenci) {
    return this.http.post<any>('http://localhost:8080/ologin', ogrenci).pipe(
      // tslint:disable-next-line:no-shadowed-variable
      map(ogrenci => {
        return ogrenci;
      })
    );
  }
  loggedIn() {
    return localStorage.getItem('currentOgrenci');
  }
  setSelectedLogin(ogrenci: Ogrenci) {
    this.selectedLogin = ogrenci;
  }

}
