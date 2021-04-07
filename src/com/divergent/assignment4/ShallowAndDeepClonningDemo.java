package com.divergent.assignment4;

public class ShallowAndDeepClonningDemo  {
	public static void main(String []args) throws CloneNotSupportedException{
		Adress adress = new Adress("Delhi","Delhi", 13333);
		Employee emp1 = new Employee(101,"shiba","sudamanager",adress);
		Employee emp2 = (Employee) emp1.clone();
		
		emp2.getAdress().setCity("Mumbai");
		System.out.println("Emp1>>>"+emp1);
		System.out.println("Emp2>>>"+emp2);
	}

}
