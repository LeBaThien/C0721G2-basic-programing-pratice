import { Injectable } from '@angular/core';
import {Observable} from "rxjs";
import {HttpClient} from "@angular/common/http";

@Injectable({
  providedIn: 'root'
})
export class QuestionTypeService {
  public API = 'http://localhost:3000/questionTypes';
  constructor(
    public http: HttpClient
  ) { }

  getAllQuestionType(): Observable<any> {
    return this.http.get(this.API);
  }

  addNewQuestionType(questionType): Observable<any> {
    return this.http.post(this.API, questionType);
  }

  getQuestionTypeById(questionTypeId): Observable<any>{
    return this.http.get(this.API + '/' + questionTypeId);
  }
  deleteQuestionType(questionTypeId): Observable<any>{
    return this.http.delete(this.API + '/' + questionTypeId);
  }
  editQuestionType(questionType, questionTypeId): Observable<any>{
    return this.http.put(this.API + '/' + questionTypeId, questionType);
  }
}
