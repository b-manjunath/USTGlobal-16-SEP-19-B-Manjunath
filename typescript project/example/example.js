function car() {
    console.log("this is audi");
}
car();
console.log('==============');
var persons = /** @class */ (function () {
    function persons(name, age) {
        this.name = name;
        this.age = age;
    }
    return persons;
}());
var persons1 = new persons('manju', 22);
console.log(persons1);
