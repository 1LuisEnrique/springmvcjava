package com.curso.java;

public class _046AccessModifiersClase3 extends _044AccessModifiersClase1 {

	public _046AccessModifiersClase3() {
		/**
		 * to call protected constructor we use the word SUPER
		 */
		super("one", "two");

		/**
		 * Constructors Test of class one
		 */
		new _044AccessModifiersClase1(); // called to constructor public

		/**
		 * don't is possible call constructor protected, default private because is in
		 * other package
		 */
//		new _044AccessModifiersClase1("one", "two"); // called to constructor protected
//		
//		new _044AccessModifiersClase1("one", "two", "three"); // called to constructor default or package
//		/**
//		 * don't is possible call private constructor, methods since others class
//		 */
//		// new _044AccessModifiersClase1("one","two","three","four"); //called to
//		// private constructor

	}

	public void testSinceClass3() {
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
		// System.out.println("Private Methods: " + c1.privateMethod);
	}

	public static void main(String[] args) {
		_046AccessModifiersClase3 c3 = new _046AccessModifiersClase3();
		c3.testSinceClass3();
	}
}
