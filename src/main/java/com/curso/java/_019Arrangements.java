package com.curso.java;

/*
 VIDEO 90. ARRANGEMENT IN JAVA
 --AN ARRANGEMENT IS A SET OF INFORMATION THAT LET´S GROUP INFORMATION OF A ONLY TYPE 
 --THE ARRANGEMENT START IN CERO
 --WE CAN TO HAVE ARRANGEMENT OF PRIMITIVE TYPES AND OBJECT TYPE, FOR EXAPLE ARRANGEMEMT OF TYPE PEOPLE
 SINTAX TO DECLARE ARRANGEMENT OF A DIMENSION
 	TYPE [] ARRAYNAME OR TYPE ARRAYNAME [];
 	
--THE ARRANGEMENT ARE A DATA COLLECTION,SO WE SHOULD DECLARE THE OBJETCS NAMES IN PLURAL
SINTAX TO INSTANCE A ARRANGEMENT OF A DIMENSION
 	arrangementName = new type[size]
 	
INITIALIZING TO ARRANGEMENT ELEMENTS
	arrayName [index] = value;
	EXAMPLE
	integers[0] = 10;
	integers[1] = 10;
	
	OBJECTS TYPE 
	personas[0] = new Persona();
	personas[1] = new Persona("Luis","Enrique");
	
	nombres[0] = new String("Luis");
	nombres[1] = new String("Luis");
SINTAX TO EXTRACT ELEMENTS FROM A ARRANGEMENT
	variable = arrayName[index];
	
	//ASIGNATION OF A INDEX OF ARRANGEMENT TO OBJECT VARIABLE 
	Persona p1 = personas[0];
	Persona p2 = personas[1];
	
	String nombre1 = nombres[0];
	String nombre2 = nombres[1];
SINTAX TO DECLARE, INSTANCE, AND INITIALIZE ARRAY
	type [] arrayName = {list, values};
	
	//	int integers[];
//	
//	Example example[];	ON THIS LINE, WE ARE INDICATING THAT WE´RE DECLARING A ARRANGEMENT OBJECT TYPE
//	
//	int [] edades = {23,15,10,12}; 	//easy away to declare an arrangement
//	
//	Persona [] personas = (new Persona(), new Persona("Juan","Perez"))
//	

 */
public class _019Arrangements {
	public static void main(String[] args) {
		int edades[];
		edades = new int[3];
		
		edades[0] = 3;
		edades[1] = 10;
		edades[2] = 35;
		
		System.out.println("integers array index 0: " + edades[0]);
		System.out.println("integers array index 1: " + edades[1]);
		System.out.println("integers array index 2: " + edades[2]);
		
		Person person[];
		person = new Person[3];
		
		person[0] = new Person("Luis");
		person[1] = new Person("Enrique");
		person[2] = new Person("Fernando");
		
		System.out.println("objects array index 0: " + person[0].getName());
		System.out.println("objects array index 1: " + person[1].getName());
		System.out.println("objects array index 2: " + person[2].getName());
		
		String nombres[] = {"Sandy","Dany","Magy","Lucero"};
		
		for (int i = 0; i < nombres.length; i++) {
			System.out.println("Stored name on index : " + i + nombres[i]);
		}
	}
}

class Person {
	String name;
	public Person(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}