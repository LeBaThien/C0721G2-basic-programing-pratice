import {NgModule} from '@angular/core';
import {CommonModule} from '@angular/common';
import {CategoryListComponent} from "./category-list/category-list.component";
import {CategoryRoutingModule} from "./category-routing.module";
import {ReactiveFormsModule} from "@angular/forms";
import {CategoryDeleteComponent} from "./category-delete/category-delete.component";
import {CategoryEditComponent} from "./category-edit/category-edit.component";
import {CategoryCreateComponent} from "./category-create/category-create.component";


@NgModule({
  declarations: [CategoryListComponent, CategoryCreateComponent, CategoryEditComponent, CategoryDeleteComponent],
  imports: [
    CommonModule,
    CategoryRoutingModule,
    ReactiveFormsModule
  ]
})
export class CategoryModule {
}
