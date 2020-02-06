package com.curso.java;

public class _032Order {
	private int idOrder;
	private _031Computer computers[];
	private static int accountOrders;
	private int accountantComputers;
	private static final int MAX_COMPUTERS = 20;
	
	public _032Order() {
		//initialize account order 
		this.idOrder = ++accountOrders;
		
		computers = new _031Computer[MAX_COMPUTERS];
	}
	
	public void addComputer(_031Computer computer) {			
		if (this.accountantComputers < MAX_COMPUTERS) {
			computers[this.accountantComputers++] = computer;
		}
		else {
			System.out.println("Ha excedido el número de productos que puede agregar");
		}
	}
	public double calculateTotal() {
		double total = 0;
		for (int i = 0; i < accountantComputers; i++) {
			_031Computer compu = this.computers[i];
			total += compu.getPrice();
		}
		return total;
	}
	public void showOrder() {
		System.out.println("Orden #" + idOrder);
		System.out.println("Computer");
		for (int i = 0; i < this.accountantComputers; i++) {
			System.out.println(computers[i]);
		}
		System.out.println("Total Order: " + this.calculateTotal());
	}
}
