import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { User } from './user';
import { Trainer } from './trainer';
import { Mentorcalender } from './mentorcalender';

@Injectable({
  providedIn: 'root'
})
export class SignupService {

  private baseUrl = 'http://localhost:8200/api';

  constructor(private http:HttpClient) { }

  createUser(user: User): Observable<Object> {  
    return this.http.post(`${this.baseUrl}`+'/auth/user/signup', user);  
  }

  createTrainer(trainer: Trainer): Observable<Object> {  
    return this.http.post(`${this.baseUrl}`+'/auth/mentor/signup', trainer);  
  }

  createCalender(calendar: Mentorcalender): Observable<Object> {  
    return this.http.post(`${this.baseUrl}`+'/mentor/mentorcalendar/add', calendar);  
  }

}