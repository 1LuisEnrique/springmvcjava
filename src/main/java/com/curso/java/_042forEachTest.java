package com.curso.java;

public class _042forEachTest {
	public static void main(String[] args) {
		int edades[] = {15,20,41,50};
		for(int edad : edades) {
			System.out.println("Edad = " + edad);
		}
		
		_041ForEachPersona personas[] = {new _041ForEachPersona("Luis"), new _041ForEachPersona("Erika")};
		
		System.out.println("");
		
		for (_041ForEachPersona persona : personas) {
			System.out.println("P = " + persona);
		}
	}
}
