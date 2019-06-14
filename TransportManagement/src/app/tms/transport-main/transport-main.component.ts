import { Component, OnInit } from '@angular/core';
import { RouteMap } from '../../shared/models/RouteMap';
import { Stop } from '../../shared/models/Stop';
import { TransportMainService } from '../../shared/services/transport-main.service';
import { HttpClient, HttpHeaders } from '../../../../node_modules/@angular/common/http';
import { RouteMapResult } from '../../shared/models/RouteMapResult';

const httpOptions = {
  headers: new HttpHeaders({
    'Content-Type':  'application/json',
    'Authorization': 'Bearer '
  })
};

@Component({
  selector: 'app-transport-main',
  templateUrl: './transport-main.component.html',
  styleUrls: ['./transport-main.component.css']
})
export class TransportMainComponent implements OnInit {

  searchResult:Array<RouteMap>;
  fromList:Stop[];
  toList:Stop[];
  routeResults:RouteMapResult[];
  startPoint:number;
  endPoint:number;


  constructor(private transportService:TransportMainService, private http:HttpClient) { 
    
  }

  ngOnInit() {
    // httpOptions.headers['Authorization'] = 
    this.http.get<Stop[]>('http://localhost:8082/v1/transport/stops',{

    })
    .subscribe((response)=> {
      this.fromList = response;
      console.log(response);
    });

    this.http.get<Stop[]>('http://localhost:8082/v1/transport/stops',httpOptions)
    .subscribe((response)=> {
      console.log(response);
      this.toList = response;
    });
    
  }

  search(){
    this.http.get<RouteMapResult[]>('http://localhost:8080/api/transport/transport/routes/search?startPoint='+
        this.startPoint+'&endPoint='+this.endPoint,httpOptions)
        .subscribe(response=> {this.routeResults = response;
          console.log(response);
          document.getElementById("search-result").scrollIntoView();
    });
  }

  book(){

  }

}
