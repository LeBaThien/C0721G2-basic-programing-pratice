import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs";

@Injectable({
  providedIn: 'root'
})
export class BenhAnService {
  public API = 'http://localhost:8080/api/benhans';
  constructor(
    public http: HttpClient
  ) { }
  getAllBenhAn(): Observable<any> {
    return this.http.get(this.API);
  }

  addNewBenhAn(benhAn): Observable<any> {
    return this.http.post(this.API, benhAn);
  }

  getBenhAnById(benhAnId): Observable<any>{
    return this.http.get(this.API + '/' + benhAnId);
  }
  deleteBenhAn(benhAnId): Observable<any>{
    return this.http.delete(this.API + '/' + benhAnId);
  }
  editBenhAn(benhAn, benhAnId): Observable<any>{
    return this.http.put(this.API + '/' + benhAnId, benhAn);
  }
}
