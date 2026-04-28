package com.aaa;

import java.util.Arrays;
import java.util.List;

class MethodReferenceStatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<Employee7> employees=Arrays.asList(new Employee7(1,"priya",90000), 
				new Employee7(2,"latha",10000),
				new Employee7(3,"mala",8000));
		employees.stream().filter(EmployeeUtils::isHighSalary) // method reference
        .forEach(emp -> System.out.println(emp.getName()));

	}

}
