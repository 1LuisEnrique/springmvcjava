package com.curso.java;
/**
 * 
 * @author USUARIO
 *forEach: sintaxis to iterate the elements of a array or data collection
 */
public class _041ForEachPersona {
		/**
		 * iterate of array with forEach
		 */
	    private final int idPersona;
	    private String nombre;
	    private static int contadorPersonas;
	    
	    public _041ForEachPersona(String nombre){
	        this.idPersona = ++contadorPersonas;
	        this.nombre = nombre;
	    }
	    
	    public String getNombre(){
	        return this.nombre;
	    }
	    
	    public void setNombre(String nombre){
	        this.nombre = nombre;
	    }

	    @Override
	    public String toString() {
	        return "Persona{" + "idPersona=" + idPersona + ", nombre=" + nombre + '}';
	    }
	    
	
}
