package com.Calculator;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		Calculator calculator = context.getBean(Calculator.class, "calculator");
		calculator.calculate("divide", 15000, 150);
	}

}
