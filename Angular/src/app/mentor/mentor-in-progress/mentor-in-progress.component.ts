import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl } from '@angular/forms';
import { Router } from '@angular/router';

@Component({
  selector: 'app-mentor-in-progress',
  templateUrl: './mentor-in-progress.component.html',
  styleUrls: ['./mentor-in-progress.component.css']
})
export class MentorInProgressComponent implements OnInit {

  searchTechnology = new FormGroup({
    technology : new FormControl('')
  });

  constructor(private router: Router) { }

  ngOnInit() {
  }

  search() {
    if(this.searchTechnology.get('technology').value == 'spring' || this.searchTechnology.get('technology').value == 'Spring') {
      this.router.navigate(['/mentor/in-progress/result']);
    }
  }

}
