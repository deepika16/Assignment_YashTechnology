package com.yash.assignment.array;

import java.util.Arrays;

/**
 * Suppose that you are having an array of size N. now your task is to sort the
 * half array that is from 0 to N/2 in ascending order and N/2+1 to N in
 * descending order.
 **/
public class ArraySorting6 {

	public static void main(String[] args) {
		int arr[] = { 2, 1, 4, 3, 6, 5, 8, 7, 9 };
		Arrays.sort(arr);
		for (int i = 0; i < arr.length / 2; i++)
			System.out.print(arr[i] + " ");

		for (int j = arr.length - 1; j >= arr.length / 2; j--)
			System.out.print(arr[j] + " ");
	}
}
