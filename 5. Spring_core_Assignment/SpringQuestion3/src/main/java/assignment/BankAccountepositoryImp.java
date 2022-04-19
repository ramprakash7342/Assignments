package assignment;

public class BankAccountepositoryImp implements BankAccountRepository{
	private BankAccount account1;
	private BankAccount account2;

	public void BankAccountepositoryImpl() {
	}

	public BankAccountepositoryImp(BankAccount account1, BankAccount account2) {
		super();
		this.account1 = account1;
		this.account2 = account2;
	}

	
	public double getBalance(long accountId) {
		if (account1.getAccountId() == accountId) {
			return account1.getAccountBalance();
		}
		return account2.getAccountBalance();
	}
	

	public double updateBalance(long accountId, double newBalance) {
		double updatedBalance = 0;
		if (account1.getAccountId() == accountId) {
			updatedBalance = newBalance;
			account1.setAccountBalance(updatedBalance);
		} else {
			updatedBalance = newBalance;
			account2.setAccountBalance(updatedBalance);
		}
		return updatedBalance;
	}

}
