package com.divergent.assignment5;

public class NonStaticInitialization {
	int a = 45;
	void test()
	{
		System.out.println("value of instance variable:" + a);
	}

	public static void main(String[] args) {
		NonStaticInitialization obj = new NonStaticInitialization();
		obj.test();
	}
}
