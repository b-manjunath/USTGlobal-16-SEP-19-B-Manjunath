const message=new Promise(function(resolve,reject){
    if(30>10){
        resolve([{
            name:"billgates",
            age:70
        },{
            name:'manjunath',
            age:22
        },{
            name:'pavan',
            age:20
        }])
    }else{
        reject('failed')
    }
})
message.then(function(msg){
    console.log('success message : ',msg)
}).catch(function(error){
    console.log('failure message : ',error)
})
//closures
function outerfunction(counter){
    function innerfunction(){
        let count;
        count=count + 10;
        return count
    }
    return innerfunction
}
let innerfunc = outerfunction(20)
let counter = innerfunc()
console.log('counter value',counter)