import { Component, OnInit } from '@angular/core';
import { LoginServiceService } from '../login-service.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-home-nav-bar',
  templateUrl: './home-nav-bar.component.html',
  styleUrls: ['./home-nav-bar.component.css']
})
export class HomeNavBarComponent implements OnInit {

  constructor(private loginService: LoginServiceService,
    private router: Router ) {}

  ngOnInit() {
  }

  title="Mentor On Demand";
  navLink1="Home";
  user="Guest User";

  logOut() {
    this.loginService.currentUser='guest';
    this.loginService.userName='Guest User';
    this.router.navigate(['/home']);
  }

}
