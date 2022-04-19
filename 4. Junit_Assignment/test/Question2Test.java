package io.javabrains;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class Question2Test {

	Question2 obj=new Question2();
	@Test
	@DisplayName("With random array")
	void test() {
		int actual[]={56, 34, 7,3, 54, 3, 34, 34, 53};
		assertEquals(3,obj.findMinMax(actual).min);
		assertEquals(56,obj.findMinMax(actual).max);
	}
	@Test
	@DisplayName("With one element array")
	void test1() {
		
		int actual[]= {2};
		assertEquals(2,obj.findMinMax(actual).min);
		assertEquals(2,obj.findMinMax(actual).max);
	}
	@Test
	@DisplayName("With all element positive ")
	void test2() {
		
		int actual[]= {1,2,3,4,5,6,7,8,9,10};
		assertEquals(1,obj.findMinMax(actual).min);
		assertEquals(10,obj.findMinMax(actual).max);
	}
	@Test
	@DisplayName("With all element negative ")
	void test3() {
		int actual[]={-10,-4,-2,-5,-6,-8,-5,-9};
		assertEquals(-10,obj.findMinMax(actual).min);
		assertEquals(-2,obj.findMinMax(actual).max);
	}
	@Test
	@DisplayName("With all element zero")
	void test4() {
		int actual[]={0,0,0,0,0,0,0,0,0,0};
		assertEquals(0,obj.findMinMax(actual).min);
		assertEquals(0,obj.findMinMax(actual).max);
	}
	

}
