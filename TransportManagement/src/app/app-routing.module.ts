import { NgModule } from '@angular/core';
import { RouterModule, Routes } from "@angular/router";

import { HomeComponent } from './tms/home/home.component';
import { ProfileComponent } from './tms/profile/profile.component';
import { ErrorPageComponent } from './tms/error-page/error-page.component';
import { LoginComponent } from './tms/login/login.component';
import { RegisterComponent } from './tms/register/register.component';
import { AuthGuard } from './shared/services/auth-guard.service';
import { TransportMainComponent } from './tms/transport-main/transport-main.component';

const appRoutes:Routes = [
  {path:'',redirectTo:'home',pathMatch:'full'},
  {path:'home', component:HomeComponent},
  {path:'login',component:LoginComponent},
  {path:'register',component:RegisterComponent},
  {path:'profile',component:ProfileComponent},
  {path:'transport',component:TransportMainComponent},
  {path:'not-found', component: ErrorPageComponent, data: {message:'Page Not Found!'} },
  {path:'**', redirectTo:'/not-found'}
];

@NgModule({
  imports: [
    RouterModule.forRoot(appRoutes)
  ],
  exports: [RouterModule]
})
export class AppRoutingModule { }
