const hobbies = ['Sleeping','Cricket','Eating','Coding','Roaming']
console.log(typeof hobbies);
const isArrayOrNot=Array.isArray(hobbies)
console.log('hobbies array or not',isArrayOrNot)
const hasCricket=hobbies.includes('Cricket')
console.log('using includes method',hasCricket)
hobbies.push('guitar','vollyball')
console.log('after push method',hobbies)
hobbies.pop()
console.log('after pop method',hobbies)
hobbies.unshift('Numismatics','Singing')
console.log('after unshift method',hobbies)
hobbies.shift()
console.log('After Shifting method',hobbies)
console.log('========in bitween========')
const hobbies1= ['sleeping','cricket','eating','coding','roaming']
hobbies1.splice(1,0,'bird watching','pubg')
console.log('after splice method',hobbies1)
hobbies1.splice(1,4,'bird watching','pubg')
console.log('after splice method',hobbies1)
const aftersplice = hobbies1.splice(2,4)
console.log('after splice method',hobbies1)
console.log('after splice method',aftersplice)
const indexOfCoding =hobbies1.indexOf('roaming',1)
console.log('index of coding',indexOfCoding)
console.log('=======================')
const numbers = [100,200,300,400]
const nums1 = numbers.map(function(value,index){
let newValue=value + 50
return newValue
})
console.log('after map method',nums1)
console.log('=======================')
const nums2 = numbers.map(value=>value+500)
console.log('after map arrow function',nums2)
console.log('=======================')
const filterNum = numbers.filter(function(value,index){
    if(value>200){
        return true
    }else{
        return false
    }
})
console.log('after filter method',filterNum)
console.log('=======================')
const numbers = [100,200,300,400]
const num3 = numbers.filter(value1=>value1>200)
console.log('after  arrow function',nums3)


       

