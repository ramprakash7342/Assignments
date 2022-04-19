// Write an interface Printable. Create 2 objects circle & employee those implement Printable 
// interface. Write a function printAll() that takes all objects as argument & invoke print() 
// method on every object.
var circle = {
    objectName: "Circle Object",
    quantity: 2
};
var employee = {
    objectName: "Employee Object",
    quantity: 10
};
function printAll(obj1, obj2) {
    console.log(obj1);
    console.log(obj2);
}
printAll(circle, employee);
