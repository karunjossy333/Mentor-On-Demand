import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Actor } from './actor';
import { User } from './user';
import { Trainer } from './trainer';

@Injectable({
  providedIn: 'root'
})
export class LoginServiceService {

  constructor(private http:HttpClient) { }

  private baseUrl = 'http://localhost:8200/api/auth/';

  isLoggedIn = false;
  currentUser = 'guest';
  userName : String = 'Guest User';

  getActorCred(userName:String, accountType:String): Observable<Actor>{
    return this.http.get<Actor>(`${this.baseUrl}`+'actordetails/'+ accountType + '/' + userName);  
  }

  getUserCred(userName:String): Observable<User>{
    return this.http.get<User>(`${this.baseUrl}`+'user/details/'+userName);  
  }

  getTrainerCred(userName:String): Observable<Trainer>{
    return this.http.get<Trainer>(`${this.baseUrl}`+'mentor/details/'+userName);  
  }

  userLogin(name) {
    this.currentUser = 'user';
    this.userName = name;
    return false;
  }

  mentorLogin(name) {
    this.currentUser = 'mentor';
    this.userName = name;
    return false;
  }

  logOut() {
    this.currentUser = 'guest';
    this.userName = 'Guest User';
    return false;
  }

  getUserName() {
    return this.userName;
  }

}
