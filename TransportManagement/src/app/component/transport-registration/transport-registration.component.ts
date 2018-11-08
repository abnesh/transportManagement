import { Component, OnInit, Inject } from '@angular/core';
import { MatDialogRef } from '../../../../node_modules/@angular/material';

import {MAT_DIALOG_DATA} from '@angular/material';
import { HttpClient, HttpHeaders } from '../../../../node_modules/@angular/common/http';
import { Employee } from '../../domain/Employee';
import { EmployeeRegistration } from '../../domain/EmployeeRegistration';
import { RouteMapResult } from '../../domain/RouteMapResult';

const httpOptions = {
  headers: new HttpHeaders({
    'Content-Type':  'application/json',
    'Access-Control-Allow-Origin':'*'
  })
};

@Component({
  selector: 'app-transport-registration',
  templateUrl: './transport-registration.component.html',
  styleUrls: ['./transport-registration.component.css']
})
export class TransportRegistrationComponent implements OnInit {

  empId:number;
  emp:Employee;
  empToRegister:EmployeeRegistration = new EmployeeRegistration;
  empSearched:boolean = false;

  constructor(public dialogRef:MatDialogRef<TransportRegistrationComponent>,
       @Inject(MAT_DIALOG_DATA) public data:RouteMapResult,
      public http:HttpClient) { }

  ngOnInit() {
  }

  onCloseConfirm(){
  //Perform whether the employee exists or not
      if(typeof this.empId !== undefined){
        this.http.get<Employee>('http://localhost:8080/api/employee/'+this.empId,httpOptions)
        .subscribe((response)=> {this.emp = response;
          document.getElementById('employeeid').className='border border-success';
          this.empSearched = true;
          console.log(response);
        });
      }
      this.empSearched = false;
      document.getElementById('employeeid').className='border border-danger';
  }

  onCloseSubmit(){
    //Insert data into employee registration table
    if(typeof this.emp !== undefined){
      this.empToRegister.employeeId = this.emp.id;
      this.empToRegister.vehicleId = this.data.vehicleid;
      this.http.post('http://localhost:8080/api/transport/register',this.emp,httpOptions);

      this.dialogRef.close('Hi ' + this.emp.name + '! You have successfully registered for Route: ' + this.data.routeid
      + '.You will receive confirmation notification shortly.');
    }
  }

  onCloseCancel(){
    this.dialogRef.close('Cancel');
  }

}
