import { Time } from "../../../node_modules/@angular/common";

export class RouteMap{
    id:number;
	routeid:number;
	stopid:number;
	vehicleid:string;
	arrival:Time;
	departure:Time;
	
	constructor() {
        
	}
	
	public getRouteId():number{
		return this.routeid;
	}

	public getStopId():number{
		return this.stopid;
	}
	public getVehicleId():string{
		return this.vehicleid;
	}
	public getArrivalTime():Time{
		return this.arrival;
	}
	public getDepartureTime():Time{
		return this.departure;
	}
}