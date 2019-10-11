import { Component, OnInit } from '@angular/core';
import { LoginServiceService } from 'src/app/login-service.service';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-home-search-result',
  templateUrl: './home-search-result.component.html',
  styleUrls: ['./home-search-result.component.css']
})
export class HomeSearchResultComponent implements OnInit {

  trainerdata;
  trainerData;

  constructor(private loginService: LoginServiceService,
    private http: HttpClient) { }

  ngOnInit() {
    this.http.get('/assets/trainer-search.json').subscribe(trainerdata => {   
      this.trainerData = trainerdata;
    });
  
  }

}
