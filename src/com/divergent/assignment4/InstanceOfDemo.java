package com.divergent.assignment4;
/**
 * 
 * @author Dell
 *
 */
class A {
	/**
	 * these is class A
	 */
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

		//it is checking b is a type of  or not
		System.out.println(b instanceof B);
	}

}
