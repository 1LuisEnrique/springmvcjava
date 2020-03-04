package com.curso.java;

public class _051PolymorphismMain {
	public static void main(String[] args) {
		_050PolymorphismEmployee empleado = new _050PolymorphismEmployee("Juan", 1000);
        imprimirDetalles(empleado);
        
        _052PolymorphismManager gerente = new _052PolymorphismManager("Karla", 2000, "Finanzas");
        imprimirDetalles(gerente);
      
    }
    
    public static void imprimirDetalles(_050PolymorphismEmployee empleado){
        System.out.println("empleado = " + empleado.obtenerDetalles());
    }
}
