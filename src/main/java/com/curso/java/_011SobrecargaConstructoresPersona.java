package com.curso.java;
/*
 --VIDEO 80 SOBRECARGA DE CONSTRUCTORES
 --TIENE QUE VER CON OFRECER DISTINTAS OPCIONES PARA CREAR UN OBJETO DE UNA CLASE EN PARTICULAR 
 --EL CONSTRUCTOR DEBE SER IGUAL AL NOMBRE DE LA CLASE EN JAVA, RESPETANDO QUE JAVA ES SENCIBLE A MAYUSCULAS Y MINUSCULAS
 --AL ENCONTRAR UN METODO IGUAL AL NOMBRE DE LA CLASE Y NO REGRESE NINGUN TIPO DE DATO, ENTONCES SERA UN CONTRUCTOR DE LA CLASE
 --SOBRECARGA DE CONSTRUCTOR: ES OFRECER MAS OPCIONES PARA PODER CONSTRUIR UN OBJETO DE UNA CLASE 
 --LOS TIPOS DE LOS ARGUMENTOS SON LOS QUE HACEN LA DIFERENCIA PARA SOBRECARGAR UN CONSTRUCTOR 
 --CON EL USO DE THIS.NOMBRECONSTRUCTOR SE PUEDE MANDAR A LLAMAR UN CONSTRUCTOR DENTRO DE OTRO, ESPECIFICANDO SUS ARGUMENTOS 
 --LA PALABRA SUPER MANDA A LLAMAR ALGUN METODO O ATRIBUTO DE LA CLASE PADRE
 --SE INGRESA LA PALABRA SUPER Y SE ESPECIFICA CUAL ES EL CONSTRUCTOR QUE SE DESEA MANDAR A LLAMAR YA SEA CON 1,2,3 ETC...ARGUMENTOS
 --NO ES POSIBLE MANDAR A LLAMAR UN CONSTRUCUTOR VACÍO CON LA PALARABRA SUPER 
 */
public class _011SobrecargaConstructoresPersona {
	private int idPeople;
	private String name;
	private int age;
	private static int peopleAccountant;
	
	private _011SobrecargaConstructoresPersona() {
		//super(); se manda a llamr de manera automática
		this.idPeople = ++peopleAccountant;
	}
	
	//--CONSTRUCTOR COMPLETO - SOBRECARGA
	public _011SobrecargaConstructoresPersona(String name, int age) {
		this(); //PARA MANDAR A LLAMAR EL CONSTRUCTOR VACIO QUE EXISTE DENTRO DE ESTA MISMA CLASE YA QUE SOLO TIENE PARENTESIS
		this.name = name;
		this.age = age;
	}
	
	

	public int getIdPeople() {
		return idPeople;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public static int getPeopleAccountant() {
		return peopleAccountant;
	}


	@Override
	public String toString() {
		return "_011SobrecargaConstructoresPersona [idPeople=" + idPeople + ", name=" + name + ", age=" + age + "]";
	}
	
}
