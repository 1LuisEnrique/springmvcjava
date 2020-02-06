package com.curso.java;

public class _025ClassesOrder {
	private int idOrder;
	private _024ClassesProduct products[]; // DECLARE THE VARIABLE ARRAY
	private static int accountantOrders;
	private int accountantProducts;
	private static final int MAX_PRODUCTS = 10;

	public _025ClassesOrder() {
		this.idOrder = ++accountantOrders;

		// INITIALICE THE ARRAY
		products = new _024ClassesProduct[MAX_PRODUCTS];
	}
	
	public void addProduct(_024ClassesProduct product) {
		if (this.accountantProducts < MAX_PRODUCTS) {
			products[this.accountantProducts++] = product; 
		} else {
			System.out.println("has exceeded the maximum number of products" + MAX_PRODUCTS);
		}
	}
	
	public double calculateTotal() {
		double total = 0;
		for (int i = 0; i < accountantProducts; i++) {
			_024ClassesProduct product = this.products[i];
			total += product.getPrice();	//total = total + product.getPrecio()
		}
		
		return total;
	}
	
	public void showOrder() {
		System.out.println("Orden #: " + this.idOrder);
		System.out.println("Productos de la orden: ");
		for (int i = 0; i < this.accountantProducts; i++) {
			System.out.println(products[i]);
		}
		System.out.println("Order Total $" + this.calculateTotal());
	}

}
