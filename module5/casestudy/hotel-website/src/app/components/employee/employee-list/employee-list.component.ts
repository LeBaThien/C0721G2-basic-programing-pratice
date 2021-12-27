import {Component, OnInit} from '@angular/core';
import {EmployeesService} from '../../../service/employees.service';
import {MatDialog} from '@angular/material/dialog';
import {EmployeeDeleteComponent} from '../employee-delete/employee-delete.component';

@Component({
  selector: 'app-employee-list',
  templateUrl: './employee-list.component.html',
  styleUrls: ['./employee-list.component.css'],
})
export class EmployeeListComponent implements OnInit {
  employees;
  p = 0;
  term = '';

  constructor(
    public employeeService: EmployeesService,
    public dialog: MatDialog
  ) {
  }

  // data chinh là dữ liệu trả về về, khi gọi hàm, sau đó t đem dât này đi xử lý
  ngOnInit() {
    this.employeeService.getAllEmployees().subscribe(data => {
      this.employees = data;
      console.log(this.employees);
    });
  }

  openDialog(employeeId): void {
    this.employeeService.getEmployeeById(employeeId).subscribe(dataEmployee => {
      const dialogRef = this.dialog.open(EmployeeDeleteComponent, {
        width: '500px',
        data: {data1: dataEmployee},
        disableClose: true
      });

      dialogRef.afterClosed().subscribe(result => {
        console.log('The dialog was closed');
        //gọi lại hàm, để khi xoa thì đổ lại dữ liệu, dữ liệu sẽ đc cập nhật lại
        this.ngOnInit();
      });
    });
  }
}
