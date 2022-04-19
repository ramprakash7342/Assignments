package assignment;

//Explanation
//
//   1.   we can use var only for local variables (in methods). 
//   2.   It cannot be used for instance variables (at class level).
//   3.   we cannot use var in Lambda expressions.
//   4.   we cannot use var for method signatures (in return types and parameters).

@FunctionalInterface
interface addition{
	int add(int x,int y);
}

public class Question2 {

	var p=10;    //Giving error "var is not allowed here" above point 2
	
	public void print()
	{
		var q=11;  //No Error above point 1
		System.out.println(q);
	}
	
   public var print2() {              // Giving Compile time error "var is not allowed here"  Above point 3
	   System.out.println("Invalid return type");
   }
   
   public static void main(String[] args) {
	   var output=(a,b)->a+b;   //Giving exception "Lambda expression needs an explicit target-type" above point 2
   }

}
