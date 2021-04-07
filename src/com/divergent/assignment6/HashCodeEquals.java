package com.divergent.assignment6;

public class HashCodeEquals {
	/**
	 * 
	 * @param args
	 * HashcodeImplementation
	 */

	public static void main(String[] args) {
		Pen p = new Pen(10, "red");
		Pen p1 = new Pen(10, "red");
		System.out.println(p);
		System.out.println(p1);
		System.out.println(p1 instanceof Pen); // check p is a type of Pen

		System.out.println(p.equals(p1)); //
		
	}
}

class Pen {
	int price;
	String color;

	public Pen(int price, String color) {
		this.price = price;
		this.color = color;
	}

	@Override
	public boolean equals(Object obj) {
		Pen that = (Pen) obj;
		boolean isEqual = this.price == that.price && this.color.equals(that.color);
		return isEqual;
	}

	

}
