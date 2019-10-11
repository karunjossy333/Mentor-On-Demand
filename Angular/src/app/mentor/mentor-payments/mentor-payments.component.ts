import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { LoginServiceService } from 'src/app/login-service.service';

@Component({
  selector: 'app-mentor-payments',
  templateUrl: './mentor-payments.component.html',
  styleUrls: ['./mentor-payments.component.css']
})
export class MentorPaymentsComponent implements OnInit {

  paymentData;

  constructor(private http: HttpClient,
    private loginService: LoginServiceService) { }

  ngOnInit() {
    this.http.get('/assets/payments.json').subscribe(data => {
      this.paymentData = data;
    });
  }

}
