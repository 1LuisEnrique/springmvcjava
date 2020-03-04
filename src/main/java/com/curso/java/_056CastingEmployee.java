package com.curso.java;

public class _056CastingEmployee {
	protected String name;
	protected double salary;

	public _056CastingEmployee(String name, double salary) {
		this.name = name;
		this.salary = salary;
	}
	
	public String obtainDetails() {
		return "Name: " + this.name + "\tSalary: " + this.salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
}
