package com.curso.java;

/*
 * VIDEO 76
 * PERMITIRA REPRESENTAR CARACTERISTICAS O COMPORTAMIENTO EN COMÚN ENTRE CLASES 
 * EVITAR DUPLICACIÓN DE CÓDIGO
 * ES UNA CARACTERISTICA DE LA PROGRAMACION ORIENTADA A OBJETOS
 * LAS CLASES HIJAS HEREDARAN ESTOS ATRIBUTOS O METODOS DEFINIDOS EN LA CLASE PADRE 
 * IDENTIFICAR EL TIPO DE MODIFICADOR ASIGNADO A LOS ATRIBUTOS YA QUE ESTO DEPENDE SI SE HEREDAN O NO
 * VIDEO 77 SUPER Y THIS
 * LAS CLASES QUE NO HEREDAN DE ALGUNA CLASE PADRE, HEREDAN DE LA CLASE OBJECT YA QUE ES UNA CLASE DE JAVA
 * UNICAMENTE SE PUEDE HEREDAR DE UNA CLASE
 * LA PALABRA SUPER NO SOLO PERMITE LLAMAR A LOS CONSTRUCTORES DE LA CLASE PADRE  SINO CUALQUIER ATRIBUTO
 * METODO O CONSTRUCTOR HEREDABLE DE LA CLASE PADRE   
 * */
//EL MOTODO TOSTRING SE UTILIZA PARA MOSTRAR EL ESTADO DE UN OBJETO, ES DECIR
// LOS VALORES DE LOS ATRIBUTOS
// EN CIERTO MOMENTO DEL TIEMPO DE VIDA DEL OBJETO, METODO STRING ES UN METODO
// HEREDADO DE LA CLASE OBJECT
// LA NOTACION @OVERRIDE INDICA QUE ESTAMOS SOBREESCRIBIENO EL COMPORTAMIENTO DE
// UN METODO DE LA CLASE PADRE O CLASES SUPERIORES
// TOSTRING SIRVE PARA CONVERTIR EL ESTADO DE UN OBJETO A UNA CADENA
// SUPER AYUDARA MANDAR A LLAMAR A LA CLASE PADRE SIEMPRE Y CUANDO SEAN
// ACCESIBLES
//PAGINA PARA DIAGRAMAS UML umlet.com/umletino/umletino.html

public class _007HerenciaPersona {
	private String name;
	private char gender;
	private int age;
	private String direction;

	// agregar un constructor vacio
	public _007HerenciaPersona() {

	}

	// agregar un constructor con 1 argumento
	public _007HerenciaPersona(String name) {
		this.name = name;
	}

	// agregar constructor completo
	public _007HerenciaPersona(String name, char gender, int age, String direction) {
		this.name = name;
		this.gender = gender;
		this.age = age;
		this.direction = direction;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDirection() {
		return direction;
	}

	public void setDirection(String direction) {
		this.direction = direction;
	}

	@Override
	public String toString() {
		return "HerenciaPersona [name=" + name + ", gender=" + gender + ", age=" + age + ", direction=" + direction
				+ "]";
	}
	
	
	
	
}
