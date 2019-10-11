import { Component, OnInit } from '@angular/core';
import { Technology } from 'src/app/technology';
import { ServicesService } from 'src/app/services.service';

@Component({
  selector: 'app-mentor-edit-skill',
  templateUrl: './mentor-edit-skill.component.html',
  styleUrls: ['./mentor-edit-skill.component.css']
})
export class MentorEditSkillComponent implements OnInit {

  tech : Technology[] = [];
  constructor(private service: ServicesService) { }

  ngOnInit() {
    this.service.getMentorTechnologies().subscribe(data => {
      this.tech = data;
      console.log(data);
    })
  }

}
