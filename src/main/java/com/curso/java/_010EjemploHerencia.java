package com.curso.java;

import java.util.Date;

/*VIDEO 79*/
public class _010EjemploHerencia {
	public static void main(String[] args) {
		_008HerenciaEmpleado empleado1 = new _008HerenciaEmpleado("Enrique", 15000);
		empleado1.setAge(23);
		empleado1.setGender('M');
		empleado1.setDirection("Villa Victoria");
		System.out.println(empleado1);
		
		
		/**
		 * Create object type coustumer
		 */
		_009HerenciaCliente cliente = new _009HerenciaCliente(new Date(),true);
		cliente.setName("Karina");
		cliente.setGender('F');
		cliente.setAge(21);
		cliente.setDirection("San Francisco");
		System.out.println(cliente);
		
	}
}
