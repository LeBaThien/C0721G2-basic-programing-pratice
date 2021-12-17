import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { ColorPickerModule } from 'ngx-color-picker';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { NavbarComponent } from './navbar/navbar.component';
import { BoxshadowComponent } from './boxshadow/boxshadow.component';
import {FormsModule} from '@angular/forms';
import { GradientComponent } from './gradient/gradient.component';

@NgModule({
  declarations: [
    AppComponent,
    NavbarComponent,
    BoxshadowComponent,
    GradientComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    ColorPickerModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
