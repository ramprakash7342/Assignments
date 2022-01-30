//Q5. Calculate the income tax on the basis of following table. 
//
//              Note:-Assume slab is consider for Male, Female as well as Senior citizen
//
//                             Slab           Income Range             Tax payable in Percentage
//
//                             Slab A            0-1,80,000                        Nil
//
//                             Slab B        1,81,001-3,00,000                     10%
//
//                             Slab C        3,00,001-5,00,000                     20%
//
//                             Slab D        5,00,001-10,00,000                    30%     
//
//              Accept CTC from user and display tax amount           

package Assignment;
import java.util.*;
class TaxAmount{
	public int getctc(int ctc)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the CTC of slab");
		ctc=sc.nextInt();
		return ctc;
	}
    public double calculateTaxAmount(int ctc){
    	if(ctc<=180000)
    	{
    		System.out.println("Slab = A");
    		return 0;
    	}
    	else if(ctc<=300000)
    	{
    		System.out.println("Slab = B");
    		return ctc*0.1;
    	}
    	else if(ctc<=500000)
    	{
    		System.out.println("Slab = C");
    		return ctc*0.2;
    	}
    	else 
    	{
    		System.out.println("Slab = D");
    		return ctc*0.3;
    	}
    }
}

public class Assignment1Q5 {

	public static void main(String[] args) {
		
		TaxAmount ta=new TaxAmount();
		int ctc=0;
		ctc=ta.getctc(ctc);
		System.out.print("TaxAmount = "+ta.calculateTaxAmount(ctc));
	}

}
