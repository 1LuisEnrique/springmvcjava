package com.curso.java;
/*VIDEO 94. ARRAYS*/
public class _021ArraysExample {
	public static void main(String[] args) {
		
		//1. DECLARE A VARIABLE ARRAY TYPE INTEGER 
		int edades[];
		
		//2. INSTANCE ARRAY AS INTEGER
		edades = new int[3];
		
		//3. INITIALIZING ARRAY VALUES
		edades[0] = 30 ;
		edades[1] = 15;
		edades[2] = 20;
		
		//4. PRINT THE VALUES OF ARRAY 
		System.out.println("Array of Integers on index 0: " + edades[0]);
		System.out.println("Array of Integers on index 1: " + edades[1]);
		System.out.println("Array of Integers on index 2: " + edades[2]);
		
		//1. DECLARE AND INSTACE ARRAY OF OBJECT TYPE 
		_020ArraysPeople peoples[] = new _020ArraysPeople[4];
		
		//2. INITIALIZING THE VALUES INDEX OF OUR ARRAY
		peoples[0] = new _020ArraysPeople("Luis 0");
		peoples[2] = new _020ArraysPeople("Luis 2");
//		peoples[2] = new _20ArraysPeople("Luis 2");
//		peoples[3] = new _20ArraysPeople("Luis 3");
		
		//3.PRINT THE VALUES OF OUR ARRAY
		System.out.println("Array Value People type objects of index 0: " + peoples[0]);
		System.out.println("Array Value type objects of index 1: " + peoples[1]);
		System.out.println("Array Value type objects of index 2: " + peoples[2]);
		System.out.println("Array Value type objects of index 3: " + peoples[3]);
		
		String nombres[] = {"luis","Laura","Sandy"};
		
		//PRINT VALUES OF ARRAY
		for (int i = 0; i < nombres.length; i++) {
			System.out.println("Array String index : " + i + ": " + nombres[i]);
		}
	}
}
