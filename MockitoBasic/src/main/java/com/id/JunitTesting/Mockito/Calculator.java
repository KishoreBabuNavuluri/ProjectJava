package com.id.JunitTesting.Mockito;

public class Calculator {

	private CalculatorService service1;

	public Calculator(CalculatorService service1) {
		super();
		this.service1 = service1;
	}

	public CalculatorService getService1() {
		return service1;
	}

	public void setService1(CalculatorService service1) {
		this.service1 = service1;
	}
	
	public int performance(int i, int j) {
		return service1.add(i, j)*i;
	}
	
	
}
