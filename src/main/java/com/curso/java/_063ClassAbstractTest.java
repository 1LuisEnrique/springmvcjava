package com.curso.java;

import java.awt.Rectangle;

import abstracto.domain.*;

/**
 * 
 * @author USUARIO
 * 
 */
public class _063ClassAbstractTest {
	public static void main(String[] args) {
		GeometricFigure cicle = new Circle("Circle");
		System.out.println(cicle);
		cicle.draw();
		
		GeometricFigure triangle = new Triangle("Triangle");
		System.out.println(triangle);
		triangle.draw();
		
		GeometricFigure rectangle = new Rectangulo("Rectangle");
		System.out.println(rectangle );
		rectangle.draw();

	}
}
