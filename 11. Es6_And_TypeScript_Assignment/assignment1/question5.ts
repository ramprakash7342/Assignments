// a.	Write a add() with default values.
console.log("Part A of Question5");

let defaultAdd=(a=2,b=3,c=4,d=5)=> a+b+c+d;

console.log(defaultAdd());

// b.Write a function userFriends() that takes 2 arguments username & array of user friends.The 
//   function should print username & his list of friends. (Use rest parameters)
console.log("Part B of Question5");

function userFriends(username,...friends){
       
  console.log(username);
  for(let i in friends){
      console.log(friends[i]);
  }

}

let friends=['nitesh','abhishek','vikas','anirban'];
userFriends('ram',friends);

// c.	Write a function printCapitalNames() that takes five names as argument & prints them in 
// capital letters. Use spread operator in order to call printCapitalNames() function.
console.log("Part C of Question5");

function printCapitalNames(...names){

    for(let i in names){
        console.log(names[i].toUpperCase());
    }
}

printCapitalNames('ram','nitesh','abhishek','anirban','vikas');