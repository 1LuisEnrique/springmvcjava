package com.curso.java;

/*NO ES POSIBLE TRABAJAR CON EL OPERADOR THSI DENTRO DEL CONTEXTO ESTATICO*/
public class _004StaticExample {
	public static void main(String[] args) {
		_003StaticPeople people = new _003StaticPeople("Luis");
		System.out.println(people); //solo en imprime el objeto persona ya que la notacion ln 
									//va a detectar automaticamente el metodo toString asi que ya no
									// es necesario invocarlo especificando que es toString
		_003StaticPeople people2 = new _003StaticPeople("Enrique");
		System.out.println(people2);
		
		_003StaticPeople people3 = new _003StaticPeople("Sandy");
		System.out.println(people3);
		
		System.out.println("Contador: " + _003StaticPeople.getContadorPersona());
	}
}
