let names = ['Tom', 'Ivan', 'Jerry'];
let arrayOfObject=[];

const getNewArray=(arr)=>{
  for(let i=0;i<arr.length;i++)
  arrayOfObject.push({name:arr[i],length:arr[i].length});
}

getNewArray(names);

console.log(arrayOfObject);