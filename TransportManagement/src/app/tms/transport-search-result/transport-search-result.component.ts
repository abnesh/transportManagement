import { Component, OnInit, Input } from '@angular/core';
import { RouteMapResult } from '../../shared/models/RouteMapResult';
import { TransportRegistrationComponent } from '../transport-registration/transport-registration.component';
import { MatDialog, MatDialogRef } from '../../../../node_modules/@angular/material';

@Component({
  selector: 'app-transport-search-result',
  templateUrl: './transport-search-result.component.html',
  styleUrls: ['./transport-search-result.component.css']
})
export class TransportSearchResultComponent implements OnInit {

  @Input() routeMappingResults:RouteMapResult[];
          selectedRouteMap:number;
          dialogResult="";

  constructor(private dialog:MatDialog) { }

  ngOnInit() {
    
  }

  book(i:number){
    let dialogRef = this.dialog.open(TransportRegistrationComponent, {
      width: '600px',
      data: this.routeMappingResults[i]
    });

    dialogRef.afterClosed().subscribe(result=>{
      console.log('Dialog closed: ${result}');
      this.dialogResult = result;
    });
  }


}
