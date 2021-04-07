package com.divergent.assignment5;

public class ConstructorOverloading {
	private static ConstructorOverloading obj1;
	private static ConstructorOverloading obj2;
	private static ConstructorOverloading obj3;

	public static ConstructorOverloading getObj1() {
		return obj1;
	}

	public static void setObj1(ConstructorOverloading obj1) {
		ConstructorOverloading.obj1 = obj1;
	}

	public static ConstructorOverloading getObj2() {
		return obj2;
	}

	public static void setObj2(ConstructorOverloading obj2) {
		ConstructorOverloading.obj2 = obj2;
	}

	public ConstructorOverloading() {
		System.out.println("Default Parameter Constructor");
	}

	public ConstructorOverloading(int x) {
		System.out.println("One Parameter Constructor");
	}

	public ConstructorOverloading(int x, int y) {
		System.out.println("Two Parameter Constructor");
	}

	public static void main(String[] args) {
		obj1 = new ConstructorOverloading();
		obj2 = new ConstructorOverloading(10);
		setObj3(new ConstructorOverloading(10, 20));
	}

	public static ConstructorOverloading getObj3() {
		return obj3;
	}

	public static void setObj3(ConstructorOverloading obj3) {
		ConstructorOverloading.obj3 = obj3;
	}
}
