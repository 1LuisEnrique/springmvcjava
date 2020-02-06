package com.curso.java;

public class _028Mouse extends _027DispositivosEntrada {
	private int idMouse;
	private static int accountantMouse;

	public _028Mouse(String inType, String brand) {
		super(inType, brand);
		this.idMouse = ++accountantMouse;
	}

	@Override
	public String toString() {
		return "_028Mouse [idMouse=" + idMouse + "]" + super.toString();
	}

}
