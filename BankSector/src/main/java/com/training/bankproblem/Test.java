package com.training.bankproblem;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("banking.xml");
         Bank obj=(Bank)context.getBean("bean");
         System.out.println(obj.getCustomer().getName());
         System.out.println(obj.getAccount().getAccountType());
         System.out.println(obj.getFundtransfer().getAmount());
         System.out.println(obj);
         
	}

}
