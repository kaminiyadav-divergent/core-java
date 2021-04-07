package com.divergent.assignment5;

public class MethodOverloading {
	 // Overloaded add()
    public int add(int x, int y)
    {
        return (x + y);
    }
  
    // Overloaded add(). This sum takes three int parameters
    public int add(int x, int y, int z)
    {
        return (x + y + z);
    }
  
    // Overloaded add(). This sum takes two double parameters
    public double add(double x, double y)
    {
        return (x + y);
    }
  
    public static void main(String args[])
    {
    	MethodOverloading obj = new MethodOverloading();
        System.out.println(obj.add(10, 20));
        System.out.println(obj.add(10, 20, 30));
        System.out.println(obj.add(10.5, 20.5));
    }
}
