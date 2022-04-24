package com.Calculator;


public class ServiceLayer {
	
	public ServiceLayer() {}
	
	public int doCalculations(String operation, int num1, int num2) {
		int ans;
		
		
		if(operation.equalsIgnoreCase("add")) {
			ans = num1 + num2; 
		} else if (operation.equalsIgnoreCase("subtract")) {
			ans = num1 - num2;
		} else if (operation.equalsIgnoreCase("multiply")) {
			ans = num1 * num2;;
		} else {
			ans = num1 / num2;
		}
		
		return ans;
	}
	
	
}
