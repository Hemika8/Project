import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { SellerloginComponent } from './sellerlogin/sellerlogin.component';

const routes: Routes = [ { path: 'signup', component: SellerloginComponent  }];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]

})
export class AppRoutingModule { }
