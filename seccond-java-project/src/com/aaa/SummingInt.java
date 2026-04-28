package com.aaa;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

class Employee
{
	private int id;
	private String name;
	private int deptId;
	private int salary;
	public Employee(int id, String name, int deptId, int salary) {
		super();
		this.id = id;
		this.name = name;
		this.deptId = deptId;
		this.salary = salary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getDeptId() {
		return deptId;
	}
	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	
}

public class SummingInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Employee> employees=Arrays.asList(new Employee(1,"priya",10,30000),
				new Employee(2,"latha",20,40000),
				new Employee(3,"mala",10,50000),
				new Employee(4,"kavitha",40,60000));
		
		int total=employees.stream().collect(Collectors.summingInt(Employee::getSalary));
		System.out.println("Total Salary:"+total);
		
		int totsalbydept=employees.stream().filter(name->10==name.getDeptId()).collect(Collectors.summingInt(Employee::getSalary));
		System.out.println("Total Salary by DeptId:"+totsalbydept);

	}

}
