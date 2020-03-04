package com.curso.java;

/**
 * 
 * @author USUARIO Access Modifiers: Control the access to definition of a class,
 *         method, attrib, constructors
 *
 */
public class _044AccessModifiersClase1 {
	/**
	 * Definition of attribs
	 */
	public String pubicAttrib = "Value public attrib";
	protected String protectedAttrib = "Value protected attrib";
	String defaultAttrib = "Attrib value default o package";
	private String privateAttrib = "Private Attrib";

	/**
	 * Empty Constructor
	 */
	public _044AccessModifiersClase1() {
		System.out.println("public contructor empty");
	}

	/**
	 * Constructor with 1 arguments
	 * 
	 * @param text
	 */
	public _044AccessModifiersClase1(String text) {
		System.out.println("public constructor with one argument = " + text);
	}

	/**
	 * Constructor with two arguments
	 * 
	 * @param text
	 * @param text2
	 */
	protected _044AccessModifiersClase1(String text, String text2) {
		System.out.println("protected constructor with 2 arguments: " + text + ", " + text2);
	}

	/**
	 * Constructor Default o Package with three arguments
	 * 
	 * @param text1
	 * @param text2
	 * @param text3
	 */
	_044AccessModifiersClase1(String text1, String text2, String text3) {
		System.out.println("Construcutor Default o Package");
	}

	/**
	 * Constructor Private with four arguments
	 * 
	 * @param text1
	 * @param text2
	 * @param text3
	 * @param text4
	 */
	private _044AccessModifiersClase1(String text1, String text2, String text3, String text4) {
		System.out.println("Private Constructor");
	}

	/**
	 * 
	 * @return
	 */
	public String publicMethod() {
		return "Public Method";
	}

	/**
	 * 
	 * @return
	 */
	protected String protectedMethod() {
		return "Protected Method";
	}

	/**
	 * 
	 * @return
	 */
	String defaultMethod() {
		return "Default or package Method";
	}

	/**
	 * 
	 * @return
	 */
	private String privateMethod() {
		return "Private Method";
	}
}
