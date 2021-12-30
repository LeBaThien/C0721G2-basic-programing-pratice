import { Injectable } from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';
import {Customer} from '../model/customer';
import {environment} from '../../environments/environment';


// const API_URL = `${environment.apiUrl}`;
@Injectable({
  providedIn: 'root'
})
export class CustomerService {
  private API_URL = 'http://localhost:3000';

  constructor(private http: HttpClient) { }

  getAllCustomer(): Observable<any>{
    return this.http.get<any>(this.API_URL + '/customers');
  }

  saveCustomer(customer): Observable<any> {
    return this.http.post<any>(this.API_URL + '/customers', customer);
  }

  findById(id: number): Observable<any> {
    return this.http.get<any>(`${this.API_URL}/customers/${id}`);
  }

  updateCustomer(id: number, customer: Customer): Observable<any> {
    return this.http.put<any>(`${this.API_URL}/customers/${id}`, customer);
  }

  deleteCustomer(id: number): Observable<any> {
    return this.http.delete<any>(`${this.API_URL}/customers/${id}`);
  }
}
