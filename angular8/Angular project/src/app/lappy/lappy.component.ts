import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-lappy',
  templateUrl: './lappy.component.html',
  styleUrls: ['./lappy.component.css']
})
export class LappyComponent implements OnInit {
selectedLap;
  Laptops=[{
    name:"ASUS ROG Gaming",
    imgUrl:"https://cdn.pixabay.com/photo/2014/09/27/13/44/notebook-463485__340.jpg"
  },
  {  name:"HP pavillion",
  imgUrl:"https://cdn.pixabay.com/photo/2015/07/26/17/29/mixer-861431__340.jpg"
},
{  name:"Apple Macbook Air",
imgUrl:"https://cdn.pixabay.com/photo/2014/05/02/21/49/home-office-336373__340.jpg"
},
{  name:"Toshiba",
imgUrl:"https://d2pa5gi5n2e1an.cloudfront.net/global/images/product/laptops/TOSHIBA_Satellite_Pro_L850/TOSHIBA_Satellite_Pro_L850_L_1.jpg"}]
  constructor() { }

  ngOnInit() {
  }
sendLappy(laptop)
{
  console.log(laptop);
  this.selectedLap = laptop;
}
}
