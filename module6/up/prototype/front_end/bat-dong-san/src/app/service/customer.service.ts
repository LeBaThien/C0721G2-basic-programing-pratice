import {Injectable} from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class CustomerService {
  public API = 'http://localhost:8080/api/customers';

  constructor(
    public http: HttpClient
  ) {
  }

  pageCustomer(request){
    const params = request;
    return this.http.get(this.API, {params});
  }

  getAllCustomer(): Observable<any> {
    return this.http.get(this.API);
  }

  addNewCustomer(customer): Observable<any> {
    return this.http.post(this.API, customer);
  }

  getCustomerById(customerId): Observable<any> {
    return this.http.get(this.API + '/' + customerId);
  }

  deleteCustomer(customerId): Observable<any> {
    return this.http.delete(this.API + '/' + customerId);
  }

  editCustomer(customer, customerId): Observable<any> {
    return this.http.put(this.API + '/' + customerId, customer);
  }

  getCustomerByPhone(customerPhone): Observable<any> {
    return this.http.get(this.API + '/customerPhone/' + customerPhone);
  }
}
