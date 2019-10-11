import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup } from '@angular/forms';
import { Validators } from '@angular/forms';
import { SignupService } from 'src/app/signup.service';
import { Actor } from 'src/app/actor';
import { Trainer } from 'src/app/trainer';
import { Mentorcalender } from 'src/app/mentorcalender';
import { LoginServiceService } from 'src/app/login-service.service';

@Component({
  selector: 'app-mentor-sign-up',
  templateUrl: './mentor-sign-up.component.html',
  styleUrls: ['./mentor-sign-up.component.css']
})
export class MentorSignUpComponent implements OnInit {

  isSuccess = false;
  message = "";
  isFailed = false;
  registerDetails = new FormGroup({
    fullName: new FormControl('', Validators.required),
    email: new FormControl('', [Validators.required,Validators.email]),
    phoneNumber: new FormControl('', Validators.required),
    years: new FormControl('', Validators.required),
    timeSlot1 : new FormControl('', Validators.required),
    timeSlot2 : new FormControl('', Validators.required),
    timeSlot3 : new FormControl('', Validators.required),
    linkdin: new FormControl('', Validators.required),
    password: new FormControl('', Validators.required),
    confirmPassword: new FormControl('', Validators.required)
  });

  constructor(private signupService: SignupService, private loginService: LoginServiceService) { }

  ngOnInit() {
  }

  actor : Actor = new Actor();
  trainer : Trainer = new Trainer();
  tra : Trainer;
  timeSlot1 : Mentorcalender = new Mentorcalender();
  timeSlot2 : Mentorcalender = new Mentorcalender();
  timeSlot3 : Mentorcalender = new Mentorcalender();

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
      this.actor.actorEmail = this.registerDetails.get('email').value;
      this.actor.actorPassword = this.registerDetails.get('password').value;
      this.actor.actorStatus = true;
      this.actor.actorType = "trainer";

      this.trainer.mentorEmail = this.registerDetails.get('email').value;
      this.trainer.mentorName = this.registerDetails.get('fullName').value;
      this.trainer.mentorPhone = this.registerDetails.get('phoneNumber').value;
      this.trainer.mentorYearsExp = this.registerDetails.get('years').value;
      this.trainer.mentorLinkdinUrl = this.registerDetails.get('linkdin').value;
        
      this.trainer.actor = this.actor;
      
      this.createTrainer();
        // if(this.registerDetails.get('timeSlot1').value == true) {
        //   this.timeSlot1.slotStatus = true;
        //   this.timeSlot1.timeSlot = '10:00AM-12:00PM';
        //   this.loginService.getTrainerCred(this.registerDetails.get('email').value).subscribe(data => {
        //     this.tra = data;
        //     console.log(data);
        //     this.timeSlot1.mentorId = Number(this.tra.mentorId);
        //     // this.createCalendar(this.timeSlot1);
        //   })
        // }

      // if(this.registerDetails.get('timeSlot2').value == true) {
      //   // this.timeSlot2.mentorId = Number(this.tra.mentorId);
      //   this.timeSlot2.slotStatus = true;
      //   this.timeSlot2.timeSlot = '02:00PM-04:00PM';
      //   this.createCalendar(this.timeSlot2);
      // }

      // if(this.registerDetails.get('timeSlot3').value == true) {
      //   // this.timeSlot3.mentorId = Number(this.tra.mentorId);
      //   this.timeSlot3.slotStatus = true;
      //   this.timeSlot3.timeSlot = '06:00PM-08:00PM';
      //   this.createCalendar(this.timeSlot3);
      // }

    }
  }

  createTrainer() {
    this.signupService.createTrainer(this.trainer).subscribe(data => console.log(data), error => console.log(error));
  }

  createCalendar(t) {
    this.signupService.createCalender(t).subscribe(data => console.log(data), error => console.log(error));
  }

}
