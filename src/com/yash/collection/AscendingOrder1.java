package com.yash.collection;

import java.util.ArrayList;
import java.util.Collections;

public class AscendingOrder1 {

	public static void main(String[] args) {
		ArrayList<String>  a1 = new ArrayList<String>();
		a1.add("Dear");
		a1.add("Hi");
		a1.add("Friend");
		a1.add("How are you");
		
		Collections.sort(a1);
		
		System.out.println("List after sorting: "+ a1);
	}

}
