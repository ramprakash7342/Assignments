package Assignment;
import java.util.*;
class ArmstrongOrNot{
	
	Scanner ob= new Scanner(System.in);
	int a;
	void getInput() {
	System.out.println("Enter a 3 digit number");
	a=ob.nextInt();
	}
	void getOutput() {
		int m=a;
		int s=0;
		while(m>=1)
		{
			int n=m%10;
			s=s+(int)Math.pow(n,3);
			m=m/10;
		}
		if(s==a)
			System.out.print("A Armstrong Number");
		else
			System.out.print("Not a Armstrong Number");
	}
	
}


public class Assignment1Q1 {

	public static void main(String[] args) {
		ArmstrongOrNot arm=new ArmstrongOrNot();
		arm.getInput();
		arm.getOutput();

	}

}







