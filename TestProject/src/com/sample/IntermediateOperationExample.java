package com.sample;

import java.util.Arrays;
import java.util.List;

public class IntermediateOperationExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> names = Arrays.asList("Java", "Hibernate", "Oracle", "DBA", "Spring");
		names.stream().filter(name -> name.startsWith("H")).map(name -> name.toUpperCase()).distinct().sorted()
				.forEach(System.out::println);
	}

}
