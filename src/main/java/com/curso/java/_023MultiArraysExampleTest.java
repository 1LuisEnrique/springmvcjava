package com.curso.java;

/*
 VIDEO 96
 SINTAX TO DECLARE MATRIZ 
 	type nameMatriz [][];
 	int nameMatriz[][];
 SINTAX TO DECLARE OBJECT TYPE MATRIZ 
   Persona personas[][];
   VIDEO 97
 SINTAX TO INITIALIZE A MULTIARRAY
   nameMatriz = new type[lines][columns]; 
 */
public class _023MultiArraysExampleTest {
	public static void main(String[] args) {
		// Declare MultiArray
		int edades[][];
		// Instance MultiArray of integers
		edades = new int[3][2];
		// 3. INSTANCE VALUES OF MULTIARRAY
		edades[0][0] = 10;
		edades[0][1] = 11;
		edades[1][0] = 20;
		edades[1][1] = 21;
		edades[2][0] = 30;
		edades[2][1] = 31;

		// 4. PRINT THE VALUES OF MULTIARRAY

		System.out.println(edades[0][0] + "\t" + edades[0][1]);
		System.out.println(edades[1][0] + "\t" + edades[1][1]);
		System.out.println(edades[2][0] + "\t" + edades[2][1]);

		// 1. DECLARE E INSTANCE MULTIARRAY PEOPLE TYPE
		_022MultiArraysPeople personas[][] = new _022MultiArraysPeople[1][2];

		// 2. INITIALICE MULTIARRAY
		personas[0][0] = new _022MultiArraysPeople("Luis");
		personas[0][1] = new _022MultiArraysPeople("Lucero");

		// 3. PRINT THE VALUES OF MATRIZ
		for (int line = 0; line < personas.length; line++) {
			for (int column = 0; column < personas[line].length; column++) {
				System.out.println("Value of matriz on index " + line + " , " + column + ": " + personas[line][column]);
			}
		}

	}

}
