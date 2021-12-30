import {Component, OnInit} from '@angular/core';
import {CustomerService} from '../../service/customer.service';
import {MatDialog} from '@angular/material/dialog';

@Component({
  selector: 'app-page-not-found',
  templateUrl: './page-not-found.component.html',
  styleUrls: ['./page-not-found.component.css']
})
export class PageNotFoundComponent implements OnInit {
  customers;
  p = 0;
  term = '';

  constructor(
    private customerService: CustomerService,
    private dialog: MatDialog
  ) {
  }

  ngOnInit(): void {
  }

}
