import {NgModule} from '@angular/core';
import {Routes, RouterModule} from '@angular/router';
import {HomeComponent} from "./components/home/home.component";
import {PageNotFoundComponent} from "./components/page-not-found/page-not-found.component";
import {CommonModule} from "@angular/common";
import {NgxPaginationModule} from "ngx-pagination";
import {FormsModule, ReactiveFormsModule} from "@angular/forms";


import {MatDatepickerModule} from "@angular/material/datepicker";
import {MatSelectModule} from "@angular/material/select";
import {MatInputModule} from "@angular/material/input";
import {MatFormFieldModule} from "@angular/material/form-field";
import {MatNativeDateModule} from "@angular/material/core";
import {BrowserAnimationsModule} from "@angular/platform-browser/animations";
import {MatDialogModule} from "@angular/material/dialog";
import {Ng2SearchPipeModule} from "ng2-search-filter";
import {BenhAnListComponent} from "./components/benh-an/benh-an-list/benh-an-list.component";
import {BenhAnCreateComponent} from "./components/benh-an/benh-an-create/benh-an-create.component";
import {BenhAnEditComponent} from "./components/benh-an/benh-an-edit/benh-an-edit.component";
import {BenhAnDeleteComponent} from "./components/benh-an/benh-an-delete/benh-an-delete.component";

const routes: Routes = [
  {path: '', component: HomeComponent},
  {path: 'benh-an-list', component: BenhAnListComponent},
  {path: 'benh-an-create', component: BenhAnCreateComponent},
  {path: 'benh-an-edit/:id', component: BenhAnEditComponent},
  {path: 'benh-an-delete/:id', component: BenhAnDeleteComponent},
  //Phải nhớ để cái này xuống dưới cùng
  {path: '**', component: PageNotFoundComponent},

];

@NgModule({
  declarations: [
    HomeComponent,
    PageNotFoundComponent,
    BenhAnListComponent,
    BenhAnCreateComponent,
    BenhAnEditComponent,
    BenhAnDeleteComponent,
  ],
  imports: [RouterModule.forRoot(routes),
    CommonModule,
    NgxPaginationModule,
    FormsModule,
    ReactiveFormsModule,
    MatDatepickerModule,
    MatSelectModule,
    MatInputModule,
    ReactiveFormsModule,
    MatDatepickerModule,
    MatFormFieldModule,
    MatNativeDateModule,
    MatInputModule,
    BrowserAnimationsModule,
    MatDialogModule, Ng2SearchPipeModule

  ],
  exports: [RouterModule]
})
export class AppRoutingModule {
}
