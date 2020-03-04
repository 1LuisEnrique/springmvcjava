package com.curso.java;

public class _049OverWriteMethodsTest {
	public static void main(String[] args) {
		_048OverWriteMethodsEmployee employe = new _048OverWriteMethodsEmployee("Luis", 4000);
		System.out.println("Empleado: " + employe.obtainDetails());
		_049OverWriteMethodsManager manager = new _049OverWriteMethodsManager("Sandy", 5000, "Systems");
		System.out.println("Gerente: " + manager.obtainDetails());
	}
}
