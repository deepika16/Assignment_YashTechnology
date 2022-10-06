package com.yash.exception;

import java.util.Scanner;

public class ArrayProgram {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter the size of array: ");
			int s = sc.nextInt();
			Object p[] = new Object[s];
			System.out.println("Array is created Successfully");
		} catch (NegativeArraySizeException | NumberFormatException e) {
			System.out.println(e);
		}
	}

}
