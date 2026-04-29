package com.bbb;

import java.util.HashMap;

public class PANRCStreamAPI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "SUMSUNG";

		char[] ch = str.toCharArray();
		HashMap<Character, Integer> mapObj = new HashMap<>();
		for (char c : ch) {

			if (mapObj.get(c) == null) {

				mapObj.put(c, 1);
			} else {
				mapObj.put(c, mapObj.get(c) + 1);
			}
		}

		mapObj.entrySet().stream().filter(map -> map.getValue() == 1).forEach(System.out::println);

	}
}
