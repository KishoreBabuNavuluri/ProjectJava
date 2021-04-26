package com.id.JunitTesting.Mockito;

import static org.junit.Assert.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Before;
import org.junit.Test;

public class calculatorTest {
	
	
	Calculator obj;
	CalculatorService service2=mock(CalculatorService.class);
	
	@Before
	public void init() {
		obj=new Calculator(service2);
	}

	@Test
	public void test() {
		when(service2.add(3, 3)).thenReturn(6);
		assertEquals(18, obj.performance(3, 3));
		
	}

}
