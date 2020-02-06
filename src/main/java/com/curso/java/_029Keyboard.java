package com.curso.java;

public class _029Keyboard extends _027DispositivosEntrada {
	private int idKeyboard;
	private static int accountantKeyboards;

	public _029Keyboard(String inType, String brand) {
		super(inType, brand);
		this.idKeyboard = ++accountantKeyboards;
	}

	@Override
	public String toString() {
		return "_029Keyboard [idKeyboard=" + idKeyboard + "]" + super.toString();
	}

}
