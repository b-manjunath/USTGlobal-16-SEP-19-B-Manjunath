let h1Element = document.getElementById('demo')
console.log('Element = ',h1Element)
console.log('Element Text = ',h1Element.textContent)
h1Element.textContent = 'Good Evening'
console.log('=====================')

let buttonElement=document.createElement('button')
buttonElement.textContent = 'click here !!!!!!!'
console.log('Button Element',buttonElement)

document.body.appendChild(buttonElement);
let ulElement = document.createElement('ul')
let li1Element = document.createElement('li')
let li2Element = document.createElement('li')
let li3Element = document.createElement('li')

li1Element.textContent = 'java'
li2Element.textContent = 'sql'
li3Element.textContent = 'dbms'

ulElement.appendChild(li1Element)
ulElement.appendChild(li2Element)
ulElement.appendChild(li3Element)
document.body.appendChild(ulElement)

h1Element.style.color = 'red'
h1Element.style.fontSize = '30px'

function showMessage(){
    alert('hi hello welcome !!!!!')
}
function changeColor(){
    let pElement = document.getElementById('mover')
    pElement.style.color = 'red'

}
function removeColor(){
let pElement = document.getElementById('mover')
pElement.style.color = 'black'

}
function printHello(){
    //console.log('hello')
    let username = document.getElementById('username').value
    document.getElementById('showusername').textContent=username;
}
let name= 'manjunath'
let age=22
let phoneno=8317588670
console.log('name is '+name + 'age is '+age+ 'phone no is is'+phoneno);
console.log('name is ${name} age is ${age} phone no is $phoneno}')
console.log('2+2=$(2+2)')




