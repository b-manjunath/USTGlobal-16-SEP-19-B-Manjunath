import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-movie',
  templateUrl: './movie.component.html',
  styleUrls: ['./movie.component.css']
})
export class MovieComponent implements OnInit {
selectedMovie;
  Movies=[{
  name:"Adventure",
  imgUrl:"https://cdn.pixabay.com/photo/2017/06/29/00/10/movie-poster-2452656__340.jpg",
  desc:"Deprived of his mighty hammer Mjolnir, Thor must escape the other side of the universe to save his home, Asgard, from Hela, the goddess of death."
},{
  name:"Charlie chaplin",
  imgUrl:"https://cdn.pixabay.com/photo/2016/03/21/20/01/chaplin-1271422__340.jpg",
  desc:"Sir Charles Spencer Chaplin KBE was an English comic actor, filmmaker, and composer who rose to fame in the era of silent film. He became a worldwide icon through his screen persona, and is considered one of the most important figures in the history of the film industry."
},{
  name:"Captain America",
  imgUrl:"https://cdn.pixabay.com/photo/2019/08/25/06/43/captain-america-4428842__340.jpg",
  desc:"After Steve Rogers decides to volunteer as a guinea pig in an experiment, his weak body is fully enhanced. A secret Nazi organisation tries to exploit the technology and he must stand against them"
},{
  name:"Avatar",
  imgUrl:"https://image.shutterstock.com/image-photo/avatar-woman-magical-forest-260nw-308973533.jpg",
  desc:"Jake, a paraplegic marine, replaces his brother on the Navi inhabited Pandora for a corporate mission. He is accepted by the natives as one of their own but he must decide where his loyalties lie"
},]
  constructor() { }

  ngOnInit() {
  }
  sendMovie(movie)
  {
    console.log(movie);
    this.selectedMovie = movie;
  }
}
