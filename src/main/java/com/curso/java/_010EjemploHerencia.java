package com.curso.java;

import java.util.Date;

/*VIDEO 79*/
public class _010EjemploHerencia {
	public static void main(String[] args) {
		_008HerenciaEmpleado empleado1 = new _008HerenciaEmpleado("Enrique", 15000);
		empleado1.setAge(23);
		empleado1.setGender('M');
		empleado1.setDirection("Villa York #13");
		System.out.println(empleado1);
		
		//creación de nuevo objeto
		_009HerenciaCliente cliente = new _009HerenciaCliente(new Date(), true); //se creara un nuevo objeto de tipo fecha 
		cliente.setName("Sandy");
		cliente.setGender('F');
		cliente.setAge(21);
		cliente.setDirection("San Fe jj");
		System.out.println(cliente);
		
	}
}
