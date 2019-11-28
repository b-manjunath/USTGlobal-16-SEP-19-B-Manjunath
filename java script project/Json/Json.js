const person = {
    name:'sundara',
    age:100,
    color:'white',
    address:{
        city:'bijapur',
        state:'karnataka',
        pincode:501115
    },
    hobbies : ['coding','bird watching','singing']
}
console.log('javaScript person object',person)
const JSONObject = JSON.stringify(person)
console.log('JSON person object',JSONObject)
const javaScriptPersonObject = JSON.parse(JSONObject)
console.log('javaScript person object after parse',javaScriptPersonObject)
localStorage.setItem('email','billgates@gmail.com')
const emailID = localStorage.getItem('email')
console.log('email id',emailID)
localStorage.clear();