package com.curso.java;

public class _055InstanceOfMain {
	public static void main(String[] args) {
		_050PolymorphismEmployee empleado = new _050PolymorphismEmployee("Juan", 1000);
		determinaTipo(empleado);
        
        _052PolymorphismManager gerente = new _052PolymorphismManager("Karla", 2000, "Finanzas");
        determinaTipo(gerente);
      
    }
    
    public static void determinaTipo(_050PolymorphismEmployee empleado){
        if(empleado instanceof _050PolymorphismEmployee) {
        	System.out.println(empleado.getNombre());
        }else if(empleado instanceof _052PolymorphismManager){
        	System.out.println(((_052PolymorphismManager) empleado).getDepartamento() );
        }
        	
    }
}
