package com.curso.java;

public class _049OverWriteMethodsManager extends _048OverWriteMethodsEmployee {
	private String aparment;

	public _049OverWriteMethodsManager(String name, double sueldo, String aparment) {
		super(name, sueldo);
		this.aparment = aparment;
	}
	
	public String obtainDetails() {
		return "Name : " + this.name + "Sueldo: " + this.sueldo + "Aparment: " + this.aparment;

	}

	public String getAparment() {
		return aparment;
	}

	public void setAparment(String aparment) {
		this.aparment = aparment;
	}
	
}
