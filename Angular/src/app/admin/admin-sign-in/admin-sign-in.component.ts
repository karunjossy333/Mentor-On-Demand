import { Component } from '@angular/core';
import { FormControl, FormGroup } from '@angular/forms';
import { LoginServiceService } from '../../login-service.service';
import { Router } from '@angular/router';
import { HttpClient } from '@angular/common/http';
import { Actor } from 'src/app/actor';

@Component({
  selector: 'app-admin-sign-in',
  templateUrl: './admin-sign-in.component.html',
  styleUrls: ['./admin-sign-in.component.css']
})
export class AdminSignInComponent {

  adminData;
  loginFailed = false;
  actor: Actor;

  loginDetails = new FormGroup({
    username: new FormControl(''),
    password: new FormControl('')
  });

  constructor(private loginService: LoginServiceService,
    private router: Router,
    private http: HttpClient) {
      loginService.currentUser = 'admin';
      loginService.userName = 'admin';
      this.http.get('/assets/admin.json').subscribe(admindata => {   
      this.adminData = admindata;
    });
  }

    validateAdminLogIn(){
      this.loginService.getActorCred(this.loginDetails.get('username').value, 'admin').subscribe(data => {
        this.actor = data;
        console.log(this.actor.actorPassword);
        if(this.actor.actorPassword == this.loginDetails.get('password').value) {
          this.router.navigate(['/admin/edit-technology']);
          this.loginService.currentUser = "adminSignedIn";
        } else {
          this.loginFailed = true;
        }
      })
    }
}
