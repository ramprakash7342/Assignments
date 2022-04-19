// a.Suppose there is a javascript array with 4 elements. Print the value of 3rd element using 
//     array matching.

let array=['firstElement','secondElement','thirdElement','forthElement'];

let [first,second,third,forth]=array;

console.log(third);

// b.Create an organization object having attributes name, address. Write a program to retrieve 
//    pin code of an address using object deep matching.

let organization={
    name:"Monu",
    address:{
        city:"sahaswan",
        pincode:243638
    }
};

let {name:n, address:add}=organization;

console.log(add.pincode);
