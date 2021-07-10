package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TestandoOutrasReferencias {

	public static void main(String[] args) {
	
		//criando uma array de ContaPoupanca unidimensional chamada contas do tamanho 10
		ContaPoupanca[] contas = new ContaPoupanca[10];
		ContaPoupanca cp1 = new ContaPoupanca(11, 22);
		ContaPoupanca cp2 = new ContaPoupanca(33, 44);
		
		//contas[0] = cp1;
		//contas[1] = cp1;
		//contas[4] = cp2;
		//contas[5] = cp2;
		
		//ContaPoupanca ref1 = contas[1];
		//ContaPoupanca ref2 = contas[4];
		
		//System.out.println(cp2.getNumero());
		//System.out.println(contas[4].getNumero());
		//System.out.println(ref2.getNumero());
		
		contas[0] = cp1;
		contas[4] = cp2;

		System.out.println(contas[1].getNumero());
	}
}
