import { Injectable } from '@angular/core';
import { Ogrenci } from '../../models/ogrenci';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class KayitService {
  selectedKayit: Ogrenci;
  private kayiturl = 'http://localhost:8080/ogrenciler';

  constructor(private http: HttpClient) { }
  getKayit(): Observable<Ogrenci[]> {
    return this.http.get<Ogrenci[]>(this.kayiturl).pipe();
  }
  saveKayit(ogrenci) {
    return this.http.post('http://localhost:8080/createOgrenci', ogrenci).pipe();
  }
  getSelectedKayit() {
    return this.selectedKayit;
  }
}
