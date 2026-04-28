package com.aaa;

interface Addable
{
	int add(int a,int b);
}

public class LamdaExpressionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Addable ad1=(a,b)->(a+b);
		System.out.println(ad1.add(3, 2));
		
		
		Addable ad2=(int a,int b)->{
			return (a+b);
		};
		System.out.println(ad2.add(100,200));

	}

}
