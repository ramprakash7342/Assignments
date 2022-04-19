// a.Suppose there is a javascript array with 4 elements. Print the value of 3rd element using 
//     array matching.
var array = ['firstElement', 'secondElement', 'thirdElement', 'forthElement'];
var first = array[0], second = array[1], third = array[2], forth = array[3];
console.log(third);
// b.Create an organization object having attributes name, address. Write a program to retrieve 
//    pin code of an address using object deep matching.
var organization = {
    name: "Monu",
    address: {
        city: "sahaswan",
        pincode: 243638
    }
};
var n = organization.name, add = organization.address;
console.log(add.pincode);
