import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl } from '@angular/forms';
import { Router } from '@angular/router';
import { LoginServiceService } from 'src/app/login-service.service';


@Component({
  selector: 'app-home-search',
  templateUrl: './home-search.component.html',
  styleUrls: ['./home-search.component.css']
})
export class HomeSearchComponent implements OnInit {

  searchMentor = new FormGroup({
    searchTechnology : new FormControl(''),
    timeSlot : new FormControl('')
  });

  constructor(private router: Router, private loginService: LoginServiceService) { }

  ngOnInit() {
  }

  search() {
    if(this.searchMentor.get('searchTechnology').value == 'spring' || this.searchMentor.get('searchTechnology').value == 'Spring') {
      this.router.navigate(['/home/search/search-result']);
    }
  }
}
