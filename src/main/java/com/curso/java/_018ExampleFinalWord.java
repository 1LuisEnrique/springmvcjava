package com.curso.java;

import java.util.Iterator;

public class _018ExampleFinalWord {
	private static int accountant = 1;
	public static void main(String[] args) {
		//DON´T WAS POSSIBLE MODIFY THE CONSTANTS SO IT WAS INITIALIZED
		//_017FinalPeople.VAR_PRIMITIVA = 20;
		for (int i = 0; i < accountant; i++) {
			System.out.println("executing until dont end");
			accountant++;
		}
	}
}
