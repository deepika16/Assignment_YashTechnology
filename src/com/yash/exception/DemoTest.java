package com.yash.exception;

import java.util.Scanner;

public class DemoTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		 String fname[] = {"xyz","pqr","priyanka","aamir","snehal","deepika","vaishnavi","raju","nikhil","riya"};
		 System.out.println("Enter the Index");
		 try {
			 int index = sc.nextInt();
			 System.out.println(fname[index]);
		 }catch(ArrayIndexOutOfBoundsException e) {
			 System.out.println(e);
		 }
	}

}
