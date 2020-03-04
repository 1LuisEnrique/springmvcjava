package com.curso.java;

public enum _058EnumTipoEscritura {
	CLASICC("Ecritura a Mano"),
	MODERN("Escritura Digital");
	
	private final String descripcion;
	
	private _058EnumTipoEscritura(String descripcion) {
		this.descripcion = descripcion;
	}

	public String getDescripcion() {
		return descripcion;
	}
	
	
}
