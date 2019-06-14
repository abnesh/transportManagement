import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { NgForm } from '@angular/forms';

import { User } from '../../shared/models/User';
import { AuthService } from '../../shared/services/auth.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {

  user:User;
  
  constructor(private router:Router,
    private authService:AuthService) { }

  ngOnInit() {
  }

  onSignIn(form: NgForm){
    const email = form.value.email;
    const password = form.value.password;
    this.authService.signInUser(email,password)
      .subscribe(
        (response) => {
          console.log(response);
          if(response['token']){
            this.authService.token = response['token'];
            this.router.navigate(['home']);
          }else {
            console.log('Login failed!');
          }
        });;
  }
}
