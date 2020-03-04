package com.curso.java;

public class _048OverWriteMethodsEmployee {
	protected String name;
	protected double sueldo;

	protected _048OverWriteMethodsEmployee(String name, double salary) {
		this.name = name;
		this.sueldo = sueldo;
	}

	public String obtainDetails() {
		return "Name : " + this.name + "\tSueldo: " + this.sueldo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

}
