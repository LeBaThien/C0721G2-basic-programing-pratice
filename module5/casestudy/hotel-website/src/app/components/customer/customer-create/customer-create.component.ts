import {Component, OnInit} from '@angular/core';
import {FormBuilder, FormGroup, Validators} from '@angular/forms';
import {CustomerService} from '../../../service/customer.service';
import {Router} from '@angular/router';
import {CustomerType} from '../../../model/customer-type';
import {CustomerTypeService} from '../../../service/customer-type.service';
  import {Subscription} from "rxjs";

@Component({
  selector: 'app-customer-create',
  templateUrl: './customer-create.component.html',
  styleUrls: ['./customer-create.component.css']
})
export class CustomerCreateComponent implements OnInit {
  maxDate = new Date();
  minDate = new Date(1990, 0, 1);
  formCreateCustomer: FormGroup;

  // formCreateCustomer: FormGroup =  new FormGroup({
  //   name: new FormControl(),
  //   birthDay: new FormControl(),
  //   idCard: new FormControl(),
  //   phone: new FormControl(),
  //   email: new FormControl(),
  //   address: new FormControl()
  // });
  customerTypes = [] ;


  constructor(private customerService: CustomerService,
              private formBuilder: FormBuilder,
              private router: Router,
              private customerTypeService: CustomerTypeService,
  ) {
  }

  ngOnInit(): void {
    this.formCreateCustomer = this.formBuilder.group({
      name: ['', [Validators.required]],
      birthDay: ['', [Validators.required]],
      idCard: ['', [Validators.required, Validators.pattern('^[0-9]{9}$')]],
      phone: ['', [Validators.required, Validators.pattern('^(090|091|([\(84[\)][\+]90)|([\(84[\)][\+]91))[0-9]{7}$')]],
      email: ['', [Validators.required, Validators.email]],
      address: ['', [Validators.required]],
      customerType: ['', [Validators.required]],
    });

    this.customerTypeService.getAllCustomerType().subscribe(data => {
        console.log(data);
        this.customerTypes = data;
      });
  }

  addNewCustomer() {
    this.customerService.saveCustomer(this.formCreateCustomer.value).subscribe(data => {
      // console.log(data);
      this.router.navigateByUrl('customer-list');
    });
  }

  // getAllCustomerType() {
  //   // console.log();
  //   return this.customerTypeService.getAllCustomerType().subscribe(data => {
  //     console.log(data);
  //   });
  // }

}
