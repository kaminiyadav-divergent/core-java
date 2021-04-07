package com.divergent.assignment5;

class A {
	public void walk() {
		System.out.println("Running");
	}
}

class B {
	public void run() {
		System.out.println("Walking");
	}
}

public class InstanceOfDemo {
	public static void main(String[] args) {
		B b = new B();
		System.out.println(b instanceof B);
	}

}
