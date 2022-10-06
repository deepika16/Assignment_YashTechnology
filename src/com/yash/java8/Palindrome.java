package com.yash.java8;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String s = sc.next();
		PalindromeInterface p1 = (name) -> {
			String rev = "";
			for (int i = name.length() - 1; i >= 0; i--) {
				rev = rev + name.charAt(i);
			}
			return name.equals(rev);
		};

		boolean op = p1.isPalindrome(s);
		// System.out.println(op);
		if (op == true)
			System.out.println("It is Palindrome");
		else
			System.out.println("It is not Palindrome");

	}
}
