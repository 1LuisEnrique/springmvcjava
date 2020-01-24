package com.curso.java;

public class _013SobrecargaConstructores {
	public static void main(String[] args) {
		_011SobrecargaConstructoresPersona persona1 = new _011SobrecargaConstructoresPersona("Luis",25);
		System.out.println("Persona1: " + persona1);
		
		_012SobrecargaConstructoresEmpleado empleado1 = new _012SobrecargaConstructoresEmpleado("Juan",25,5000 );
		System.out.println("empleado1: " + empleado1);
	}
}
