import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl } from '@angular/forms';
import { Router } from '@angular/router';

@Component({
  selector: 'app-user-search',
  templateUrl: './user-search.component.html',
  styleUrls: ['./user-search.component.css']
})
export class UserSearchComponent implements OnInit {

  searchMentor = new FormGroup({
    searchTechnology : new FormControl(''),
    timeSlot : new FormControl('')
  });

  constructor(private router: Router) { }

  ngOnInit() {
  }

  search() {
    if(this.searchMentor.get('searchTechnology').value == 'spring' || this.searchMentor.get('searchTechnology').value == 'Spring') {
      this.router.navigate(['/user/search/search-result']);
    }
  }

}
