import {Injectable} from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class CustomertypeService {
  public API = 'http://localhost:8080/api/customerTypes';

  constructor(
    public http: HttpClient
  ) {
  }

  getAllCustomerType(): Observable<any> {
    return this.http.get(this.API);
  }

  addNewwCustomerType(customerType): Observable<any> {
    return this.http.post(this.API, customerType);
  }

  getCustomerTypeById(customerTypeId): Observable<any> {
    return this.http.get(this.API + '/' + customerTypeId);
  }

  deleteCustomerType(customerTypeId): Observable<any> {
    return this.http.delete(this.API + '/' + customerTypeId);
  }

  editCustomerType(customerType, customerTypeId): Observable<any> {
    return this.http.put(this.API + '/' + customerTypeId, customerType);
  }
}
