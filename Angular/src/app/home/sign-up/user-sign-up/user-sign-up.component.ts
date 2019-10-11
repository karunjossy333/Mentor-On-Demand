import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup } from '@angular/forms';
import { Validators } from '@angular/forms';
import { SignupService } from '../../../signup.service';
import { Actor } from 'src/app/actor';
import { User } from 'src/app/user';

@Component({
  selector: 'app-user-sign-up',
  templateUrl: './user-sign-up.component.html',
  styleUrls: ['./user-sign-up.component.css']
})
export class UserSignUpComponent implements OnInit {

  isSuccess = false;
  message = "";
  isFailed = false;
  registerDetails = new FormGroup({
    fullName: new FormControl('', Validators.required),
    email: new FormControl('', [Validators.required,Validators.email]),
    phoneNumber: new FormControl('', Validators.required),
    password: new FormControl('', Validators.required),
    confirmPassword: new FormControl('', Validators.required)
  });

  constructor(private signupService: SignupService) { }

  userActor : Actor = new Actor();
  user : User = new User();


  ngOnInit() {
  }

  register() {
    if(this.registerDetails.get('fullName').value == '') {
      this.message = "Name Required !!!!";
      this.isFailed = true;
      this.isSuccess = false;
    } else if(this.registerDetails.get('email').value == '') {
      this.message = "Email Required !!!!";
      this.isFailed = true;
      this.isSuccess = false;
    } else if(this.registerDetails.get('phoneNumber').value == '') {
      this.message = "Phone Number Required !!!!";
      this.isFailed = true;
      this.isSuccess = false;
    } else if(this.registerDetails.get('password').value == '') {
      this.message = "Password cannot be empty !!!!";
      this.isFailed = true;
      this.isSuccess = false;
    } else if(this.registerDetails.get('password').value == this.registerDetails.get('confirmPassword').value) {
      this.isSuccess = true;
      this.isFailed = false;
    } else {
      this.message = "Password doesn't Match !!!!";
      this.isFailed = true;
      this.isSuccess = false;
    }
    if(this.isSuccess == true) {
      this.userActor.actorEmail = this.registerDetails.get('email').value;
      this.userActor.actorPassword = this.registerDetails.get('password').value;
      this.userActor.actorStatus = true;
      this.userActor.actorType = "trainee";

      this.user.userEmail = this.registerDetails.get('email').value;
      this.user.userName = this.registerDetails.get('fullName').value;
      this.user.userPhone = this.registerDetails.get('phoneNumber').value;
      this.user.actor = this.userActor;

      this.createUser();
    }
  }

  createUser() {
    this.signupService.createUser(this.user).subscribe(data => console.log(data), error => console.log(error));
  }

}
