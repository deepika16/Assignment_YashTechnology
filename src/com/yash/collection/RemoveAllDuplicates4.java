package com.yash.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class RemoveAllDuplicates4 {

	public static void main(String[] args) {
		List<String> l = new ArrayList<String>();
		l.add("CS");
		l.add("IT");
		l.add("CS");
		l.add("Maths");
		l.add("IT");
		
		Collections.sort(l);
		List<String> ls = new ArrayList<String>();
		List<String> duplicatelist = new ArrayList<String>();
		
		for(String s : l) {
			if(ls.contains(s)) {
				ls.add(s);
			}else {
				duplicatelist.add(s);
			}
		}
		Collections.reverse(duplicatelist);
		System.out.println(duplicatelist.toString());
	}
}
