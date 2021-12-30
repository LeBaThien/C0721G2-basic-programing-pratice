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
  p = 0;
  term = '';
  customers: Customer[];

  private subscription: Subscription | undefined;

  constructor(private customerService: CustomerService) {
  }

  ngOnInit() {
    this.subscription = this.customerService.getAllCustomer().subscribe(data => {
        this.customers = data;
      }, error => {
        console.log(this.customers);
      }
    );
  }

  // openDialog(customerId): void {
  //   this.customerService.findById(customerId).subscribe(dataCustomer => {
  //     const dialogRef = this.dialog.open(CustomerDeleteComponent, {
  //       width: '500px',
  //       data: {data1: dataCustomer},
  //       disableClose: true
  //     });
  //
  //     dialogRef.afterClosed().subscribe(result => {
  //       console.log('The dialog was closed');
  //       //gọi lại hàm, để khi xoa thì đổ lại dữ liệu, dữ liệu sẽ đc cập nhật lại
  //       this.ngOnInit();
  //     });
  //   });
  // }

  // getAll() {
  //   this.customerService.getAll().subscribe(customers => {
  //     this.customers = customers;
  //   });
  // }

}
