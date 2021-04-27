package com.id.JunitTesting.johnson;

import static org.junit.Assert.*;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

;

public class SUmDtest {
	//SumDigits sd=new SumDigits();
	

	static SumDigits sumdig=null;
	
	@BeforeClass
	public static void init() {
		sumdig =new SumDigits();
		System.out.println("object created");
		
	}
	
	@AfterClass
	public static void destroy() {
		sumdig=null;
		System.out.println("object destroyed");
	}
	
	
	

	@Test
	public void test() {
		assertEquals(20, sumdig.SumD(5555));
		
	}

}
