console.log('window object',window);
console.log('this keyword',this);
console.log(this===window)
//window.alert('welcome to javascript class')
//window.alert('welcome to ust global and test yantra')
//let confirmdelete = confirm('are you sure you want to delete')
//console.log('confirm delete',confiremdelete)
let username=prompt('ehat is your name','manjunath')
console.log('user name',username)

const person = {
    firstname:'alia',
    age:25,
    lastname:'kapoor',
    getname:function(){
        return this.firstname + '  ' + this.lastname
    }
}
let fullname=person.getname()
console.log('fullname',fullname)