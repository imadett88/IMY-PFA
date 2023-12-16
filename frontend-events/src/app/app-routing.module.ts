import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { EnventsComponent } from './envents/envents.component';
import { HomeComponent } from './home/home.component';

const routes: Routes = [
  {
    path:"events", component: EnventsComponent
  },
  {
    path:"home", component: HomeComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
