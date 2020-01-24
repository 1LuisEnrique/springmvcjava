package com.curso.java;

public class _006TestEncapsulation {
	public static void main(String[] args) {
		_005Encapsulation _005Encapsulation = new _005Encapsulation("Luis Enrique", 3000, false);
		
//		System.out.println("people name: " + encapsulation.getName());
//		System.out.println("people salary: " + encapsulation.getSalary());
//		System.out.println("people removed: " + encapsulation.isRemoved());
		
		System.out.println("Datos Persona: " + _005Encapsulation);
		
		_005Encapsulation.setName("Luis Fernando");
		_005Encapsulation.setSalary(400);
		_005Encapsulation.setRemoved(true);
		
//		System.out.println("people name: " + encapsulation.getName());
//		System.out.println("people salary: " + encapsulation.getSalary());
//		System.out.println("people removed	: " + encapsulation.isRemoved());
		
		System.out.println("Datos Persona: " + _005Encapsulation); //LA NOTACION LN INDICA QUE SE ACCEDEÁ 
															   //POR AUTOMATICO AL METODO TO STRING Y 
															   //MOSTRARA LO QUE CONTIENE EL OBJETO ENCAPSULATION
		
	} 
}
