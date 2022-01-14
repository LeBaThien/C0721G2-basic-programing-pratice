import {Component, OnInit} from '@angular/core';
import {FormBuilder, FormGroup, Validators} from '@angular/forms';
import {CustomerService} from '../../../service/customer.service';
import {Router} from '@angular/router';
import {CustomertypeService} from '../../../service/customertype.service';

@Component({
  selector: 'app-customer-create',
  templateUrl: './customer-create.component.html',
  styleUrls: ['./customer-create.component.css']
})
export class CustomerCreateComponent implements OnInit {
  maxDate = new Date();
  minDate = new Date(1990, 0, 1);
  formCreateCustomer: FormGroup;
  customerTypes = [];

  constructor(
    private customerService: CustomerService,
    private formBuilder: FormBuilder,
    private router: Router,
    private customerTypeService: CustomertypeService,
  ) {
  }

  ngOnInit(): void {
    this.formCreateCustomer = this.formBuilder.group({
      customerCode: ['', [Validators.required]],
      customerName: ['', [Validators.required]],
      dateOfBirth: ['', [Validators.required]],
      customerAddress: ['', [Validators.required]],
      customerPhone: ['', [Validators.required]],
      email: ['', [Validators.required]],
      customerType: ['', [Validators.required]],
    });
    this.customerTypeService.getAllCustomerType().subscribe(data => {
      this.customerTypes = data;
    });
  }

  addNewCustomer() {
    this.customerService.addNewCustomer(this.formCreateCustomer.value).subscribe(data => {
      this.router.navigateByUrl('customer-list');
    });
  }

}
