import { Component, OnInit, Input } from '@angular/core';

@Component({
  selector: 'app-phone',
  templateUrl: './phone.component.html',
  styleUrls: ['./phone.component.css']
})
export class PhoneComponent implements OnInit {
@Input() mobile: { imgUrl: string, name: string};
  constructor() { }

  ngOnInit() {
  }

}
