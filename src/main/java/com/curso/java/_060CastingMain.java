package com.curso.java;

public class _060CastingMain {
	public static void main(String[] args) {
		_056CastingEmployee employee;
		
		employee = new _059CastingWriter("Luis", 4000, _058EnumTipoEscritura.CLASICC);
		
		System.out.println(employee.obtainDetails());
		
		_059CastingWriter writer = (_059CastingWriter) employee;
		
		System.out.println(writer.getTipoDeEscrituraEnTexto());
		
		System.out.println(((_059CastingWriter)employee).getTipoDeEscrituraEnTexto());
		
		employee = new _057CastingManager("Enrique", 10000, "Sistemas");
		
		System.out.println(((_057CastingManager)employee).getAparment());
	}
}
