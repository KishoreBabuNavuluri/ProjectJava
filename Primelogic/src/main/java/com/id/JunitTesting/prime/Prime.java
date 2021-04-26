package com.id.JunitTesting.prime;

import java.util.Scanner;

public class Prime {

	public boolean isPrime(int number) {
		boolean status=true;
		for(int i=2;i<=number/2;i++) {
			if(number%i==0) {
				status=false;
				break;
			}
		
		}
		return status;
	}
	
}

