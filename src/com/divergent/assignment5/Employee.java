package com.divergent.assignment5;

import java.time.LocalDate;
import java.util.Objects;

public class Employee {
	private String name;
	private LocalDate hireDate;
	private double salary;

	private Employee(String name2, LocalDate hireDate2, double salary) {
		this.hireDate = hireDate2;
		this.salary = salary;
		this.name = name2;
		name2 = Objects.requireNonNull(name);
		hireDate2 = Objects.requireNonNull(hireDate);

	}

	static Employee getMethod(String name, LocalDate hireDate, double salary) {
		return new Employee(name, hireDate, salary);
	}

	public static void main(String[] args) {
		Employee emp[] = new Employee[4];
		emp[0] = getMethod("jonsena", LocalDate.of(2021, 02, 28), 543);
		emp[1] = getMethod("ranu verma", LocalDate.of(2020, 03, 28), 1244);
		emp[2] = getMethod("saloni mailviya", LocalDate.of(2022, 004, 28), 355);
		emp[3] = getMethod("kamini yadav", LocalDate.of(2023, 05, 28), 534);
		emp[4] = getMethod("Sahitya shah", LocalDate.of(2024, 06, 28), 134);
		for (Employee e : emp) {
			System.out.println(e.getName() + "  " + e.getSalary() + " " + e.getHireDate());
		}
		Employee e = Employee.getMethod("kamini yadav", LocalDate.of(2023, 05, 28), 534);
		System.out.println(e.equals(emp[3]));

	}

	public boolean equals(Employee e) {
		return this.name.equals(e.name);

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public LocalDate getHireDate() {
		return hireDate;
	}

	public void setHireDate(LocalDate hireDate) {
		this.hireDate = hireDate;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

}
