import { Component, OnInit } from '@angular/core';
import { LoginServiceService } from '../login-service.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-admin',
  templateUrl: './admin.component.html',
  styleUrls: ['./admin.component.css']
})
export class AdminComponent {

  constructor(private loginService: LoginServiceService, private router: Router) { this.loginService.currentUser = 'admin';
    this.router.navigate(['/admin/sign-in'])}
  
}
