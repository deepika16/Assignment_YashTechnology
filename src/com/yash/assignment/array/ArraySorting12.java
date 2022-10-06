package com.yash.assignment.array;

import java.util.Arrays;

/**
 * WAP to sort array on the basis of unit place. For example we are having
 * following numbers:- 10,2,3,41,12,13,19,81,9. Output will be
 * 10,41,81,2,12,3,13,19,9
 **/

public class ArraySorting12 {
	public static int getLastDgt(int n) {
		int lastDigit = Math.abs(n % 10);
		return lastDigit;
	}

	public static void main(String[] args) {
		int a[] = { 10, 2, 3, 41, 12, 13, 19, 81, 9 };
		for (int i = 0; i < a.length; i++) {
			int id = getLastDgt(a[i]);
			for (int j = i + 1; j < a.length; j++) {
				int jd = getLastDgt(a[j]);
				if (id > jd) {
					int temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		System.out.println(Arrays.toString(a));
	}
}
