//1) Write an application that accepts two numbers, divides the first number with the second
//   number and display the result. Hint: You need to handle ArithmeticException which is
//   thrown when there is an attempt to divide a number by zero. 
package assignment;
import java.util.*;

class Exception{
	Scanner sc=new Scanner(System.in);
	int Dividend,Divisior,result;
	public void getInput()
	{
		System.out.println("Enter Dividend");
		Dividend=sc.nextInt();
		System.out.println("Enter Divisior");
		Divisior=sc.nextInt();
	}
	public void getOutput()
	{
		try {
			result=Dividend/Divisior;
		}catch(ArithmeticException ex)
		{
			System.out.println(ex);
		}
		System.out.print("result= "+result);
	}
}
public class Question1 {

	public static void main(String[] args) {
		Exception ex=new Exception();
		ex.getInput();
		ex.getOutput();

	}

}
