package com.curso.java;

public class _027DispositivosEntrada {
	private String inType;
	private String brand;

	public _027DispositivosEntrada(String inType, String brand) {
		this.inType = inType;
		this.brand = brand;
	}

	public String getInType() {
		return inType;
	}

	public void setInType(String inType) {
		this.inType = inType;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	@Override
	public String toString() {
		return "_027DispositivosEntrada [inType=" + inType + ", brand=" + brand + "]";
	}

}
