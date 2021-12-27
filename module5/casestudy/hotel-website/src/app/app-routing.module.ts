import {NgModule} from '@angular/core';
import {Routes, RouterModule} from '@angular/router';
import {CommonModule} from '@angular/common';

import {HomeComponent} from './components/home/home.component';
import {PageNotFoundComponent} from './components/page-not-found/page-not-found.component';
import {CustomerListComponent} from './components/customer/customer-list/customer-list.component';
import {EmployeeListComponent} from './components/employee/employee-list/employee-list.component';
import {FormsModule, ReactiveFormsModule} from '@angular/forms';
import {Ng2SearchPipeModule} from 'ng2-search-filter';
import {EmployeeCreateComponent} from './components/employee/employee-create/employee-create.component';
import {NgxPaginationModule} from 'ngx-pagination';

const routes: Routes = [
  {path: '', component: HomeComponent},
  {path: 'customer/customer-list', component: CustomerListComponent},
  {path: 'employee-list', component: EmployeeListComponent},
  {path: 'employee-create', component: EmployeeCreateComponent},


  {path: '**', component: PageNotFoundComponent}
];

@NgModule({
  declarations: [
    HomeComponent,
    PageNotFoundComponent,
    EmployeeListComponent,
    CustomerListComponent,
    EmployeeCreateComponent,
    // FormsModule,

  ],
  imports: [
    CommonModule,
    RouterModule.forRoot(routes),
    Ng2SearchPipeModule,
    FormsModule,
    ReactiveFormsModule,
    NgxPaginationModule,
  ],
  //Chú ý phải có export thì nó mới chạy
  exports: [RouterModule],
})
export class AppRoutingModule {
}
