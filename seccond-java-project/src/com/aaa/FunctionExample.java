package com.aaa;

import java.util.function.Function;

public class FunctionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Function<Double, Double> bonus=salary->salary+(salary*0.10);
		double result=bonus.apply(50000.0);
		System.out.println(result);

	}

}
