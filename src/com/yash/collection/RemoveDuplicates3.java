package com.yash.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class RemoveDuplicates3 {

	public static void main(String[] args) {
		List<Integer>  ls = new ArrayList<Integer>();
		ls.add(10);
		ls.add(50);
		ls.add(60);
		ls.add(60);
		ls.add(10);
		ls.add(30);
		
		Collections.sort(ls);
		List<Integer> ls1 = new ArrayList<Integer>();
		List<Integer> duplicatels = new ArrayList<Integer>();
		
		for(Integer s : ls) {
			if(ls1.contains(s)) {
				duplicatels.add(s);
			}else {
			   	ls1.add(s);
			}
		}
		Collections.reverse(duplicatels);
		System.out.println(ls1.toString());
 	}
}
