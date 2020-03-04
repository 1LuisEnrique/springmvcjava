package com.curso.java;

/**
 * 
 * @author USUARIO AUTOBOXING: Conversion of primitive type to object type
 *
 */
public class _043AutoBoxingUnboxing {
	public static void main(String[] args) {
		//Autoboxing (envolvemos tipos primitivos en clases wrapper)
        Integer enteroObj = 10;
        System.out.println("enteroObj = " + enteroObj);
        
        //Unboxing (extraemos el tipo primitivo del objeto envolvente)
        int entero = enteroObj;
        System.out.println("entero = " + entero);
        
        Float floatObj = 15.4F;
        System.out.println("floatObj = " + floatObj);
        float flotante = floatObj;
        System.out.println("flotante = " + flotante);
        System.out.println("int a partir del float = " + floatObj.intValue());
        
        double dobleObj = 30D;
        System.out.println("Doble: " + dobleObj);
        
        double doble = dobleObj;
        System.out.println("double a objeto" + doble);
        
        
        //Listado de clases envolventes
        //boolean - Boolean
        //byte - Byte
        //char - Character
        //short - Short
        //int - Integer
        //long - Long
        //float - Float
        //double - Double
        
        Integer entero1 = 10;
        System.out.println("entero" + entero1.floatValue());
        
        
	}
}
