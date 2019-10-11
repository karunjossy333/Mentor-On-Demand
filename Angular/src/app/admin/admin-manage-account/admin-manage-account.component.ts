import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Actor } from 'src/app/actor';
import { User } from 'src/app/user';
import { Trainer } from 'src/app/trainer';
import { ServicesService } from 'src/app/services.service';
import { ResourceLoader } from '@angular/compiler';

@Component({
  selector: 'app-admin-manage-account',
  templateUrl: './admin-manage-account.component.html',
  styleUrls: ['./admin-manage-account.component.css']
})
export class AdminManageAccountComponent implements OnInit {

  mentorData : Trainer[] = [];
  userData : User[] = [];

  constructor(private http: HttpClient, private service: ServicesService) { }

  ngOnInit() {
    this.service.getUsers().subscribe(data => {
      this.userData = data;
      console.log(data);
    })
    this.service.getMentors().subscribe(data => {
      this.mentorData = data;
      console.log(data);
    })   
  }

  block(type: String, name: String, i: Number) {
    this.service.block(type, name).subscribe(data => {
      console.log(data);
      this.ngOnInit();
    })
  }

  unblock(type: String, name: String, i: Number) {
    this.service.unblock(type, name).subscribe(data => {
      console.log(data);
      this.ngOnInit();
    })
  }

  // userblock(i) {
  //   this.userData[i].status = "block";
  // }

  // userunblock(i) {
  //   this.userData[i].status = "unblock";
  // }

  // mentorblock(i) {
  //   this.mentorData[i].status = "block";
  // }

  // mentorunblock(i) {
  //   this.mentorData[i].status = "unblock";
  // }

}
