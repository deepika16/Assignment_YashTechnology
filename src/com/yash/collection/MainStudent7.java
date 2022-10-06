package com.yash.collection;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class MainStudent7 {

	public static void main(String[] args) {

		ArrayList<StudentClass7> studentList = new ArrayList<StudentClass7>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of students: ");
		int n = sc.nextInt();

		for (int i = 1; i <=n; i++) {
			StudentClass7 student = new StudentClass7();
			System.out.println("Enter the record of " + i + " student");
			System.out.println("Enter Roll No.");
			student.setRollno(sc.nextInt());
			System.out.println("Enter student name");
			student.setSname(sc.next());
			System.out.println("Enter class name");
			student.setClassname(sc.next());
			System.out.println("Enter total marks");
			student.setTotalmarks(sc.next());

			student.setPercentage(Integer.parseInt(student.getTotalmarks()) * 100 / 500);
			studentList.add(student);
		}
		Collections.sort(studentList, new Comparator<StudentClass7>() {
			public int compare(StudentClass7 s1, StudentClass7 s2) {
				return s1.getTotalmarks().compareToIgnoreCase(s2.getTotalmarks());
			}
		});
		Collections.reverse(studentList);

		System.out.println(studentList);
		if(n>=3) {
		System.out.println("First - " + studentList.get(0) + " " + "Second - " + studentList.get(1) + " " + "Third - "
				+ studentList.get(2));
		}
		else {
			System.out.println("Enter minimum three records");
		}
		int sum = 0;
		for (int i = 0; i < studentList.size(); i++) {
			StudentClass7 student = studentList.get(i);
			if (student.getPercentage() > 35 && student.getPercentage() < 50) {
				System.out.println(student.getSname() + " have less than 50% marks");
			} else if (student.getPercentage() < 35) {
				System.out.println(student.getSname() + " have less than 35% marks");
			}
			sum = sum + Integer.parseInt(student.getTotalmarks());
		}
		double average = sum / n;

		// d
		for (StudentClass7 student : studentList) {
			if (Integer.parseInt(student.getTotalmarks()) < average) {
				System.out.println(student.getSname() + " have below average marks");
			}
		}

		// e
		Collections.sort(studentList, new Comparator<StudentClass7>() {
			public int compare(StudentClass7 s1, StudentClass7 s2) {
				return s1.getSname().compareToIgnoreCase(s2.getSname());
			}
		});
		System.out.println("Sorted list by Name - " + studentList);
	}
}
