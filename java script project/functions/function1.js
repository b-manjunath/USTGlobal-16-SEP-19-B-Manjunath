//Named Functions
function add(num1,num2)
{
    console.log('sum= ',num1+num2);
}
add(10,20);
function sub(num1,num2)
{
    console.log('sub=',num1-num2);
}
sub(20,10);
//fat arrow function
var add=(num1,num2)=>{
    console.log('value= ',num1+num2);
}
add(10,20);
var add=num1=>{
    console.log('value= ',num1);
}
add(10);

greets('dinga');
var greets=(msg)=>{
    console.log('hi',msg);
}

