package assignment;

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
		bankAccount.setAccountId(1232);
		assertEquals(1232,bankAccount.getAccountId());
	}
     
}
