import { Component, OnInit, ViewChild } from '@angular/core';
import { User } from '../../shared/models/User';
import { RegistrationService } from '../../shared/services/registration.service';
import { NgForm } from '@angular/forms';
import { ServerMessage } from '../../shared/models/ServerMessage';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {

  user: User;
  serverMessage: ServerMessage;
  @ViewChild('registrationForm') registrationForm: NgForm;

  constructor(private registrationService:RegistrationService) { }

  ngOnInit() {
    this.user = new User();
    this.serverMessage = null;
  }

  onRegister(){
    this.user.firstName = this.registrationForm.value.firstName;
    this.user.lastName = this.registrationForm.value.lastName;
    this.user.email = this.registrationForm.value.email;
    this.user.password = this.registrationForm.value.password;
    // this.user.role = 'ADMIN';
    // this.user.enabled = true; 
    this.registrationService.register(this.user)
      .subscribe(
        (data : ServerMessage) => {
          this.serverMessage = new ServerMessage();
          this.serverMessage.message = data['message'];
          // console.log(this.serverMessage);
      });
  }

}
