package com.aaa;

import java.util.function.Function;

class Employee6
{
	String name;
	double salary;
	public Employee6(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	
	
}

public class FunctionExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee6 emp=new Employee6("Priya",60000);
		
		Function<Employee6,Double> salaryincrement=e->e.salary+(e.salary*0.10);
		Double newsalary=salaryincrement.apply(emp);
		System.out.println("Old salary:"+emp.salary);
		System.out.println("New salary:"+newsalary);
		

	}

}
