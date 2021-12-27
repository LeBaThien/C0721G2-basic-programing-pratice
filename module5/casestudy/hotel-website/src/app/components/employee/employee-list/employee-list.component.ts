import {Component, OnInit} from '@angular/core';
import {EmployeesService} from '../../../service/employees.service';

@Component({
  selector: 'app-employee-list',
  templateUrl: './employee-list.component.html',
  styleUrls: ['./employee-list.component.css'],
})
export class EmployeeListComponent implements OnInit {
  public employees;

  constructor(
    public employeeService: EmployeesService
  ) {
  }

  // data chinh là dữ liệu trả về về, khi gọi hàm, sau đó t đem dât này đi xử lý
  ngOnInit() {
    this.employeeService.getAllEmployees().subscribe(data => {
      this.employees = data;
      console.log(this.employees);
    });
  }

}
