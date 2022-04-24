package com.Calculator;

public class Calculator {

	private ServiceLayer service;
	
	public Calculator(ServiceLayer s) {
		service = s;
	}
	
	public void calculate(String operation, int number1, int number2) {
		int ans = service.doCalculations(operation, number1, number2);
		this.showResults(ans);
	}
	
	public void showResults(int num) {
		System.out.println("The result is: " + num);
	}
}
