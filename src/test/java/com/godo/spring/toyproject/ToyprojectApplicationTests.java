package com.godo.spring.toyproject;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ToyprojectApplicationTests {
	static HelloRestController a;
	@BeforeAll
	static void printout() {
		System.out.println("!!! Before Rest API Test !!!");
	}
	
	@DisplayName("printout test")
	@Test
	void contextLoads() {
		a = new HelloRestController();
		assertTrue(a.index().toString().equals("Hello World!"));
	}

}
