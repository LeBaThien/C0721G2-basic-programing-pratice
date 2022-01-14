import {NgModule} from '@angular/core';
import {Routes, RouterModule} from '@angular/router';
import {CustomerListComponent} from './component/customer/customer-list/customer-list.component';
import {CustomerCreateComponent} from './component/customer/customer-create/customer-create.component';
import {CustomerDeleteComponent} from './component/customer/customer-delete/customer-delete.component';
import {CustomerEditComponent} from './component/customer/customer-edit/customer-edit.component';
import {PageNotFoundComponent} from './component/page-not-found/page-not-found.component';
import {HomeComponent} from './component/home/home.component';
import {CommonModule} from '@angular/common';
import {MatDialogModule} from '@angular/material/dialog';
import {FormsModule, ReactiveFormsModule} from '@angular/forms';
import {MatFormFieldModule} from '@angular/material/form-field';
import {MatDatepickerModule} from '@angular/material/datepicker';
import {MatInputModule} from '@angular/material/input';
import {MatSelectModule} from '@angular/material/select';
import {MatNativeDateModule} from '@angular/material/core';
import {Ng2SearchPipeModule} from 'ng2-search-filter';
import {BrowserAnimationsModule} from '@angular/platform-browser/animations';
import {MatPaginatorModule} from '@angular/material/paginator';


const routes: Routes = [
  {path: '', component: HomeComponent},
  {path: 'customer-list', component: CustomerListComponent},
  {path: 'customer-create', component: CustomerCreateComponent},
  {path: 'customer-edit/:id', component: CustomerEditComponent},
  {path: 'customer-delete/:id', component: CustomerDeleteComponent},
  {path: '**', component: PageNotFoundComponent}

];

@NgModule({
  declarations: [
    HomeComponent,
    PageNotFoundComponent,
    CustomerListComponent,
    CustomerCreateComponent,
    CustomerDeleteComponent,
    CustomerEditComponent
  ],
    imports: [RouterModule.forRoot(routes),
        CommonModule,
        MatDialogModule,
        ReactiveFormsModule,
        MatFormFieldModule,
        MatDatepickerModule,
        MatInputModule,
        MatSelectModule,
        MatNativeDateModule,
        Ng2SearchPipeModule, FormsModule, MatPaginatorModule,
        // FormsModule,

    ],
  exports: [RouterModule]
})
export class AppRoutingModule {
}
