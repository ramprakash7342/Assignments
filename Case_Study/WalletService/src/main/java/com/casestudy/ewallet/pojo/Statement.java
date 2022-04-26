package com.casestudy.ewallet.pojo;

import java.time.LocalDateTime;


import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Statement")
public class Statement {

	@Id
	private int statementId;
	private String transactionType;
	private double amount;
	private LocalDateTime dateTime;
	private int orderId;
	private String transactionRemarks;
	private Ewallet ewallet;
	
	public Statement() {
		
	}

	public Statement(int statementId, String transactionType, double amount, LocalDateTime dateTime, int orderId,
			String transactionRemarks) {
		super();
		this.statementId = statementId;
		this.transactionType = transactionType;
		this.amount = amount;
		this.dateTime = dateTime;
		this.orderId = orderId;
		this.transactionRemarks = transactionRemarks;
	}

	public Statement(int statementId, String transactionType, double amount, LocalDateTime dateTime, int orderId,
			String transactionRemarks, Ewallet ewallet) {
		super();
		this.statementId = statementId;
		this.transactionType = transactionType;
		this.amount = amount;
		this.dateTime = dateTime;
		this.orderId = orderId;
		this.transactionRemarks = transactionRemarks;
		this.ewallet = ewallet;
	}

	public int getStatementId() {
		return statementId;
	}

	public void setStatementId(int statementId) {
		this.statementId = statementId;
	}

	public String getTransactionType() {
		return transactionType;
	}

	public void setTransactionType(String transactionType) {
		this.transactionType = transactionType;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public LocalDateTime getDateTime() {
		return dateTime;
	}

	public void setDateTime(LocalDateTime dateTime) {
		this.dateTime = dateTime;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public String getTransactionRemarks() {
		return transactionRemarks;
	}

	public void setTransactionRemarks(String transactionRemarks) {
		this.transactionRemarks = transactionRemarks;
	}

	public Ewallet getEwallet() {
		return ewallet;
	}

	public void setEwallet(Ewallet ewallet) {
		this.ewallet = ewallet;
	}

	@Override
	public String toString() {
		return "Statement [statementId=" + statementId + ", transactionType=" + transactionType + ", amount=" + amount
				+ ", dateTime=" + dateTime + ", orderId=" + orderId + ", transactionRemarks=" + transactionRemarks
				+ ", ewallet=" + ewallet + "]";
	}
	
	
	
}
