import {NgModule} from '@angular/core';
import {Routes, RouterModule, ActivatedRoute} from '@angular/router';
import {CommonModule} from '@angular/common';

import {HomeComponent} from './components/home/home.component';
import {PageNotFoundComponent} from './components/page-not-found/page-not-found.component';
import {CustomerListComponent} from './components/customer/customer-list/customer-list.component';
import {EmployeeListComponent} from './components/employee/employee-list/employee-list.component';
import {EmployeeCreateComponent} from './components/employee/employee-create/employee-create.component';
import {NgxPaginationModule} from 'ngx-pagination';
import {FormsModule, ReactiveFormsModule} from '@angular/forms';
import {Ng2SearchPipeModule} from 'ng2-search-filter';
import {BrowserAnimationsModule} from '@angular/platform-browser/animations';
import {MatDatepickerModule} from '@angular/material/datepicker';
import {MatFormFieldModule} from '@angular/material/form-field';
import {MatNativeDateModule} from '@angular/material/core';
import {MatInputModule} from '@angular/material/input';
import {MatDialogModule} from '@angular/material/dialog';
import {EmployeeEditComponent} from './components/employee/employee-edit/employee-edit.component';
import {CustomerEditComponent} from './components/customer/customer-edit/customer-edit.component';
import {CustomerCreateComponent} from './components/customer/customer-create/customer-create.component';
import {CustomerTypeListComponent} from './components/customer-type/customer-type-list/customer-type-list.component';
import {EmployeeDeleteComponent} from './components/employee/employee-delete/employee-delete.component';


const routes: Routes = [
  {path: '', component: HomeComponent},
  {path: 'employee-list', component: EmployeeListComponent},
  {path: 'employee-create', component: EmployeeCreateComponent},
  {path: 'employee-edit/:id', component: EmployeeEditComponent},
  {path: 'employee-delete/:id', component: EmployeeDeleteComponent},
  {path: 'customer-list', component: CustomerListComponent},
  {path: 'customer-create', component: CustomerCreateComponent},
  // {path: 'customer-create', component: CustomerTypeListComponent},
  {path: 'customer-edit/:id', component: CustomerEditComponent},
  {path: '**', component: PageNotFoundComponent},
];


@NgModule({
  declarations: [
    HomeComponent,
    PageNotFoundComponent,
    EmployeeListComponent,
    EmployeeCreateComponent,
    EmployeeEditComponent,
    EmployeeDeleteComponent,
    CustomerListComponent,
    CustomerCreateComponent,
    CustomerEditComponent,
    CustomerTypeListComponent,
  ],
  imports: [
    CommonModule,
    RouterModule.forRoot(routes),
    NgxPaginationModule,
    FormsModule,
    Ng2SearchPipeModule,
    ReactiveFormsModule,
    MatDatepickerModule,
    MatFormFieldModule,
    MatNativeDateModule,
    MatInputModule,
    BrowserAnimationsModule,
    MatDialogModule
  ],

  exports: [RouterModule],
})
export class AppRoutingModule {
}
