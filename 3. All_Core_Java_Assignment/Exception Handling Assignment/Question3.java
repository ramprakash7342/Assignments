//3) Write an application to perform withdraw functionality on a SavingAccount object. Point to note:
//a. Raise InsufficientBalanceException if you are trying to withdraw more than balance
//   or when you balance is zero. E.g. if you balance is 2000 and if you are trying to
//   withdraw 2100 or if you balance is 0 and you are trying to withdraw positive value.
//
//b. Raise IllegalBankTransactionException if you are trying to withdraw a negative value
//   from your balance. E.g. if you try to withdraw a negative value savingAcc.withdraw(-1000); 


package assignment;
import java.util.*;

class InsufficientBalanceException extends RuntimeException{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InsufficientBalanceException(String str)
	{
		super(str);
	}
}

class IllegalBankTransactionException extends RuntimeException{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public IllegalBankTransactionException(String str)
	{
		super(str);
	}
}


class  SavingAccount {
	double balance=1000;
	double deposit(double amount) {
		balance=balance+amount;
		return balance;
	}
	double withdraw(double amount) throws InsufficientBalanceException,IllegalBankTransactionException{
		if(amount<=balance&&amount>0)
			System.out.println("Your remaining balance is "+(balance-amount));
		else if(amount>=0){
			 throw new InsufficientBalanceException("Balance is insufficient");
		}
		else {
			throw new IllegalBankTransactionException("Amount given is negative");
		}
		return 0;
	}

	
}
public class Question3 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		SavingAccount sa=new SavingAccount();
		System.out.println("Press 0 for balance chacking and 1 for deposit in account and 2 for withdraw from account");
		int a=sc.nextInt();
		if(a==0)
		{
			System.out.println("Your current balance is = "+sa.deposit(0));
		}
		else if(a==1)
		{
			System.out.println("Enter the amount to be deposited");
			double amt=sc.nextDouble();
			System.out.println("You new balance is ="+sa.deposit(amt));
		}
		else if(a==2)
		{
			System.out.println("Enter the amount to be withdraw");
			double amt=sc.nextDouble();
			
			try {
			sa.withdraw(amt);
			}catch(InsufficientBalanceException ex)
			{
				System.out.println(ex);
			}catch(IllegalBankTransactionException ex)
			{
				System.out.println(ex);
			}
			
	
		}
		else {
			System.out.println("Wrong key pressed");
		}
		

	}

}
