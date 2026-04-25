package com.aaa;
import java.util.Scanner;
public class Addition {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Adition of 3 Numbers:");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first Number:");
		int a=sc.nextInt();

		System.out.println("Enter the second Number:");
		int b=sc.nextInt();

		int c=a+b;

		System.out.println("Addition of Two Number:"+c);

	}

}
