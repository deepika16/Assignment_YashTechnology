package com.yash.Strings;

/**
 * WAP to print the number of alphabets repeated in the given string.
 *
 */
public class RepeatedAlphabetTask4 {

	public static void main(String[] args) {
        String name  = "yash technology";
        int count = 0;
        for(int i=0; i<name.length(); i++) {
        	for(int j=i+1; j<name.length(); j++) {
            	if(name.charAt(i)==name.charAt(j)) {
            		count++;
            	}
            }	
        }
        System.out.println(count);
	}

}