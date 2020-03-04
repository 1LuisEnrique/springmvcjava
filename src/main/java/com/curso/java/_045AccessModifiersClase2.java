package com.curso.java;

public class _045AccessModifiersClase2 {
	public _045AccessModifiersClase2() {
		/**
		 * Constructors Test of class one
		 */
		new _044AccessModifiersClase1();						//called to constructor public 
		new _044AccessModifiersClase1("one", "two");			//called to constructor protected
		new _044AccessModifiersClase1("one", "two", "three");	//called to constructor default or package
		/**
		 * dont is posible call private constructor, methods since others class
		 */
		// new _044AccessModifiersClase1("one","two","three","four"); //callled to private constructor
	}

	public void testSinceClass2() {
		/**
		 * Creation Object
		 */
		_044AccessModifiersClase1 c1 = new _044AccessModifiersClase1();
		/*
		 * Creation Attribs
		 */
		System.out.println("public attrib" + c1.pubicAttrib);
		System.out.println("protected attrib" + c1.protectedAttrib);
		System.out.println("default o package " + c1.defaultAttrib);
		/**
		 * dont is posible to access to attrib private
		 */
		// System.out.println("private attrib" + c1.);
		System.out.println(" ");
		/**
		 * Access to the methods
		 */
		System.out.println("Public Method: " + c1.publicMethod());
		System.out.println("Protected Method: " + c1.protectedMethod());
		System.out.println("Default o Package Method: " + c1.defaultMethod());
		//System.out.println("Private Methods: " + c1.privateMethod);
	}
	public static void main(String[] args) {
		_045AccessModifiersClase2 c2 = new _045AccessModifiersClase2();
		c2.testSinceClass2();
	}
}