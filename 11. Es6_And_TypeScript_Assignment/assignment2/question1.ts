// 1.	Symbols: Write a class that defines next() method to return next number from Fibonacci 
//     series. The class will have a private attributes ‘previousNo’ & ‘currentNo’.
class GetFibo{
    
    public previousNo:number=0;
    public currentNo:number=1;
    public count:number=0;

    public next(){
      if(this.count<=1)
      {   
          return Symbol(this.count++);
      }
      else{
          let temp=this.currentNo+this.previousNo;
            this.previousNo=this.currentNo;
            this.currentNo=temp;
            return Symbol(temp);
      }
    }
}


let obj=new GetFibo();

console.log(obj.next());
console.log(obj.next());
console.log(obj.next());
console.log(obj.next());
console.log(obj.next());
console.log(obj.next());
console.log(obj.next());
console.log(obj.next());
console.log(obj.next());
  
 