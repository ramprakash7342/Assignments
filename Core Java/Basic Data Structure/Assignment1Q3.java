package Assignment;
import java.util.*;

class SiCi {
	
    public double simpleInterest(double principalAmount,int time,double interestRate){
    	
    	return ((principalAmount*time*interestRate)/100);
    }
    public double compoundInterest(double principalAmount,int time,double interestRate){
    	double CI=principalAmount*(Math.pow((1+interestRate/100),time))-principalAmount;
    	return CI;
    }
}
public class Assignment1Q3 {

	public static void main(String[] args) {
	 
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Enter the Pricipal Amount");
		double P=sc.nextDouble();
		System.out.print("Enter the Annual rate of interest");
		double R=sc.nextDouble();
		System.out.print("Enter the time of interest");
		int T=sc.nextInt();
		
		SiCi ob=new SiCi();
		System.out.println("simple interest="+ob.simpleInterest(P, T, R));
		System.out.println("compound interest="+ob.compoundInterest(P, T, R));
		
   
	}

}
