import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { EnventsComponent } from './envents/envents.component';

const routes: Routes = [
  {
    path:"events", component: EnventsComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
