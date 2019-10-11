import { Component} from '@angular/core';
import { LoginServiceService } from '../login-service.service';

@Component({
  selector: 'app-footer',
  templateUrl: './footer.component.html',
  styleUrls: ['./footer.component.css']
})
export class FooterComponent{

  constructor(private loginService: LoginServiceService) { }
  
  website="MentorOnDemand.com";

}
