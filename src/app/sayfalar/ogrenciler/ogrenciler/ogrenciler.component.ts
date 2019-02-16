import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { KayitService } from 'src/app/servisler/kayit/kayit.service';
import { Ogrenci } from 'src/app/models/ogrenci';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-ogrenciler',
  templateUrl: './ogrenciler.component.html',
  styleUrls: ['./ogrenciler.component.css']
})
export class OgrencilerComponent implements OnInit {
  ogrenci: Ogrenci[];
  showFrom: boolean = true;
  constructor(private router: Router, private kayitService: KayitService) { }

  ngOnInit() {
    this.getOgrenci();

  }
  getOgrenci() {
    this.kayitService.getKayit().subscribe(ogrenci => {
      this.ogrenci = (ogrenci);
      console.log(this.ogrenci);
    });
  }


}
