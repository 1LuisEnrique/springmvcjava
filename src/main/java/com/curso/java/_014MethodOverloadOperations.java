package com.curso.java;
/*
 * VIDEO 84
	 --METHOD OVERLOAD
	 --ANY METHOD CAN BE OVERLOADED
	 --OFFER MORE THAT ONE OPTION TO USE OUR METHODS
	 --THE ARGUMENTS TYPE SHOULD BE DIFERENT
	 --MAY BE THE SAME AMOUNT OF ARGUMENTS
	 --IS POSSIBLE CHANGE THE ARGUMENTS ORDER
	 --THE RETURN DATA TYPE IS NOT REVISED 
	 --ONLY THE ORDER AND TYPE ID CHEKED
	 --THE ARGUMENTS CAN BE PRIMITIVE TYPE OR OBJECT    
 *  VIDEO 85. EXCERCISE METHOD OVERLOAD
 *  
 	--	byte 		char short 		int			log 	  float 	double
 	--	8 bits			16 bits		32 bits 	64 bits	  32 bits	64 bits
 * */
public class _014MethodOverloadOperations {
	
	//metthod add 
	public static int add(int a, int b) {
		System.out.println("method add(int ,int)");
		return a + b;
	}
	
	//metohdoverload
	public static double add(double a, double b) {
		System.out.println("method add(double, double)");
		return a + b;
	}
	
	public static double add(int a, double b) {
		System.out.println("method add(int, double)");
		return a + b;
	}
	
	public static double add(double a, int b) {
		System.out.println("method add(double,int)");
		return a + b;
	}
}
