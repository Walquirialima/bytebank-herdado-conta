package br.com.bytebank.banco.test.util;

import java.util.ArrayList;
import java.util.List;

public class Teste {
	
	public static void main(String[] args) {
		
		//array de primitivos
		int[] idades = new int[5];
		
		String[] nomes = new String[5];
		
		//array de referencias
		int idade = 29;//Integer
		
		Integer idadeRef = Integer.valueOf(29); // criação do objeto chamando um metodo static // autoboxing
		System.out.println(idadeRef.doubleValue());
		
		System.out.println(Integer.MAX_VALUE); // constante sempre com letra maiuscula
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.SIZE);
		System.out.println(Integer.BYTES);
		
		int valor = idadeRef.intValue(); // pedido o primitivo para a referencia // unboxing
		
		String s = args[0]; //"10"
		
		//Integer numero = Integer.valueOf(s);
		int numero = Integer.parseInt(s);
		
		System.out.println(numero);
		
		List<Integer>numeros = new ArrayList<Integer>();
		numeros.add(29); // Autoboxing
		
	}

}
