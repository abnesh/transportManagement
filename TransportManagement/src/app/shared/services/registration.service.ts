import { Injectable, OnInit } from '@angular/core';
import { User } from '../models/User';
import { HttpClient } from '@angular/common/http';
import { ServerMessage } from '../models/ServerMessage';

@Injectable({
  providedIn: 'root'
})
export class RegistrationService implements OnInit {

  user: User;
  serverMessage: ServerMessage;

  constructor(private httpClient:HttpClient) { }

  ngOnInit(){
    
  }

  register(user:User){
    return this.httpClient.post('/register', user);
  }
}
