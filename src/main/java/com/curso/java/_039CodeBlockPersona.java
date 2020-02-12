package com.curso.java;
/**
 * 
 * @author USUARIO
 *the code blocks anonimo let initialize instance values or static values
 *static block code: let initialize static variables
 */
public class _039CodeBlockPersona {
	  private final int idPersona;
	    private static int contadorPersonas;
	    
	    //Bloque de inicializacion de codigo static
	    static{
	        contadorPersonas = 10;
	        //No podemos utilizar variables NO estaticas dentro del bloque static
	        //idPersona = 2;
	        System.out.println("Ejecucion bloque estatico");
	    }
	    
	    //Bloque NO estatico se copia a cada objeto
	    {
	        System.out.println("Ejecucion bloque NO estatico");
	        this.idPersona = ++contadorPersonas;
	    }
	    
	    public _039CodeBlockPersona(){
	        System.out.println("Ejecucion del constructor");
	    }
	    
	    public int getIdPersona(){
	        return this.idPersona;
	    }
}
