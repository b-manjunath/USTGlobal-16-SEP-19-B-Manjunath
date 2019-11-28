import { Component, OnInit,Input } from '@angular/core';

@Component({
  selector: 'app-motor',
  templateUrl: './motor.component.html',
  styleUrls: ['./motor.component.css']
})
export class MotorComponent implements OnInit {
@Input() bike:{ imgUrl: string , name: string}
  constructor() { }

  ngOnInit() {
  }

}
