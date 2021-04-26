package com.id.JunitTesting;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import junit.framework.TestCase;

public class CalculatorUnitTest  {

	static Calculator calculator=null;
	
	@BeforeClass
	public static void init() {
		calculator =new Calculator();
		System.out.println("object created");
		
	}
	
	@AfterClass
	public static void destroy() {
		calculator=null;
		System.out.println("object destroyed");
	}
	
	@Test
	public void testsum() {
		assertEquals(5, calculator.sum(2, 3));
		System.out.println("done");
	}
	

	@Test
	public void testsum1() {
		assertEquals(1, calculator.sub(3,2));
		System.out.println("done1");
	}
	

	@Test
	public void testsum2() {
		assertEquals(2, calculator.div(4, 2));
		System.out.println("done2");
	}
}
