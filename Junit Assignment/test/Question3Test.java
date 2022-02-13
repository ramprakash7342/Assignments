package io.javabrains;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


class Question3Test {

	Question3 ob=new Question3();

	@Test
	@DisplayName("test with more amount than balance")
	void test() {
		assertThrows(InsufficientFundsExpcetion.class,()->ob.withdraw(11000));
	}
	@Test
	@DisplayName("test with less amount than balance")
	void test1() {
		assertEquals(4000,ob.withdraw(6000));
	}


}
