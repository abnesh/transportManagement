import { Injectable } from '@angular/core';
import { RouteMap } from '../models/RouteMap';
import { RouteMapResult } from '../models/RouteMapResult';

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
