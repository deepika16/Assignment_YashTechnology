package com.yash.oops.task10;

public class ProductMain10 {
	public static void main(String[] args) throws CloneNotSupportedException {
		Product10 p = new Product10(0, "xyz", 93, "Meter");
		Product10 p1 = (Product10) p.clone();
		p1.setPname("abc");
		p1.setPrice(85);
		System.out.println(p.toString());
		System.out.println(p1.toString());
		if (p1 instanceof Product10) {
			System.out.println("Clone obj is belog to product class");
		} else {
			System.out.println("Clone obj is not belog to product class");
		}
	}
}
