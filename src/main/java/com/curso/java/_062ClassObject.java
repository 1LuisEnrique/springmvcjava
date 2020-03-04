package com.curso.java;

public class _062ClassObject {
	public static void main(String[] args) {
		_061ObjectEmployee employ1 = new _061ObjectEmployee("luis", 2000);
		System.out.println("employ1: " + employ1);
		_061ObjectEmployee employ2 = new _061ObjectEmployee("luis", 2000);
		System.out.println("employ2: " + employ2);

		System.out.println("Object equals ? " + (employ1 == employ2));
		
		compareObjects(employ1,employ2);

	}

	public static void compareObjects(_061ObjectEmployee employe1, _061ObjectEmployee employe2) {
		System.out.println("Employe1: " + employe1);
		System.out.println("Employe2: " + employe2);

		if (employe1 == employe2) {
			System.out.println("The objects is in the same memory direction");
		} else {
			System.out.println("The objects isn´t the same memory direction");
		}

		if (employe1.equals(employe2)) {
			System.out.println("The objects have the same value");
		} else {
			System.out.println("The objects don´t have the same value");
		}

		if (employe1.hashCode() == employe2.hashCode()) {
			System.out.println("The objects hava the same has ");
			System.out.println("employe1: " + employe1.hashCode());
			System.out.println("employe2: " + employe2.hashCode());
		} else {
			System.out.println("The objects don´t have the same hash");
		}
	}
}
