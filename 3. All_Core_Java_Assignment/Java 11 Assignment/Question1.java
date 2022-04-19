//1. Write a program to calculate the Simple Interest with minimal code using features of
//Java 11.
//Hint: Use the concept of functional interface and Local variable syntax for lambda
//parameters.

package assignment;

@FunctionalInterface
interface SimpleInterest{
	public int si(int p,int r,int t);
}
public class Question1 {

	public static void main(String[] args) {
		SimpleInterest simpleInterest=(p,r,t)->(p*r*t)/100;
		System.out.println("Simple Interest = "+simpleInterest.si(1000, 10, 2));

	}

}
