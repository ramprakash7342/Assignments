package com.casestudy.ewallet.pojo;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Ewallet")
public class Ewallet {

	@Id
	private int walletId;
	private double currentBalance;
	private List<Statement> statements;
	
	public Ewallet() {
		
	}

	public Ewallet(double currentBalance, List<Statement> statements) {
		super();
		this.currentBalance = currentBalance;
		this.statements = statements;
	}

	public Ewallet(int walletId, double currentBalance) {
		super();
		this.walletId = walletId;
		this.currentBalance = currentBalance;
	}

	public Ewallet(int walletId, double currentBalance, List<Statement> statements) {
		super();
		this.walletId = walletId;
		this.currentBalance = currentBalance;
		this.statements = statements;
	}

	public int getWalletId() {
		return walletId;
	}

	public void setWalletId(int walletId) {
		this.walletId = walletId;
	}

	public double getCurrentBalance() {
		return currentBalance;
	}

	public void setCurrentBalance(double currentBalance) {
		this.currentBalance = currentBalance;
	}

	public List<Statement> getStatements() {
		return statements;
	}

	public void setStatements(List<Statement> statements) {
		this.statements = statements;
	}

	@Override
	public String toString() {
		return "Ewallet [walletId=" + walletId + ", currentBalance=" + currentBalance + ", statements=" + statements
				+ "]";
	}
	
	
}
