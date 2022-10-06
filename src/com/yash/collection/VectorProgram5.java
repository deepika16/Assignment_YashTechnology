package com.yash.collection;

import java.util.Collections;
import java.util.Vector;

public class VectorProgram5 {

	public static void main(String[] args) {
		Vector<String> v = new Vector<String>();
		
		v.add("aaa");
		v.add("ddd");
		v.add("eee");
		v.add("ccc");
		v.add("bbb");
		System.out.println("Original Vector Value: " +v);
		
		Collections.sort(v);
		
		System.out.println("After Sorting: "+v);
	}

}
