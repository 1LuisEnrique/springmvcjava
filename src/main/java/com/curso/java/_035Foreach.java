package com.curso.java;

/**
 * 
 * @author Luis Ernque
 *
 *in best to iterate array elements 
 *declare variable that contain the elements and afther the array that
 *we´re going to use this elementos
 *the foreach return the element that is itering but not the index 
 *
 *ARGUMENT VARIABLES...NO ES NECESARIO ESPECIFICAR LA CANTIDAD DE ELEMENTOS A ENVIAR
 *IMPIRMIR(1,2,3,4,5);
 *PUBLIC VOID(int...numeros){
 *	for(int i= 0; i < numeros.legth ; i+++){
 *		syso"";
 *	}
 *{
 */
public class _035Foreach {
		public static void main(String[] args) {
	        //Imprimimos varios numeros
	        imprimirNumeros(15,1,4,6);
	        
	        //Paramtros variables
	        System.out.println("");
	        variosParametros("Juan", true, 14, 2, 5);
	    }
	    
	    private static void variosParametros(String nombre, boolean bandera, int... numeros){
	        System.out.println("nombre = " + nombre);
	        System.out.println("bandera = " + bandera);
	        for (int i = 0; i < numeros.length; i++) {
	            System.out.println("elemento = " + numeros[i]);
	        }
	    }

	    private static void imprimirNumeros(int... numeros) {
	        //Recorremos cada elemento del arreglo 
	        for (int i = 0; i < numeros.length; i++) {
	            int elemento = numeros[i];
	            System.out.println("elemento = " + elemento);
	        }
	    }
}
