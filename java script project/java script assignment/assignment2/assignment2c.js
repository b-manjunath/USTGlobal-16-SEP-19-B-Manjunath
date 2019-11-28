//1.Named function
function circumference1(n){
    console.log('circumference1 = ',2*Math.PI*n)
}
circumference1(2)
//2.anonymous function
var circumference2 = function(n){
    console.log('circumference2 = ',2*Math.PI*n)
}
circumference2(4);
//3.self invoked function
(function (n){
    console.log('circumference3 = ',2*Math.PI*n)
})(6)
//4.fat arrow function
var circumference4 = n =>{
    console.log('circumference4 = ',2*Math.PI*n)
}
circumference4(7);

