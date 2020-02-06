package com.curso.java;

public class _033MundoPc {
	public static void main(String[] args) {

		//CREACIÓN DE COMPUTADORA ASUS
		_030Monitor monitorAsus = new _030Monitor("ASUS", 20);
		_029Keyboard keyboardAsus = new _029Keyboard("USB", "ASUS");
		_028Mouse mouseAsus = new _028Mouse("BLUETOOH", "ASUS");
		_031Computer compuAsus = new _031Computer("Computadora ASUS", 3000, monitorAsus, keyboardAsus, mouseAsus);
		
		//CREACION DE COMPUTADORA LENOVO
		_030Monitor monitorLenovo = new _030Monitor("Lenovo", 20);
		_029Keyboard keyboarLenovo = new _029Keyboard("Bluetooh", "Lenovo");
		_028Mouse mouseLenovo = new _028Mouse("BLUETOOH", "Lenovo");
		_031Computer compuLenovo = new _031Computer("Computadora Lenovo", 2500, monitorLenovo, keyboarLenovo, mouseLenovo);
		
		//CREACION DE COMPUTADORA ARMADA
		_030Monitor monitorArmada = new _030Monitor("HP", 23);
		_029Keyboard keyboarArmada = new _029Keyboard("USB", "GHIA");
		_028Mouse mouseArmada = new _028Mouse("USB", "ACCER");
		_031Computer compuArmada = new _031Computer("Computadora Armada", 1500, monitorArmada, keyboarArmada, mouseArmada);
		
		//CREATE OBJECT ORDER TYPE 1
		_032Order order1 = new _032Order();
		order1.addComputer(compuAsus);
		order1.addComputer(compuLenovo);
		
		//CREATE OBJECT ORDER TYPE 2
		_032Order order2 = new _032Order();
		order2.addComputer(compuArmada);
		
		
		//PRINT ORDER 1
		order1.showOrder();
		
		//PRINT ORDER 2
		order2.showOrder();
	}
}
