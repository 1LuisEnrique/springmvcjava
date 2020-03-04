package com.curso.java;

public class _059CastingWriter extends _056CastingEmployee {
	final _058EnumTipoEscritura tipoEscritura;

	public _059CastingWriter(String name, double salary, _058EnumTipoEscritura tipoEscritura) {
		super(name, salary);
		this.tipoEscritura = tipoEscritura;
	}

	public String obtainDetail() {
		return super.obtainDetails() + ", tipo Escritura: " + tipoEscritura.getDescripcion();
	}
	
	public _058EnumTipoEscritura getTipoEscritura() {
		return this.tipoEscritura;
	}
	
	public String getTipoDeEscrituraEnTexto() {
		return tipoEscritura.getDescripcion();
	}
}
