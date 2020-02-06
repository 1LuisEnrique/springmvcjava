package com.curso.java;

public class _026ClassesVentas {
	public static void main(String[] args) {

		//CREATE SOME TYPE PRODUCT OBJECTS
		_024ClassesProduct producto1 = new _024ClassesProduct("T-shirt", 50);
		_024ClassesProduct producto2 = new _024ClassesProduct("Pants", 100);
		
		//CREATE A TYPE ORDER OBJECT
		_025ClassesOrder order1 = new _025ClassesOrder();
		
		//ADD PRODUCTS TO THE ORDER 
		order1.addProduct(producto1);
		order1.addProduct(producto2);
		
		//PRINT ORDER 
		order1.showOrder();
	}
}
