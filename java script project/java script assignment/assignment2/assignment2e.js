//named function
function array(){
    array=[10,20,30,40]
    sum=0
    for( i=0;i<=array.length-1;i++)
    {
    sum=sum+array[i];
    }
    console.log('sum of elements is = ',sum)
}
array();
//annonymous function
var f= function(){
    array=[10,20,30,40]
    sum=0
    for( i=0;i<=array.length-1;i++)
{
    sum=sum + array[i];
    
}
console.log('sum of elements is= ',sum)
}
f();
//self invoked function
(function array(){
    array=[10,20,30,40]
    for( i=0;i<=array.length-1;i++)
{
    sum=sum+array[i];
}
console.log("sum=",sum);
})()
//fat arrow function
var f=()=>{
array=[10,20,30,40]
sum=0;
for(i=0;i<=array.length-1;i++)
{
    sum=sum+array[i];
}
console.log("sum=",sum);
}
f();