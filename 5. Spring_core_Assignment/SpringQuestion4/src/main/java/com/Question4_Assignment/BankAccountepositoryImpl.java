package com.Question4_Assignment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("repository")
public class BankAccountepositoryImpl implements BankAccountRepository {
	@Autowired
	private BankAccount account1;
	@Autowired
	private BankAccount account2;

	public void BankAccountepositoryImpl() {
	}

	public BankAccountepositoryImpl(BankAccount account1, BankAccount account2) {
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