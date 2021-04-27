package com.id.JunitTesting.johnson;

public class SumDigits {
	

	public int SumD(int number) {
		int sum=0;
		int n=number;
		while(n>0) {
			int a=n%10;
			sum=sum+a;
			n=n/10;
			
			}
		
		 return sum;
		
	
		
	}

}
