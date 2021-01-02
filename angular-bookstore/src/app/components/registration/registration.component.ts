import { Component, OnInit } from '@angular/core';
import { User } from 'src/app/common/user';
import { UserRegistrationService } from 'src/app/service/user-registration.service';

@Component({
  selector: 'app-registration',
  templateUrl: './registration.component.html',
  styleUrls: ['./registration.component.css']
})
export class RegistrationComponent implements OnInit {

  user : User = new User("","","","")
  message: any;

  constructor(private service:UserRegistrationService) { }

  ngOnInit(): void {
  }


  public registerNow(){

    let res =  this.service.doRegistration(this.user);
    res.subscribe((data)=>this.message = data);
  }

}
