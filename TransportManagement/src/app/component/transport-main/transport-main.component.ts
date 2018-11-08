import { Component, OnInit } from '@angular/core';
import { RouteMap } from '../../domain/RouteMap';
import { Stop } from '../../domain/Stop';
import { TransportMainService } from '../../service/transport-main.service';
import { HttpClient, HttpHeaders } from '../../../../node_modules/@angular/common/http';
import { RouteMapResult } from '../../domain/RouteMapResult';

const httpOptions = {
  headers: new HttpHeaders({
    'Content-Type':  'application/json',
    'Access-Control-Allow-Origin':'*'
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
    this.http.get<Stop[]>('http://localhost:8080/api/transport/transport/stops',httpOptions)
    .subscribe((response)=> this.fromList = response);

    this.http.get<Stop[]>('http://localhost:8080/api/transport/transport/stops',httpOptions)
    .subscribe((response)=> this.toList = response);
    
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
