const lengths=[150,250,350,450,550,650,750]
console.log(typeof lengths);
lengths.forEach(function(value,index){
    console.log('lengths = ',value);
    console.log('lengths index = ',index);
     })
     console.log('=============')
     const isArrayOrNot=Array.isArray(lengths)
     console.log('lengths array or not',isArrayOrNot)
     console.log('=============')
     const has60=lengths.includes(60)
     console.log('using includes method',has60)
     console.log('=============')
     lengths.push(70,80)
     console.log('after push method',lengths)
     console.log('=============')
     lengths.pop()
     console.log('after pop method',lengths)
     console.log('=============')
     lengths.unshift(60)
     console.log('after unshift method',lengths)
     console.log('=============')
     lengths.shift()
     console.log('After Shifting method',lengths)
     console.log('=============')
     lengths.splice(1,0,100,200)
     console.log('after splice method',lengths)
     lengths.splice(1,4,500,600)
     console.log('after splice method',lengths)
     const aftersplice = lengths.splice(2,4)
     console.log('after splice method',lengths)
     console.log('after splice method',aftersplice)
     console.log('=============')
     const indexOfCoding =lengths.indexOf(300,0)
     console.log('index of coding',indexOfCoding)
     console.log('=======================')
     const nums1 = lengths.map(function(value,index){
         let newValue=value + 50
         return newValue
         })
         console.log('after map method',nums1)
         console.log('=======================')
         const nums2 = lengths.map(value=>value+500)
         console.log('after map arrow function',nums2)
         console.log('=======================')
         const filterNum = lengths.filter(function(value,index){
             if(value>200){
                 return true
             }else{
                 return false
             }
         })
         console.log('after filter method',filterNum)
         console.log('=======================')
         lengths.join(700,800)
         console.log('after join method',lengths)
         console.log('=============')
         
     
