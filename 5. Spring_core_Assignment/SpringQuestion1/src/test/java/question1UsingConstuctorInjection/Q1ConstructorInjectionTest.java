package question1UsingConstuctorInjection;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class Q1ConstructorInjectionTest {
 
	Address address=new Address("Tehsil road","Delhi", "MP", 144411 , "India");
    Customer  customer=new Customer(12321,"Ram Prakash", 9758384829L,  address);
    
    
    @Test
    @DisplayName("Testing getCity method of Address class")
    void test() {
    	assertEquals("Delhi",address.getCity());
    }

    @Test
    @DisplayName("Tesing getCustomerName method of customer class")
    void test1() {
    	assertEquals("Ram Prakash",customer.getCustomerName());
    }
    
    @Test
    @DisplayName("Testing getZip method of address class")
    void test2() {
    	assertEquals(144411,address.getZip());
    }
    
   
}
