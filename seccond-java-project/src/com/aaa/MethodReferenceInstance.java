package com.aaa;

import java.util.Arrays;
import java.util.List;

class Employee9 {
	private int id;
	private String name;
	private double salary;

	public Employee9(int id, String name, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public void display() {
		System.out.println(id + "" + name + "" + salary);
	}

	public void increaseSalary() {
		this.salary += 5000;
	}

	public double getSalary() {
		return salary;
	}
}

public class MethodReferenceInstance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Employee9> list = Arrays.asList(new Employee9(1, "priya", 90000), new Employee9(2, "latha", 80000),
				new Employee9(3, "malathi", 70000));

		System.out.println("Before Salary Update");
		list.forEach(Employee9::display);

		System.out.println("increased salary");
		list.forEach(Employee9::increaseSalary);

		System.out.println("After Salary Update");
		list.forEach(Employee9::display);

		System.out.println("Filter salary >30000");
		list.stream().filter(e -> e.getSalary() > 30000).forEach(Employee9::display);

	}

}
