import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { HeaderComponent } from './header/header.component';
import { RouterModule } from '@angular/router';
import { ParentComponent } from './parent/parent.component';
import { ChildComponent } from './child/child.component';
import { MovieComponent } from './movie/movie.component';
import { BikesComponent } from './bikes/bikes.component';
import { MotorComponent } from './motor/motor.component';
import { FilmComponent } from './film/film.component';
import { LappyComponent } from './lappy/lappy.component';
import { MobileComponent } from './mobile/mobile.component';
import { PhoneComponent } from './phone/phone.component';
import { LaptopComponent } from './laptop/laptop.component';


@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    ParentComponent,
    ChildComponent,
    BikesComponent,
    MotorComponent,
    FilmComponent,
    MovieComponent,
    LaptopComponent,
    LappyComponent,
    MobileComponent,
    PhoneComponent
  ],
  imports: [
    BrowserModule,
    RouterModule.forRoot([
      {path:'' , component : HeaderComponent},
      {path:'parent' , component : ParentComponent},
      {path:'child' , component : ChildComponent},
      {path :'bikes',component:BikesComponent},
      {path:'motor',component:MotorComponent},
      {path:'movie', component:MovieComponent},
      {path:'film',component:FilmComponent},
      {path:'laptop',component:LaptopComponent},
      {path: 'lappy',component:LappyComponent},
      {path:'mobile',component:MobileComponent},
      {path:'phone',component:PhoneComponent}
    ])
  ],
providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
