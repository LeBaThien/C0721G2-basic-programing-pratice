import { Component, OnInit } from '@angular/core';
import {FormBuilder, FormGroup, Validators} from "@angular/forms";
import {QuestionService} from "../../../service/question.service";
import {Router} from "@angular/router";
import {QuestionTypeService} from "../../../service/question-type.service";
import {BenhAnService} from "../../../service/benh-an.service";

@Component({
  selector: 'app-benh-an-create',
  templateUrl: './benh-an-create.component.html',
  styleUrls: ['./benh-an-create.component.css']
})
export class BenhAnCreateComponent implements OnInit {
  maxDate = new Date();
  minDate = new Date(1990, 0, 1);
  formCreateBenhAn: FormGroup;
  questionTypes = [];

  constructor(
    private benhAnService: BenhAnService,
    private formBuilder: FormBuilder,
    private router: Router,
    private questionTypeService: QuestionTypeService,
  ) {
  }

  ngOnInit(): void {
    this.formCreateBenhAn = this.formBuilder.group({
      maBenhAn: ['', [Validators.required]],
      maBenhNhan: ['', [Validators.required]],
      tenBenhNhan: ['', [Validators.required, Validators.pattern('^[a-zA-z]*$')]],
      ngayNhapVien: ['', [Validators.required]],
      ngayRaVien: ['', [Validators.required]],
      lyDo: ['', [Validators.required]],
      phuongPhap: ['', [Validators.required]],
      bacSi: ['', [Validators.required]],
    });
    // this.questionTypeService.getAllQuestionType().subscribe(data => {
    //   console.log(data);
    //   this.questionTypes = data;
    // });
  }
  addNewBenhAn() {
    this.benhAnService.addNewBenhAn(this.formCreateBenhAn.value).subscribe(data => {
      // console.log(data);
      this.router.navigateByUrl('benh-an-list');
    });
  }


}
