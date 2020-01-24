package com.curso.java;

public class _012SobrecargaConstructoresEmpleado extends _011SobrecargaConstructoresPersona{

	private double sueldo;
	public _012SobrecargaConstructoresEmpleado(String name, int age) {
		super(name, age);
		// TODO Auto-generated constructor stub
	}
	 public _012SobrecargaConstructoresEmpleado(String name, int age, double sueldo) {
		 this(name, age);
		 //super(name,age);
		 this.sueldo = sueldo;
	 }
	public double getSueldo() {
		return sueldo;
	}
	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}
	@Override
	public String toString() {
		return super.toString() + "_012SobrecargaConstructoresEmpleado [sueldo=" + sueldo + "]";
	} 
	 
	 
	
}
