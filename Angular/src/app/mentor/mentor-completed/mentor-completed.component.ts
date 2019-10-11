import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { LoginServiceService } from 'src/app/login-service.service';

@Component({
  selector: 'app-mentor-completed',
  templateUrl: './mentor-completed.component.html',
  styleUrls: ['./mentor-completed.component.css']
})
export class MentorCompletedComponent implements OnInit {

  trainingData;

  constructor(private http: HttpClient,
    private loginService: LoginServiceService) { }

  ngOnInit() {
    this.http.get('/assets/mentor-trainings.json').subscribe(trainingdata => {
      this.trainingData = trainingdata;
    });
  }

}
