package com.casestudy.ewallet.service;

import java.util.List;

import com.casestudy.ewallet.pojo.Ewallet;
import com.casestudy.ewallet.pojo.Statement;

public interface EwalletService {

	public List<Ewallet> getWallets();
	public Ewallet addWallet(Ewallet ewallet);
	public void addMoney(Ewallet ewallet,double amount,String transactionType);
	public void update(Ewallet ewallet,double amount,String transactionaTpye,int orderId);
	public Ewallet getById(int walletId);
	public List<Statement> getStatementsById(int walletId);
	public List<Statement> getStatements();
	public void deleteById(int statementId);
}
