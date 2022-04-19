package question1UsingSetterInjection;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;


class Q1SetterInjectionTest {


	Address ob=new Address();
	Customer ob2=new Customer();
	@Test
	@DisplayName("Testing City from Address class")
	public void test() {
		ob.setCity("sahaswan");
		assertEquals("sahaswan",ob.getCity());
	}

	@Test
	@DisplayName("Testing State from Address class")
	public void test1() {
		ob.setState("UP");
		assertEquals("UP",ob.getState());
	}
	
	@Test
	@DisplayName("Testing Country from Address class")
	public void test2() {
		ob.setCountry("India");
		assertEquals("India",ob.getCountry());
	}
	
	@Test
	@DisplayName("Testing ID from Customer class")
	public void test3() {
		ob2.setCustomerId(123);
		assertEquals(123,ob2.getCustomerId()); 
	}
	
	@Test
	@DisplayName("Testing CustomerName from Customer class")
	public void test4() {
		ob2.setCustomerName("Ram Prakash");
		assertEquals("Ram Prakash",ob2.getCustomerName());
	}
	

}
