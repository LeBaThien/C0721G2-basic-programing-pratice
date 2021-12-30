import { Component, OnInit } from '@angular/core';
import {CustomerTypeService} from '../../../service/customer-type.service';
import {Subscription} from 'rxjs';
import {CustomerType} from '../../../model/customer-type';

@Component({
  selector: 'app-customer-type-list',
  templateUrl: './customer-type-list.component.html',
  styleUrls: ['./customer-type-list.component.css']
})
export class CustomerTypeListComponent implements OnInit {

  customersType: CustomerType[];

  private subscription: Subscription | undefined;

  constructor(private customerTypeService: CustomerTypeService) { }

  ngOnInit(): void {
    this.subscription = this.customerTypeService.getAllCustomerType().subscribe(data => {
        this.customersType = data;
      }, error => {
        console.log(this.customersType);
      }
    );
  }

}
