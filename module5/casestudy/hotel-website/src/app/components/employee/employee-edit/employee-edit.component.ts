import {Component, OnInit} from '@angular/core';
import {FormGroup, FormBuilder, Validators} from '@angular/forms';
import {EmployeesService} from '../../../service/employees.service';
import {Router, ActivatedRoute} from '@angular/router';

@Component({
  selector: 'app-employee-edit',
  templateUrl: './employee-edit.component.html',
  styleUrls: ['./employee-edit.component.css']
})
export class EmployeeEditComponent implements OnInit {

  formEditEmployee: FormGroup;
  maxDate = new Date();
  minDate = new Date(1990, 0, 1);
  employeeOfId;

  constructor(
    private formBuilder: FormBuilder,
    private employeeService: EmployeesService,
    private router: Router,
    private activatedRoute: ActivatedRoute
  ) {
  }

  ngOnInit(): void {
    this.formEditEmployee = this.formBuilder.group({
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

    this.activatedRoute.params.subscribe(data => {
      this.employeeOfId = data.id;
      this.employeeService.getEmployeeById(this.employeeOfId).subscribe(data1 => {
        this.formEditEmployee.patchValue(data1);
      });
    });
  }

  editEmployee() {
    this.employeeService.editEmployee(this.formEditEmployee.value, this.employeeOfId).subscribe(data2 => {
      this.router.navigateByUrl('employee-list');
    });
  }
}
