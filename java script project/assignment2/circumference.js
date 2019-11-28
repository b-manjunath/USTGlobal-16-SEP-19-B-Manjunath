//named function
function circle(rad)
{
    circle=2*22/7*rad;
    console.log('circum = ',circle)
}
//anonymous function
var f=function(rad)
{
    circle=2*22/7*rad;
    console.log('circum = ',circle)    
}
f(10);
circle(10);
//fat arrow function


var circumference4 = n =>{
    console.log('circumference4=',2*Math.PI*n)
}
circumference4(5)
//self invoke function
(circumference3 (n){
    console.log('circumference3 =',2*Math.PI*n)    
})(6)