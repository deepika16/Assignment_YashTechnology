package com.yash.collection;

import java.util.ArrayList;

public class BinarySearch2 {

	int binarySearch(ArrayList<Integer> arr, int x) {
		int left = 0, right = arr.size() - 1;

		while (left <= right) {
			int mid = left + (right - left) / 2;

			if (arr.get(mid) == x)
				return mid;

			if (arr.get(mid) < x)
				left = mid + 1;

			else
				right = mid - 1;
		}
		return -1;

	}

	public static void main(String[] args) {

		BinarySearch2 ob = new BinarySearch2();

		ArrayList<Integer> arr = new ArrayList<Integer>();
		arr.add(5);
		arr.add(10);
		arr.add(15);
		arr.add(20);
		arr.add(25);
		arr.add(30);
		arr.add(35);

		int x = 10;

		System.out.println("The elements in arraylist are: " + arr);

		int result = ob.binarySearch(arr, x);

		if (result == -1)
			System.out.println("Element is not present");

		else
			System.out.println("The Element  " + x + "is found at" + " index " + result);
	}

}
