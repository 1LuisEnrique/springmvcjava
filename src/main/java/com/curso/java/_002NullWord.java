package com.curso.java;

/*
 *	Se le utiliza para indicar que no se le asignado ninguna referencia de ningun objeto a una variable 
 *	de tipo object, no es posible asignar el valor null a una variable de tipo primitivo
 	WHEN A VARIABLE OBJECT TYPE IS DECLARED, YOUR ITS DEFAULT VALUE IS NULL
*/
public class _002NullWord {
	public static void main(String[] args) {
		People people1 = new People("Juan");
		System.out.println("people1: " + people1.getName() );
		People people2 = people1;	
		System.out.println("people2: " + people2.getName());
		
		people1 = null;
		if (people1 != null) 
			System.out.println("people1: " + people1.getName());
		else
			System.out.println("the variable person1 does not point to any object");
		
		System.gc(); //garbage collector solo planifica la llamada
	}
}

class People{
	String name;
	
	People(String name){
		this.name = name;
	}
	
	public String getName() {
		return this.name;
	}
}
