import {Component, OnInit} from '@angular/core';
import {Customer} from '../../../model/customer';
import {CustomerService} from '../../../service/customer.service';
import {Subscription} from 'rxjs';

@Component({
  selector: 'app-customer-list',
  templateUrl: './customer-list.component.html',
  styleUrls: ['./customer-list.component.css']
})
export class CustomerListComponent implements OnInit {
  customer: Customer | undefined;
  customers: Customer[] = [];
  private subscription: Subscription | undefined;
  constructor(private customerService: CustomerService) {
  }

  ngOnInit() {
      this.subscription = this.customerService.getAllCustomer().subscribe(
        data =>{
          this.customers = data;
        }, error => {
          console.log('lay danh sach khach hang that bai');
        }
      );
  }

  // getAll() {
  //   this.customerService.getAll().subscribe(customers => {
  //     this.customers = customers;
  //   });
  // }

}
