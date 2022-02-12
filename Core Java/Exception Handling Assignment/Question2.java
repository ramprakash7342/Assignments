//1) Write an application that accepts two numbers, divides the first number with the second
//    number and display the result. Hint: You need to handle ArithmeticException which is
//    thrown when there is an attempt to divide a number by zero.
//2) Carrying forward with the above problem, handle ArithmeticException by raising
//UnsupportedOperationException as a solution. 

package assignment;
import java.util.*;

class Exception1{
	Scanner sc=new Scanner(System.in);
	int Dividend,Divisor,result;
	public void getInput()
	{
		System.out.println("Enter Dividend");
		Dividend=sc.nextInt();
		System.out.println("Enter Divisor");
		Divisor=sc.nextInt();
	}
	public void getOutput()
	{
		
		  try {
			  if(Divisor==0)
			 throw new UnsupportedOperationException();
			
				System.out.print("Result = "+(Dividend/Divisor));
				
			}catch(UnsupportedOperationException ex)
			{
				System.out.println("UnsupportedOperationException: Divisor can not be 0");
			}
			finally {
				sc.close();
			}
		
	}
}
public class Question2 {

	public static void main(String[] args) {
		Exception1 ex=new Exception1();
		ex.getInput();
		ex.getOutput();

	}

}
