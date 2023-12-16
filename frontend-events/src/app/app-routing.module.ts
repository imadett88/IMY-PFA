import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { EnventsComponent } from './envents/envents.component';
import { HomeComponent } from './home/home.component';
import { AboutComponent } from './about/about.component';
import { ContactComponent } from './contact/contact.component';

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
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
