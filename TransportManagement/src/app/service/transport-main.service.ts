import { Injectable } from '@angular/core';
import { HttpHeaders, HttpClient } from '../../../node_modules/@angular/common/http';
import { Stop } from '../domain/Stop';
import { RouteMap } from '../domain/RouteMap';
import { RouteMapResult } from '../domain/RouteMapResult';

@Injectable({
  providedIn: 'root'
})

export class TransportMainService {

  routeResults:RouteMapResult[];

  constructor() { }

  displaySearchResult(resultmap: RouteMap[]):any{

    resultmap.forEach(r=>console.log(r.routeid));
  }
  
  printToConsole(arg){
    console.log(arg);
  }
}
