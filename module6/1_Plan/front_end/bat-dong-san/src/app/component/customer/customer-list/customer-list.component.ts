import {Component, OnInit, ViewChild} from '@angular/core';
import {CustomerService} from '../../../service/customer.service';
import {Subscription} from 'rxjs';
import {Customer} from '../../../model/customer';
import {MatDialog} from '@angular/material/dialog';
import {CustomerDeleteComponent} from '../customer-delete/customer-delete.component';
import {FormControl, FormGroup} from '@angular/forms';
import {ActivatedRoute} from '@angular/router';
import {CustomertypeService} from '../../../service/customertype.service';
import {MatPaginator} from '@angular/material/paginator';
import {MatTableDataSource} from '@angular/material/table';

@Component({
  selector: 'app-customer-list',
  templateUrl: './customer-list.component.html',
  styleUrls: ['./customer-list.component.css']
})
export class CustomerListComponent implements OnInit {
  customers: Customer[] = [];
  customers1: Customer[] = [];
  private subscription: Subscription | undefined;
  customerPhone: any;


  // formSearch = new FormGroup({
  //   phone: new FormControl()
  // });

  constructor(
    private customerService: CustomerService,
    private customerTypeService: CustomertypeService,
    private dialog: MatDialog,
  ) {
  }


  ngOnInit(): void {
    this.showCustomer();
    // this.customerService.pageCustomer(2).subscribe(data => {
    //   // this.customers = data
    //   console.log(data.content);
    // });
    // this.customerService.getCustomerById('8').subscribe(data => {
    //   console.log(data);
    // });

    // this.customerService.getCustomerByPhone('0905999123').subscribe(data => {
    //   console.log(data);
    // });
    // this.customerTypeService.getAllCustomerType().subscribe(data => {
    // });

  }

  showCustomer() {
    this.subscription = this.customerService.getAllCustomer().subscribe(data => {
      console.log(data);
      this.customers = data;
    }, error => {
      console.log(this.customers);
    });
  }

  openDialog(customerId) {
    this.customerService.getCustomerById(customerId).subscribe(data => {
      const dialogRef = this.dialog.open(CustomerDeleteComponent, {
        width: '500px',
        data: {data2: data},
        disableClose: true
      });
      dialogRef.afterClosed().subscribe(result => {
        console.log('the dialog was closed');
        this.ngOnInit();
      });
    });
  }

  // findCustomerByPhone(phone: any) {
  //   this.subscription =  this.customerService.getCustomerByPhone(phone).subscribe(data5 => {
  //     console.log(data5);
  //     this.customers1 = data5;
  //   }, error => {
  //     console.log(this.customers1);
  //   });
  //
  // }
  findCustomerByPhone() {
    if (this.customerPhone == '') {
      this.ngOnInit();
    } else {
      this.customers = this.customers.filter(data => {
        return data.customerPhone.match(this.customerPhone);
      });
    }
  }

  // key: string  ='id';
  // reserve: boolean = false;
  // sort(key){
  //   this.key = key;
  //   this.reserve = !this.reserve;
  // }

  searchAnything(key: string): void {
    const result: Customer[] = [];
    for (const customer of this.customers) {
      if (customer.customerName.toLowerCase().indexOf(key.toLowerCase()) !== -1
        || customer.email.toLowerCase().indexOf(key.toLowerCase()) !== -1
        || customer.customerType.customerTypeName.toLowerCase().indexOf(key.toLowerCase()) !== -1
        || customer.customerAddress.toLowerCase().indexOf(key.toLowerCase()) !== -1
        || customer.customerCode.toLowerCase().indexOf(key.toLowerCase()) !== -1
        || customer.customerPhone.toLowerCase().toLowerCase().indexOf(key.toLowerCase()) !== -1) {
        result.push(customer);
      }
    }
    this.customers = result;
    if (result.length === 0 || !key) {
      this.showCustomer();
    }
  }


}
