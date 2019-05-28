import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpClientModule } from '@angular/common/http';
import {FormsModule} from '@angular/forms';

import {MatDialogModule, MatCardModule, MatButtonModule} from '@angular/material';
import {NoopAnimationsModule} from '@angular/platform-browser/animations';


import { AppComponent } from './app.component';
import { HeaderComponent } from './tms/header/header.component';
import { FooterComponent } from './tms/footer/footer.component';
import { TransportMainComponent } from './tms/transport-main/transport-main.component';
import { TransportMainService } from './shared/services/transport-main.service';
import { TransportSearchResultComponent } from './tms/transport-search-result/transport-search-result.component';
import { TransportRegistrationComponent } from './tms/transport-registration/transport-registration.component';
import { AppRoutingModule } from './/app-routing.module';
import { HomeComponent } from './tms/home/home.component';
import { ProfileComponent } from './tms/profile/profile.component';
import { ErrorPageComponent } from './tms/error-page/error-page.component';
import { LoginComponent } from './tms/login/login.component';
import { RegisterComponent } from './tms/register/register.component';
import { HttpModule } from '@angular/http';
import { AuthService } from './shared/services/auth.service';
import { AuthGuard } from './shared/services/auth-guard.service';
import { RouteRegistrationDetailsComponent } from './tms/route-registration-details/route-registration-details.component';
import { FaqComponent } from './tms/faq/faq.component';
import { RouteDriverDetailsComponent } from './tms/route-driver-details/route-driver-details.component';

@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    FooterComponent,
    TransportMainComponent,
    TransportSearchResultComponent,
    TransportRegistrationComponent,
    HomeComponent,
    ProfileComponent,
    ErrorPageComponent,
    LoginComponent,
    RegisterComponent,
    RouteRegistrationDetailsComponent,
    FaqComponent,
    RouteDriverDetailsComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpClientModule,
    HttpModule,
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
    TransportMainService,
    AuthService,
    AuthGuard
  ],
  bootstrap: [AppComponent]
})
export class AppModule { }
