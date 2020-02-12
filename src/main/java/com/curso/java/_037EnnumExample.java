package com.curso.java;

public class _037EnnumExample {
	public static void main(String[] args) {
		// valores de la enumeracion
		System.out.println("Valor 1:" + _036EnnumDias.LUNES);
		System.out.println("Valor 2:" + _036EnnumDias.MARTES);

		// utilizamos la enumeracion de paises
		System.out.println("Contienente no. 4:" + _038EnnumContinents.AMERICA);
		System.out.println("Accedemos al numero de paises del continente 4:" + _038EnnumContinents.AMERICA.getPaises());

		System.out.println("Accedemos al continente 1:" + _038EnnumContinents.AFRICA);
		System.out.println("No. de paises del continente 1:" + _038EnnumContinents.AFRICA.getPaises());

		indicarDia(_036EnnumDias.LUNES);
	}

	private static void indicarDia(_036EnnumDias dias) {
		switch (dias) {
		case LUNES:
			System.out.println("Primer dia de la semana");
		case DOMINGO:
			System.out.println("Septimo dia de la semana");
		}
	}
}
