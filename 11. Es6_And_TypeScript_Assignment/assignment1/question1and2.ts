//Q 1.	Constants: Declare a constant & confirm its value cannot be changed.

const a=1;

// Uncomment below line to see this is giving error "Cannot assign to 'a' because it is a constant.ts(2588)"
// so we cannot assign value to constant variable. 

//a=3;

// Q 2.	Scoping: Declare a variable inside if condition & make sure that it is not accessible 
// outside if condition.

if(true){
    let b=2;
}

// Uncomment below line  to see error it is giving "Cannot find name 'b'" so we cannot access the variable 
// out of scope

//console.log(b);

