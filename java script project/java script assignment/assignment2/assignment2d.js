//named function
function primenumber1(n){
    if(n>2){
        for(var i=2;i<=n;i++){
            if(n%i==0){
                console.log(n,'is not a prime number')
                return 
            }
        }
    console.log(n,'is prime')    
            }
            else{
                console.log(n,'not prime')
            }
        }
primenumber1(2)
//annonimus function
var primenumber2=function(n){
    if(n>=2){
    for(var i=2;i<n;i++){
        if(n%i==0){
            console.log(n,'is not a prime number')
            return 
        }
    }
console.log(n,'is prime')    
        }
        else{
            console.log(n,'not prime')
        }
    }
    primenumber2(47)
//fat arrow function
var primenumber3=(n)=>{
    if(n>2){
        for(var i=2;i<=n;i++){
            if(n%i==0){
                console.log(n,'is not a prime number')
                return 0;
            }
        }
    console.log(n,'is prime')    
            }
            else{
                console.log(n,'not prime')
            }
        }
primenumber3(11)
//self invoke function
(function (n){
    if(n>2){
        for(var i=2;i<=n;i++){
            if(n%i==0){
                console.log(n,'is not a prime number')
                return 0;
            }
        }
    console.log(n,'is prime');
            }
            else{
                console.log(n,'not prime');
       }
     })
    (10)