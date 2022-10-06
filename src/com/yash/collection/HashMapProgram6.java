package com.yash.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashMapProgram6 {

	static Map<String, Integer> m = new HashMap<String, Integer>();

	public static void sortByKey() {
		TreeMap<String, Integer> sortedMap = new TreeMap<>();
		sortedMap.putAll(m);
		
		for(Map.Entry<String, Integer> entry :sortedMap.entrySet())
		{
			System.out.println("Key = " + entry.getKey() + ",Value = " + entry.getValue());
		}
	}

	public static void main(String[] args) {
		m.put("Indore", 10000);
		m.put("Pune", 80000);
		m.put("Bangalore", 90000);
		m.put("Mumbai", 70000);
		m.put("Nagpur", 100000);
		m.put("Shimla", 133000);

		sortByKey();
	}
}
