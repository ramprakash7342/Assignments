package com.casestudy.ewallet.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.casestudy.ewallet.pojo.Ewallet;
import com.casestudy.ewallet.pojo.Statement;

@Service
public class EwalletServiceImpl implements EwalletService {

	@Override
	public List<Ewallet> getWallets() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Ewallet addWallet(Ewallet ewallet) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addMoney(Ewallet ewallet, double amount, String transactionType) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(Ewallet ewallet, double amount, String transactionaTpye, int orderId) {
		// TODO Auto-generated method stub

	}

	@Override
	public Ewallet getById(int walletId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Statement> getStatementsById(int walletId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Statement> getStatements() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteById(int statementId) {
		// TODO Auto-generated method stub

	}

}
