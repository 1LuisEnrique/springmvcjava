package com.curso.java;

public class _001PalabraThis {
	public static void main(String[] args) {
		Persona persona = new Persona("Juan");
	}
//el operador this no se puede ejecutar dentro de un contexto estático 
//y sirve para romper la ambiguedad de nuestros argumentos y atributos de clase...
//y ver como se mueve el operador a travez de las clases que se están ejecutando
//RECORDEMOS QUE EL OPERADOR THIS SE ASOCIA A OBJETOS Y NO A CLASES
}

class Personap {
	String nombre;

	Personap(String nombre) {
		this.nombre = nombre; //this apunta a un objeto de tipo persona 
		System.out.println("Impresion del operador this dentro de la clase persona" + this); //this apunta a un objeto de tipo persona
		Imprimiri imprimir = new Imprimiri();
		imprimir.imprimir(this); //this contiene una referencia al objeto persona
	}

}

class Imprimiri {
	public void imprimir(Personap p) {
		System.out.println("Impresión de argumento persona: " + p); //valor del objeto persona
		System.out.println("Impresión del objeto actual (this)" + this); //this apunta a un objeto de tipo imprimir en este momento
	}

}
