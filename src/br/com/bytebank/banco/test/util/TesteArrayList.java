package br.com.bytebank.banco.test.util;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayList {

	public static void main(String[] args) {

		//Generics
		//uma lista de objetos do tipo Conta
		List<Conta> lista = new Vector<Conta>(); //thread safe

		Conta cc1 = new ContaCorrente(22, 11);
		lista.add(cc1);

		Conta cc2 = new ContaCorrente(22, 22);
		lista.add(cc2);

		Conta cc3 = new ContaCorrente(33, 1010);
		lista.add(cc3);

		Conta cc4 = new ContaCorrente(33, 2020);
		lista.add(cc4);

		// saida com o tamanho da array
		System.out.println(lista.size());

		// pegar um indice
		Conta ref = lista.get(0);
		System.out.println(ref.getNumero());

		lista.remove(0);

		System.out.println("Tamanho: " + lista.size());

		for (int i = 0; i < lista.size(); i++) {
			Object oRef = lista.get(i);
			System.out.println(oRef);
		}

		System.out.println("---------------------------------------");

		for (Conta conta : lista) {
			System.out.println(conta);

		}

	}

}
