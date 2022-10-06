package com.yash.java8;

import java.util.Scanner;

@FunctionalInterface
interface myInterface {

	String isFound(String s, String s1);

}

public class task2 {

	public static void main(String[] args) {

		myInterface mi = (s, s1) -> {
			if (s.contains(s1)) {
				return "String is found";
			} else {
				return "String is not found";
			}

		};

		String s = "Taj is situated in Agra";

		Scanner sc = new Scanner(System.in);
		String s1 = sc.next();
		System.out.println(mi.isFound(s, s1));

	}
}
