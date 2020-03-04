package com.curso.java;

public class _057CastingManager extends _056CastingEmployee{
	private String aparment;
	
	public _057CastingManager(String name, double salary, String aparment) {
		super(name,salary);
		this.aparment = aparment;
	}
	public String obtainDetails() {
		return super.obtainDetails() + "Aparment: " + aparment;
		
	}
	public String getAparment() {
		return aparment;
	}
	public void setAparment(String aparment) {
		this.aparment = aparment;
	}
	
}
