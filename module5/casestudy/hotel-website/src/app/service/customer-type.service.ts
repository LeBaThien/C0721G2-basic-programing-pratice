import {Injectable} from '@angular/core';
import {HttpClient} from '@angular/common/http';
import {Observable} from 'rxjs';


@Injectable({
  providedIn: 'root'
})
export class CustomerTypeService {
  private API_URL = 'http://localhost:3000';

  constructor(private http: HttpClient) {
  }

  getAllCustomerType(): Observable<any> {
    return this.http.get<any>(this.API_URL + '/customerType');
  }
}
