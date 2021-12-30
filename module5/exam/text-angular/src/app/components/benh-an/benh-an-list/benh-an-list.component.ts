import { Component, OnInit } from '@angular/core';
import {Subscription} from "rxjs";
import {BenhAn} from "../../../model/benh-an";
import {MatDialog} from "@angular/material/dialog";
import {BenhAnService} from "../../../service/benh-an.service";
import {BenhAnDeleteComponent} from "../benh-an-delete/benh-an-delete.component";

@Component({
  selector: 'app-benh-an-list',
  templateUrl: './benh-an-list.component.html',
  styleUrls: ['./benh-an-list.component.css']
})
export class BenhAnListComponent implements OnInit {
  p = 0;
  term = '';
  benhAns: BenhAn[];
  private subscription: Subscription | undefined;
  constructor(
    private benhAnService: BenhAnService,
    private dialog: MatDialog

  ) { }

  ngOnInit() {
    this.subscription = this.benhAnService.getAllBenhAn().subscribe(data => {
        this.benhAns = data;
      }, error => {
        console.log(this.benhAns);
      }
    );
  }

  openDialog(benhAnId) {
    this.benhAnService.getBenhAnById(benhAnId).subscribe(data => {
      const dialogRef = this.dialog.open(BenhAnDeleteComponent, {
        width: '500px',
        data: {data1: data},
        disableClose: true
      });

      dialogRef.afterClosed().subscribe(result => {
        console.log('The dialog was closed');
        this.ngOnInit();
      });
    });
  }

}
