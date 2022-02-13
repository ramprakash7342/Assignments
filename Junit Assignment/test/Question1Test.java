package io.javabrains;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class Question1Test {

	Question1 ob;
	@BeforeEach
	void init() {
		ob=new Question1();
	}
	@Test
	@DisplayName("random value")
	void minMaxFinder() {
		
		int expected[]= {3,56};
		int actual[]={56, 34, 7,3, 54, 3, 34, 34, 53};
		assertArrayEquals( expected, ob.findMinMax(actual) );
	}
	@Test
	@DisplayName("with Single Value")
	void minMaxFinder1() {
		int expected[]= {2,2};
		int actual[]={2};
		assertArrayEquals( expected, ob.findMinMax(actual) );
	}
	@Test
	@DisplayName("all positive")
	void minMaxFinder2() {
		int expected[]= {1,10};
		int actual[]={1,2,3,4,5,6,7,8,9,10};
		assertArrayEquals( expected, ob.findMinMax(actual) );
	}
	@Test
	@DisplayName("all negative")
	void minMaxFinder3() {
		int expected[]= {-10,-2};
		int actual[]={-10,-4,-2,-5,-6,-8,-5,-9};
		assertArrayEquals( expected, ob.findMinMax(actual) );
	}
	@Test
	@DisplayName("all zeros")
	void minMaxFinder4() {
		int expected[]= {0,0};
		int actual[]={0,0,0,0,0,0,0,0,0,0,0,0,0};
		assertArrayEquals( expected, ob.findMinMax(actual) );
	}
	@Test
	@DisplayName("Empty Array")
	void minMaxFinder5() {
		
		int actual[]={};
		assertThrows(ArrayIndexOutOfBoundsException.class,()-> ob.findMinMax(actual));
	}
	

}
