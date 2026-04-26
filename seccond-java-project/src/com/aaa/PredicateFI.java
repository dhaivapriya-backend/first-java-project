package com.aaa;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

class Employee3
{
	String name;
	double salary;
	public Employee3(String name, double salary) {
		super();
		this.name = name;
		this.salary = salary;
	}
	
	
}

public class PredicateFI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Employee3> list=Arrays.asList(new Employee3("priya", 30000),
				new Employee3("latha", 40000),
				new Employee3("mala",50000));
		
		Predicate<Employee3> highSalary=emp->emp.salary>30000;
		
		for(Employee3 e:list)
		{
			if(highSalary.test(e))
			{
				System.out.println(e.name);
			}
		}

	}

}
