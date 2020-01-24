package com.curso.java;

/*
 * Permite aislar datos de nuestros objetos del acceso de otros objetos externos
 * de esta manera reestringir el acceso directo a los atributos que no deseamos permitir 
 * EL ENCAPSULAMIENTO SE LOGRA APLICAR A TRAVEZ DE LOS LLAMADOS MODIFICADORES DE ACCESO
 * PRIVATE PACKAGE O DEFAULT PROTECTED PUBLIC 
 * DE ESTA MANERA UNICAMENTE LOS MÉTODOS DE LA MISMA CLASE SON LOS QUE PODRÁN ACCEDER Y MANIPULAR LOS DATOS
 * SE CREAN DOS METODOS PUBLICOS POR CADA ATRIBUTO PRIVADO, METODO SET PARA MODIFICAR EL VALOR DEL ATRIBUTO 
 * Y METHOD0 TO GET PARA RECUPERAR TO RECOVER ATTRIB VALUE  
 * Override indica al compilador que se esta sobreescribiendo cierto método ya que el metodo existe dentro de otra clase
 * */
public class _005Encapsulation {
	private String name;
	double salary;
	boolean removed;

	public _005Encapsulation(String name, double salary, boolean removed) {
		this.name = name;
		this.salary = salary;
		this.removed = removed;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return this.salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public boolean isRemoved() {
		return this.removed;
	}

	public void setRemoved(boolean removed) {
		this.removed = removed;
	}

	@Override
	public String toString() {
		return "Encapsulation [name=" + name + ", salary=" + salary + ", removed=" + removed + "]";
	}
	
	
}
