package com.curso.java;

//va acceder a todos los metodos y atributos que sean publicos
//los constructores, METODOS Y ATRIBUTOS PRIVADOS NO SE HEREDAN A LA CLASE HIJA
public class _008HerenciaEmpleado extends _007HerenciaPersona {
	private int idEmployee;
	private double salary;
	private static int EmployeeAccountant;

	public _008HerenciaEmpleado(String name, double salary) {
		super(name); // inicializar el atributo nombre de la clase padre, su utiliza la palabra super
						// Se manda a llamar los constructores de la clase padre
		this.idEmployee = ++EmployeeAccountant;
		this.salary = salary;
	}

	public int getIdEmployee() {
		return idEmployee;
	}

	public double getSalary() {
		return this.salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public static int getEmployeeAccountant() {
		return EmployeeAccountant;
	}

	@Override
	public String toString() {
		return super.toString() + "_8HerenciaEmpleado [idEmployee=" + idEmployee + ", salary=" + salary + "]";
		/*PARA MANDAR A LLAMAR LOS VALORES DE LA CLASE PADRE UTILIZAMOS SUPER Y DE ESTA FORMA LOS CONVIERTE A UN STRING*/
	}
	
	

}
