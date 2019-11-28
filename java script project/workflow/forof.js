var brands=['bislary','aqua','kinley']
console.log('for of loop')
for(var element of brands){
    console.log('brand = ',element);
}
console.log('===============');
var brands=['bislary','aqua','kinley']
console.log('for in loop');
for(var index of brands){
    console.log('brands = ',index);
}
console.log('===============');
console.log('for in loop for objects');

var person={
    name: 'sundari',
    age: 33,
    color: 'white'
}
for(var key in person){
    console.log('value = ',person[key])
}
console.log('===============');
console.log('for Each loop of array');
 var movies=['sholay','mayabazar','jurassic park','titanic']
 movies.forEach(function(value,index){
console.log('movie = ',value);
console.log('movie index = ',index);
 })
 console.log('===============');
 console.log('for each loop of array');
 var items=[{
     item:'watch',
     id:1,
     price:1000
 },
 {
     item:'shoes',
     id:2,
     price:2000
 },
 {
     item:'bike',
     id:3,
     price:100000
 },
 {
     item:'dress',
     id:4,
     price:3000
 }]
 items.forEach(function(item,index){
     console.log('Item = ',item);
     console.log('Index of item = ',index)
 })
console.log('===============');
var numbers=[10,20,30,40,50]
numbers.forEach(function(value){
    console.log('number',value)
})
console.log('===============');
console.log('does not consider');
var numbers=[10,20,30,40,50]
for(var i=0;i<=numbers.length-1;i++){
    console.log('');
}
console.log('===============');
numbers['hundred']=100;
for(var i=0;i<=numbers.length-1;i++){
    console.log('for loop',numbers[i])
}
console.log('===============');
for(var i in numbers){
console.log('for in loop',numbers[i])
}



