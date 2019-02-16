import { Component, OnInit } from '@angular/core';
import { KayitService } from 'src/app/servisler/kayit/kayit.service';
import { NgForm } from '@angular/forms';

@Component({
  selector: 'app-kayit',
  templateUrl: './kayit.component.html',
  styleUrls: ['./kayit.component.css']
})
export class KayitComponent implements OnInit {

  constructor(private kayitService: KayitService) { }

  ngOnInit() {
  }
  saveKayit(from: NgForm) {
    console.log(from);
    this.kayitService.saveKayit(from).subscribe(
      resp => {
        console.log(resp);
      }
    );

  }

}
