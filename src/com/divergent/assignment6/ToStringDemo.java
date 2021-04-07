package com.divergent.assignment6;

/**
 * 
 * @author Dell toStringDemo
 * 
 * 
 *
 */
class ToStringDemo {
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Student s = new Student(1, "kamini");
		Student s1 = new Student(2, "Sejal");
		System.out.println(s);
		System.out.println(s1);
	}
}

class Student {
	int id;
	String name;

	public Student(int id, String name) {

		this.id = id;
		this.name = name;
	}
	
	//toString method
	@Override
	public String toString() {
		return id+" "+name;
	}

}
