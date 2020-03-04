package com.curso.java;
/**
 * is the hability of execute methods sintactically the sames in distint types
 * @author USUARIO
 *INSTANCE OF: ANSWER TO THE QUESTION, IF A CLASS HAVE RELATION WITH OTHER THAT WE INDICATE
 * IS USED TO KNOW IF A OBJECT IS A INSTANCE OF A CLASS DETERMINATE
 * ONLY CAN USE INSTANCE OF IN OBJECT TYPES 
 *
 */
public class _053InstanceOfEmployee {
	 protected String nombre;
	    protected double sueldo;
	    
	    public _053InstanceOfEmployee(String nombre, double sueldo){
	        this.nombre = nombre;
	        this.sueldo = sueldo;
	    }
	    
	    public String obtenerDetalles(){
	        return "Nombre: " + this.nombre + ", sueldo: " + this.sueldo;
	    }

	    public String getNombre() {
	        return nombre;
	    }

	    public void setNombre(String nombre) {
	        this.nombre = nombre;
	    }

	    public double getSueldo() {
	        return sueldo;
	    }

	    public void setSueldo(double sueldo) {
	        this.sueldo = sueldo;
	    }
	
}
