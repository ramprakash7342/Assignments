// Write an interface Printable. Create 2 objects circle & employee those implement Printable 
// interface. Write a function printAll() that takes all objects as argument & invoke print() 
// method on every object.

interface Printable{

    objectName:String
    quantity:number
}

let circle:Printable={
   objectName:"Circle Object",
   quantity:2

}

let employee:Printable={
   objectName:"Employee Object",
   quantity:10
}

function printAll(obj1:object,obj2:object){
    console.log(obj1);
    console.log(obj2);
}

printAll(circle,employee);
