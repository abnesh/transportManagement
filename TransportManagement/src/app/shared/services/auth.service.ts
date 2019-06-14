import { Injectable } from '@angular/core';
import { HttpHeaders, HttpClient } from '@angular/common/http';
import { User } from '../models/User';
const httpOptions = {
  headers: new HttpHeaders({
    'Content-Type':  'application/json',
    'Access-Control-Allow-Origin':'*'
  })
};

@Injectable({
  providedIn: 'root'
})
export class AuthService {

  token:String;
  user:User = new User();
  constructor(private http:HttpClient) { }

  isAuthenticated(){
    return this.token != null;
  }

  signInUser(email:string, password:string){
    this.user.email = email;
    this.user.password = password;
    return this.http.post('http://localhost:8888/login/',this.user);
  }
}
