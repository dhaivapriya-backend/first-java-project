package com.aaa;

public class Addition {

	int a, b;

	public Addition(int a, int b) {
		super();
		this.a = a;
		this.b = b;
	}

	void display() {
		System.out.println(a + b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Addition c = new Addition(2, 3);
		c.display();

	}

}
