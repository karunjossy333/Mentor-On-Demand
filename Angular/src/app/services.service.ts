import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { User } from './user';
import { Trainer } from './trainer';
import { Technology } from './technology';

@Injectable({
  providedIn: 'root'
})
export class ServicesService {

  private baseUrl = 'http://localhost:8200/api/';

  constructor(private http: HttpClient) { }

  getUsers() {
    return this.http.get<User[]>(`${this.baseUrl}`+'admin/getusers');
  }

  getMentors() {
    return this.http.get<Trainer[]>(`${this.baseUrl}`+'admin/getmentors');
  }

  block(type: String, name: String) {
    return this.http.get<Boolean>(`${this.baseUrl}`+'admin/block/' + type + '/' + name);
  }

  unblock(type: String, name: String) {
    return this.http.get<Boolean>(`${this.baseUrl}`+'admin/unblock/' + type + '/' + name);
  }

  getTechnologies() {
    return this.http.get<Technology[]>(`${this.baseUrl}`+'admin/get-technologies');
  }

  getMentorTechnologies() {
    return this.http.get<Technology[]>(`${this.baseUrl}`+'mentor/get-technologies');
  }

  addTechnologies(tech: Technology) {
    return this.http.post(`${this.baseUrl}`+'admin/add-technologies', tech);
  }

  deleteTechnologies(id: Number) {
    return this.http.get(`${this.baseUrl}`+'admin/delete-technologies/' + id);
  }
}
