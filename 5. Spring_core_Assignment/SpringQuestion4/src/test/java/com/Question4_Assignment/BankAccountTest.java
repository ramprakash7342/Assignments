package com.Question4_Assignment;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


class BankAccountTest {


	BankAccount bankAccount=new BankAccount(1234,"Ram Prakash", "Saving", 20000);
	
	@Test
	@DisplayName("Teseting geAccountHoldertName Method")
	void test() {
		assertEquals("Ram Prakash",bankAccount.getAccountHolderName());
	}
	
	@Test
	@DisplayName("Testing getAccountId method")
	void test1()
	{
		bankAccount.setAccountId(122);  //Here I am passing different value than passed in constructor
		assertEquals(122,bankAccount.getAccountId());
	}
	
}
