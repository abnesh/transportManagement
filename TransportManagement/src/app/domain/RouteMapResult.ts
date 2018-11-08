import { Time } from "../../../node_modules/@angular/common";

export class RouteMapResult{
    
    routeid:number;
    startPoint:string;
    endPoint:string;
    landmark:string;
    pickUpTime:Time;
    dropTime:Time;
    vacancy:number;
    vehicleid:string;
    isBookable:boolean;

    constructor(){}
}