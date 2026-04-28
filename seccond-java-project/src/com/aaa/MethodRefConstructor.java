package com.aaa;

public class MethodRefConstructor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeFactory factory=Employee10::new;
		Employee10 e1=factory.create(1, "priya");
		Employee10 e2=factory.create(2, "Latha");
		
		e1.display();
		e2.display();
		

	}

}
