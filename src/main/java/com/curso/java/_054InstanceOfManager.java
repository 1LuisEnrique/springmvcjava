package com.curso.java;

public class _054InstanceOfManager extends _050PolymorphismEmployee{
	 private String departamento;

	    public _054InstanceOfManager(String nombre, double sueldo, String departamento) {
	        super(nombre, sueldo);
	        this.departamento = departamento;
	    }

	    //Sobreescribimos el metodo padre heredado
	    @Override
	    public String obtenerDetalles() {
	        return super.obtenerDetalles() 
	                + ", departamento: " + this.departamento;
	    }

	    public String getDepartamento() {
	        return departamento;
	    }

	    public void setDepartamento(String departamento) {
	        this.departamento = departamento;
	    }
}
