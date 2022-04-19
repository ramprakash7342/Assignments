// Draft a ticket to Sysnet that describes problem with your laptop. Use ‘template literals’ to 
//   add value of laptop model, your desk no, your name etc.
var laptopModel = "HP 245 G5";
var myName = "Ram Prakash";
var deskNo = "21";
var problemStatement = "I am ".concat(myName, " . My desk no is ").concat(deskNo, ". I have ").concat(laptopModel, " laptop and it is very slow in processing");
console.log(problemStatement);
