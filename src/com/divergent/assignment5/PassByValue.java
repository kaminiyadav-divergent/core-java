package com.divergent.assignment5;

public class PassByValue {

	int id;

	public static void main(String[] args) {
		//p is a reference
		PassByValue p = new PassByValue();
		
		p.id = 10;
		System.out.println(p.id);
		
		//Reference is passed and copy of reference is created in test()
		test(p);
		
		System.out.println(p.id);
	}

	public static void test(PassByValue p) {
		
		// // We changed reference to refer some other location
        // now any changes made to reference are not reflected
        // back in main method
		p = new PassByValue();
		p.id = 12;
	}
}
