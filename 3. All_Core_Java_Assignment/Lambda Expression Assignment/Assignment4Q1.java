package assingment;

import java.util.Scanner;

@FunctionalInterface
interface Arithmetic{
	double operation(int a,int b);
}
public class Assignment4Q1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter First number");
		int first=sc.nextInt();
		System.out.println("Enter Second number");
		int second=sc.nextInt();
		sc.close();
		Arithmetic addition=(a,b)->a+b;
		Arithmetic subtraction=(a,b)->a-b;
		Arithmetic multiplication=(a,b)->a*b;
		Arithmetic division=(a,b)->{
			if(b==0)return 0;
			return a/b;
		};
		System.out.println("Addition of numbers:  "+addition.operation(first, second));
		System.out.println("Subtraction of numbers:  "+subtraction.operation(first, second));
		System.out.println("Multiplication of numbers:  "+multiplication.operation(first, second));
		System.out.println("Division of numbers:  "+division.operation(first, second));

	}

}
