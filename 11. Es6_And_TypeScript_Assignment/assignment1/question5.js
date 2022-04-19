// a.	Write a add() with default values.
console.log("Part A of Question5");
var defaultAdd = function (a, b, c, d) {
    if (a === void 0) { a = 2; }
    if (b === void 0) { b = 3; }
    if (c === void 0) { c = 4; }
    if (d === void 0) { d = 5; }
    return a + b + c + d;
};
console.log(defaultAdd());
// b.Write a function userFriends() that takes 2 arguments username & array of user friends.The 
//   function should print username & his list of friends. (Use rest parameters)
console.log("Part B of Question5");
function userFriends(username) {
    var friends = [];
    for (var _i = 1; _i < arguments.length; _i++) {
        friends[_i - 1] = arguments[_i];
    }
    console.log(username);
    for (var i in friends) {
        console.log(friends[i]);
    }
}
var friends = ['nitesh', 'abhishek', 'vikas', 'anirban'];
userFriends('ram', friends);
// c.	Write a function printCapitalNames() that takes five names as argument & prints them in 
// capital letters. Use spread operator in order to call printCapitalNames() function.
console.log("Part C of Question5");
function printCapitalNames() {
    var names = [];
    for (var _i = 0; _i < arguments.length; _i++) {
        names[_i] = arguments[_i];
    }
    for (var i in names) {
        console.log(names[i].toUpperCase());
    }
}
printCapitalNames('ram', 'nitesh', 'abhishek', 'anirban', 'vikas');
