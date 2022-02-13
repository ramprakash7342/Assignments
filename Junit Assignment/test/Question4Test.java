package io.javabrains;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class Question4Test {

	@Test
	@BeforeEach
	void test1() {
		System.out.println("This method will run Before each method");
	}
	@Test
	@AfterEach
	void test2() {
		System.out.println("This method will run After each method");
	}
	@Test
	@BeforeAll
	static void test3() {
		System.out.println("This method will run Before All method");
	}
	@Test
	@AfterAll
	static void test() {
		System.out.println("This method will run After All method");
	}

}
