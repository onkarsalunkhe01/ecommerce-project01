import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { RegisterComponent } from './register/register.component';
import { LoginpageComponent } from './loginpage/loginpage.component';
import { BannerComponent } from './banner/banner.component';
import { AppComponent } from './app.component';
const routes: Routes = [
  {
    path: 'login',
    component: LoginpageComponent,
    children: [
      {
        path: 'register', // URL will be /login/register
        component: RegisterComponent
      }
      // You can add more child routes here
    ]
  },
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
