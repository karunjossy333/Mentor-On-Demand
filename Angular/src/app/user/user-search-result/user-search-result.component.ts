import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-user-search-result',
  templateUrl: './user-search-result.component.html',
  styleUrls: ['./user-search-result.component.css']
})
export class UserSearchResultComponent implements OnInit {

  trainerdata;
  trainerData;

  constructor(private http: HttpClient) { }

  ngOnInit() {
    this.http.get('/assets/trainer-search.json').subscribe(trainerdata => {   
      this.trainerData = trainerdata;
    });
  }

}
