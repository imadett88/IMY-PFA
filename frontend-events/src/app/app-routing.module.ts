import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { EnventsComponent } from './envents/envents.component';
import { HomeComponent } from './home/home.component';
import { AboutComponent } from './about/about.component';
import { ContactComponent } from './contact/contact.component';
import { PaymentComponent } from './payment/payment.component';
import { ServicesComponent } from './services/services.component';

const routes: Routes = [
  {
    path:"events", component: EnventsComponent
  },
  {
    path:"home", component: HomeComponent
  },
  {
    path:"about", component: AboutComponent
  },
  {
    path:"contact", component: ContactComponent
  },
  {
    path:"payment", component: PaymentComponent
  },
  {
    path: "services", component: ServicesComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
