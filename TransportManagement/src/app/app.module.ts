import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpClientModule } from '@angular/common/http';
import {FormsModule} from '@angular/forms';

import {MatDialogModule, MatCardModule, MatButtonModule} from '@angular/material';
import {NoopAnimationsModule} from '@angular/platform-browser/animations';


import { AppComponent } from './app.component';
import { HeaderComponent } from './component/header/header.component';
import { FooterComponent } from './component/footer/footer.component';
import { TransportMainComponent } from './component/transport-main/transport-main.component';
import { TransportMainService } from './service/transport-main.service';
import { TransportSearchResultComponent } from './component/transport-search-result/transport-search-result.component';
import { TransportRegistrationComponent } from './component/transport-registration/transport-registration.component';
import { AppRoutingModule } from './/app-routing.module';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    FooterComponent,
    TransportMainComponent,
    TransportSearchResultComponent,
    TransportRegistrationComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpClientModule,
    MatDialogModule,
    MatCardModule,
    MatButtonModule,
    NoopAnimationsModule,
    AppRoutingModule
  ],
  entryComponents:[
    TransportRegistrationComponent
  ],
  providers: [
    TransportMainService
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
