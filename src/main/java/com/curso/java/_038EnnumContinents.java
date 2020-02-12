package com.curso.java;

public enum _038EnnumContinents {
	AFRICA(53),
    EUROPA(46),
    ASIA(44),
    AMERICA(34),
    OCEANIA(14);
    
    //Atributo de paises
    private final int paises;
    
    //Constructor de cada elemento de la enumeracion
    _038EnnumContinents(int paises){
        this.paises = paises;
    }
    
    public int getPaises(){
        return this.paises;
    }
}
