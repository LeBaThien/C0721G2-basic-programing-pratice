import {Component, OnInit} from '@angular/core';
import {FormControl, FormGroup} from '@angular/forms';
import {CustomerService} from '../../../service/customer.service';
import {ActivatedRoute, ParamMap, Router} from '@angular/router';

@Component({
  selector: 'app-customer-delete',
  templateUrl: './customer-delete.component.html',
  styleUrls: ['./customer-delete.component.css']
})
export class CustomerDeleteComponent implements OnInit {
  customerForm: FormGroup;
  id: number;

  constructor(
    private customerService: CustomerService,
    private router: Router,
    private activateRoute: ActivatedRoute
  ) {
    this.activateRoute.paramMap.subscribe((paramMap: ParamMap) => {
      // dau + o day co tac dung gi
      this.id = +paramMap.get('id');
      this.getCustomer(this.id);
    });
  }

  ngOnInit(): void {
  }

  getCustomer(id: number) {
    return this.customerService.findById(id).subscribe(customer => {
      this.customerForm = new FormGroup({
        name: new FormControl(customer.name),
      });
    });
  }

  deleteCustomer(id: number) {
    this.customerService.deleteCustomer(id).subscribe(() => {
      this.router.navigate(['/customer/list']);
    }, e => {
      console.log(e);
    });
  }

}
