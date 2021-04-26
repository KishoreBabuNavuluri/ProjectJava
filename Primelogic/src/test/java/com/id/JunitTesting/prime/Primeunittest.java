package com.id.JunitTesting.prime;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;




@RunWith(Parameterized.class)
public class Primeunittest  {
	
	int number;
	boolean expected;
	
	
	//Prime prime=new Prime();
	
       static Prime pm=null;
	
	public Primeunittest(int number, boolean expected) {
		super();
		this.number = number;
		this.expected = expected;
	}

	@BeforeClass
	public static void init() {
		pm =new Prime();
		System.out.println("object created");
		
	}
	
	@AfterClass
	public static void destroy() {
		pm=null;
		System.out.println("object destroyed");
	}
	
	@Parameters
	public static Map<Integer, Boolean> getParameters(){
	Map<Integer, Boolean> map=new HashMap<Integer, Boolean>();
	map.put(13, true);
	map.put(11, true);
	System.out.println(map);
	
	return map;
	}
	@Test
	public void testprimesuccess() {
		assertEquals( expected, pm.isPrime(number));
		
		
	}

}
