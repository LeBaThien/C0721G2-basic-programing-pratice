import {Component, OnInit} from '@angular/core';
import {FormGroup, FormBuilder, Validators} from "@angular/forms";
import {EmployeesService} from '../../../service/employees.service';
import {Router} from "@angular/router";

@Component({
  selector: 'app-employee-create',
  templateUrl: './employee-create.component.html',
  styleUrls: ['./employee-create.component.css']
})
export class EmployeeCreateComponent implements OnInit {
  private formCreateEmployee: FormGroup

  constructor(
    private formBuilder: FormBuilder,
    private employeeService: EmployeesService,
    private router: Router
  ) {
  }

  ngOnInit(): void {
    this.formCreateEmployee = this.formBuilder.group({
      name: [''],
      position: [''],
      education: [''],
      division: [''],
      birthDay: [''],
      idCard: [''],
      salary: [''],
      email: [''],
      phone: [''],
      address: [''],
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
