import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { AppComponent } from './app.component';
import { LoginComponent } from './sayfalar/login/login.component';
import {FormsModule, ReactiveFormsModule} from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';
import { RouterModule } from '@angular/router';
import { LoginservisService } from '../app/servisler/login/loginservis.service';
import { KayitComponent } from './sayfalar/kayit/kayit/kayit.component';
import { OgrencilerComponent } from './sayfalar/ogrenciler/ogrenciler/ogrenciler.component';

@NgModule({
  declarations: [
    AppComponent,
    LoginComponent,
    KayitComponent,
    OgrencilerComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    ReactiveFormsModule,
    HttpClientModule,
    RouterModule.forRoot([
      {
        path: '',
        component: LoginComponent,
      },
      {
        path: 'Kayit',
        component: KayitComponent
      },
      {
        path: 'Ogrenciler',
        component: OgrencilerComponent
      }
    ])
  ],
  providers: [LoginservisService],
  bootstrap: [AppComponent]
})
export class AppModule { }
