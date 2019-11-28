import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-bikes',
  templateUrl: './bikes.component.html',
  styleUrls: ['./bikes.component.css']
})
export class BikesComponent implements OnInit {
selectedBike;
  Bikes=[{
      name: "BMW ",
      imgUrl : "https://cdn.pixabay.com/photo/2016/04/07/06/53/bmw-1313343__340.jpg",
      desc: "The Maruti Swift has 1 Diesel Engine and 1 Petrol Engine on offer. The Diesel engine is 1248 cc while the Petrol engine is 1197 cc. Depending upon the variant and fuel type the Swift has a mileage of 22.0 to 28.4 kmpl. The Swift is a 5 seater Hatchback and has a length of 3840mm."
  },
  {
    name: "Bicycle",
    imgUrl: "https://cdn.pixabay.com/photo/2013/07/13/13/46/bicycle-161524__340.png",
    desc: "The Maruti Swift has 1 Diesel Engine and 1 Petrol Engine on offer. The Diesel engine is 1248 cc while the Petrol engine is 1197 cc. Depending upon the variant and fuel type the Swift has a mileage of 22.0 to 28.4 kmpl. The Swift is a 5 seater Hatchback and has a length of 3840mm."

  },
{
  name: "Royal Enfield",
  imgUrl: "https://cdn.pixabay.com/photo/2016/01/19/16/46/motorcycle-1149389__340.jpg",
  desc: "The Maruti Swift has 1 Diesel Engine and 1 Petrol Engine on offer. The Diesel engine is 1248 cc while the Petrol engine is 1197 cc. Depending upon the variant and fuel type the Swift has a mileage of 22.0 to 28.4 kmpl. The Swift is a 5 seater Hatchback and has a length of 3840mm."

},
{
  name: "Splendor",
  imgUrl: "https://cdn.pixabay.com/photo/2016/03/27/17/59/vintage-1283299__340.jpg",
  desc: "The Maruti Swift has 1 Diesel Engine and 1 Petrol Engine on offer. The Diesel engine is 1248 cc while the Petrol engine is 1197 cc. Depending upon the variant and fuel type the Swift has a mileage of 22.0 to 28.4 kmpl. The Swift is a 5 seater Hatchback and has a length of 3840mm."

}]
  constructor() { }

  ngOnInit() {
  }
  sendBike(bike)
  {
   console.log(bike);
   this.selectedBike = bike;
  }
}
