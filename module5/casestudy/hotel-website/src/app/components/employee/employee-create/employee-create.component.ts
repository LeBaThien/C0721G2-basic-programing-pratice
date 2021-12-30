import {Component, OnInit} from '@angular/core';
import {FormGroup, FormBuilder, Validators} from '@angular/forms';
import {EmployeesService} from '../../../service/employees.service';
import {Router} from '@angular/router';

@Component({
  selector: 'app-employee-create',
  templateUrl: './employee-create.component.html',
  styleUrls: ['./employee-create.component.css']
})
export class EmployeeCreateComponent implements OnInit {
  formCreateEmployee: FormGroup;
  maxDate = new Date();
  minDate = new Date(1990, 0, 1);

  constructor(
    private formBuilder: FormBuilder,
    private employeeService: EmployeesService,
    private router: Router
  ) {
  }

  ngOnInit(): void {
    this.formCreateEmployee = this.formBuilder.group({
      name: ['', [Validators.required]],
      position: ['', [Validators.required]],
      education: ['', [Validators.required]],
      division: ['', [Validators.required]],
      birthDay: ['', [Validators.required]],
      idCard: ['', [Validators.required, Validators.pattern('^[0-9]{9}$')]],
      salary: ['', [Validators.required, Validators.pattern('^[0-9]*$')]],
      email: ['', [Validators.required, Validators.email]],
      phone: ['', [Validators.required, Validators.pattern('^(090|091|([\(84[\)][\+]90)|([\(84[\)][\+]91))[0-9]{7}$')]],
      address: ['', [Validators.required]],
    });
  }

  addNewEmployee() {
    this.employeeService.addNewEmployee(this.formCreateEmployee.value).subscribe(data => {
      // console.log(data);
      this.router.navigateByUrl('employee-list');
    });
    // console.log(this.formCreateEmployee.value);
  }
}
