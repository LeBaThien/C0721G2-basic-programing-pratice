import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { PageComponent } from './dictionary/page/page.component';
import { DetailComponent } from './dictionary/detail/detail.component';
import { CreateComponent } from './dictionary/create/create.component';

@NgModule({
  declarations: [
    AppComponent,
    PageComponent,
    DetailComponent,
    CreateComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
