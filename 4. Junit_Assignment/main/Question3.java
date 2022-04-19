package io.javabrains;

class InsufficientFundsExpcetion extends RuntimeException{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public InsufficientFundsExpcetion(String str)
	{
		super(str);
	}
}
public class Question3 {
   
	private int balance=10000;
	public int withdraw(int amount) throws InsufficientFundsExpcetion
	{
		try {
			if(amount>balance)	
		    {throw new InsufficientFundsExpcetion("Balance is lower than withdrawal amount");
		    
		    }
			return balance-amount;
		}catch(InsufficientFundsExpcetion e)
		{
			System.out.println(e);
		}
		return 0;
	}
}
