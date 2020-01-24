package com.curso.java;

public class _003StaticPeople {
	private int idPersona; // se asocia con un objeto (instancia)
	private String nombre; // se asocia con un objeto (instancia)
	private static int contadorPersonas; // se asocia a la clase y no a los objetos

	public _003StaticPeople(String nombre) {
		this.idPersona = ++contadorPersonas;
		this.nombre = nombre;
	}

	public int getIdPersona() {
		return this.idPersona;
	}
//	public void setIdPersona(int idPersona) { 	NO SE VA A UTILIZAR YA QUE EL ATRIBUTO ID PERSONA 
//		this.idPersona = idPersona;				SE  VA MODIFICAR DESDE EL CONSTRUCTOR
//	}

	public String getNombre() {
		return this.nombre;
	}

	public void setIdNombre(String nombre) {
		this.nombre = nombre;
	}

	public static int getContadorPersona() {
		return contadorPersonas;
	}

	@Override
	public String toString() {
		return "idPersona: " + idPersona + ", nombre: " + nombre + ", contadorPersonas: " + contadorPersonas;
	}
}
