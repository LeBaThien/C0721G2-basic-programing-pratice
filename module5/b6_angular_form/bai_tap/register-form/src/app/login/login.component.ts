import { Component, OnInit } from '@angular/core';
import {FormControl, FormGroup, NgForm, Validators} from "@angular/forms";
import validate = WebAssembly.validate;

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  // user = {
  //   email: 'thien@gmail',
  //   password: '12345'
  // }
  registerForm = new FormGroup({
    email: new FormControl('',[Validators.required, Validators.pattern("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$")]),
    password: new FormControl('',  [Validators.required, Validators.maxLength(16), Validators.minLength(8)]),
    phone: new FormControl('', [Validators.required, Validators.pattern("^\\+84\\d{9,10}$")]),
    gender: new FormControl('', [Validators.required]),
    age: new FormControl('',[Validators.required, Validators.minLength(18)]),
    address: new FormControl('',[Validators.required]),
    confirm: new FormControl('',[Validators.required]),
  });
  //Cach dung get bat validate
  // get age(){
  //   return this.age.registerForm.get('age');
  // }

  constructor() { }

  ngOnInit(): void {
  }

  // onSubmit(registerForm: NgForm) {
  //   console.log(registerForm.value);
  // }
  onSubmit() {
    console.log(this.registerForm.value)
  }
}
