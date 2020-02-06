package com.curso.java;

public class _024ClassesProduct {
	private int idProdut;
	private String name;
	private double price;
	private static int accountant;

	// Constructor void
	private _024ClassesProduct() {
		this.idProdut = ++accountant;
	}

	public _024ClassesProduct(String name, double price) {
		this(); // call void constructor to initialice variable idProduct
		this.name = name;
		this.price = price;
	}

	public int getIdProduct() {
		return idProdut;
	}

	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public int getAccountantProducts() {
		return accountant;
	}
	
	@Override
	public String toString() {
		return "idProduct: " + idProdut + " Name: " + name + " Price: " + price;
	}
}
