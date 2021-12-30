import {Component, Inject, OnInit} from '@angular/core';
import {MAT_DIALOG_DATA, MatDialogRef} from "@angular/material/dialog";
import {QuestionService} from "../../../service/question.service";
import {BenhAnService} from "../../../service/benh-an.service";

@Component({
  selector: 'app-benh-an-delete',
  templateUrl: './benh-an-delete.component.html',
  styleUrls: ['./benh-an-delete.component.css']
})
export class BenhAnDeleteComponent implements OnInit {
  public benhAnOfFullName;
  public benhAnOfId;
  constructor(
    public dialogRef: MatDialogRef<BenhAnDeleteComponent>,
    @Inject(MAT_DIALOG_DATA) public data: any,
    private benhAnService: BenhAnService

  ) { }

  ngOnInit(): void {
    this.benhAnOfFullName = this.data.data1.tenBenhNhan;
    this.benhAnOfId = this.data.data1.id;
  }

  deleteBenhAn() {
    this.benhAnService.deleteBenhAn(this.benhAnOfId).subscribe(data =>{
      this.dialogRef.close();
    })
  }
}
