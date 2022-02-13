//Q3. Write a program to consider saving & current account in the bank. Saving account holder has ‘Fixed Deposits’ whereas Current account holder has 
//    cash credit. Apply polymorphism to find out total cash in the bank.

package assignment;
import java.util.*;
class CurrentAccount extends Assignment2Q3 {
    int totalDeposits = 10000;
    int creditLimit = 2000;
    @Override
    public int getCash() {
    	return (totalDeposits+creditLimit);
    }
}
class SavingsAccount extends Assignment2Q3 {
    int totalDeposits = 10000;
    int fixedDepositAmount = 5000;
    @Override
    public int getCash() {
    	return (fixedDepositAmount+totalDeposits);
    }
}
public class Assignment2Q3 {
     public int getCash(){
    	return 0;
    }
	public int totalCashInBank(ArrayList<Integer> cash){
		 int sum = 0;
			for( int i=0;i<cash.size();i++) {
				sum+=cash.get(i);
			}
			return sum;
	}
    
    public static void main(String[] args) {
    	ArrayList<Integer> cash=new ArrayList<>();
    	Assignment2Q3 ob=new Assignment2Q3();
    	
    	ob=new CurrentAccount();
    	cash.add(ob.getCash());
    	
    	ob=new SavingsAccount();
    	cash.add(ob.getCash());
    	
    	ob=new Assignment2Q3();
    	System.out.print("total cash in the bank = "+ob.totalCashInBank(cash));
    	
    }

}
