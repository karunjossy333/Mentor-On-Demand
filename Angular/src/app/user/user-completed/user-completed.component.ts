import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { LoginServiceService } from 'src/app/login-service.service';

@Component({
  selector: 'app-user-completed',
  templateUrl: './user-completed.component.html',
  styleUrls: ['./user-completed.component.css']
})
export class UserCompletedComponent implements OnInit {

  trainingData;

  constructor(private http: HttpClient,
    private loginService: LoginServiceService) {
    this.http.get('/assets/user-trainings.json').subscribe(trainingdata => {
      this.trainingData = trainingdata;
    });
   }

  ngOnInit() {
  }

}
