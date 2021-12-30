import { Component, OnInit } from '@angular/core';
import {FormBuilder, FormGroup, Validators} from "@angular/forms";
import {BenhAnService} from "../../../service/benh-an.service";
import {ActivatedRoute, Router} from "@angular/router";
import {QuestionTypeService} from "../../../service/question-type.service";

@Component({
  selector: 'app-benh-an-edit',
  templateUrl: './benh-an-edit.component.html',
  styleUrls: ['./benh-an-edit.component.css']
})
export class BenhAnEditComponent implements OnInit {

  maxDate = new Date();
  minDate = new Date(1990, 0, 1);
  formEditBenhAn: FormGroup;
  benhAnOfId;

  constructor(
    private benhAnService: BenhAnService,
    private formBuilder: FormBuilder,
    private router: Router,
    private activatedRoute: ActivatedRoute,
  ) {
  }

  ngOnInit(): void {
    this.formEditBenhAn = this.formBuilder.group({
      maBenhAn: ['', [Validators.required]],
      maBenhNhan: ['', [Validators.required]],
      tenBenhNhan: ['', [Validators.required, Validators.pattern('^[a-z A-z]*$')]],
      ngayNhapVien: ['', [Validators.required]],
      ngayRaVien: ['', [Validators.required]],
      lyDo: ['', [Validators.required]],
      phuongPhap: ['', [Validators.required]],
      bacSi: ['', [Validators.required]],
    });
    this.activatedRoute.params.subscribe(data => {
      this.benhAnOfId = data.id;
      this.benhAnService.getBenhAnById(this.benhAnOfId).subscribe(data1 => {
        this.formEditBenhAn.patchValue(data1);
      })
    })

  }
  editBenhAn() {
    this.benhAnService.editBenhAn(this.formEditBenhAn.value, this.benhAnOfId).subscribe(data => {
      // console.log(data);
      this.router.navigateByUrl('benh-an-list');
    });
  }

}
