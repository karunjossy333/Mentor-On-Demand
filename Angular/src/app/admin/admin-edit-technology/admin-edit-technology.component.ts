import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { ServicesService } from 'src/app/services.service';
import { Technology } from 'src/app/technology';
import { FormGroup, FormControl } from '@angular/forms';

@Component({
  selector: 'app-admin-edit-technology',
  templateUrl: './admin-edit-technology.component.html',
  styleUrls: ['./admin-edit-technology.component.css']
})
export class AdminEditTechnologyComponent implements OnInit {

  tech: Technology = new Technology();
  technologyData: Technology[] = [];
  details = new FormGroup({
    name: new FormControl(''),
    fee: new FormControl(''),
    commission: new FormControl('')
  });

  constructor(private http: HttpClient, private service : ServicesService) { }

  ngOnInit() {
    this.service.getTechnologies().subscribe(data => {
      this.technologyData = data;
      console.log(data);
    })
  }

  delete(id: Number) {
    console.log(id);
    this.service.deleteTechnologies(id).subscribe(data => {
      this.ngOnInit();
    })    
  }

  add() {
    this.tech.techCommission = this.details.get('commission').value;
    this.tech.techFee = this.details.get('fee').value;
    this.tech.techName = this.details.get('name').value;
    this.service.addTechnologies(this.tech).subscribe(data => {
      console.log(data);
      this.ngOnInit();
    })
  }

}
