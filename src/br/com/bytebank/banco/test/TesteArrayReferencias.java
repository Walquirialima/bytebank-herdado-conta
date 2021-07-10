package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArrayReferencias {

	public static void main(String[] args) {
		
		//criando uma variavel do tipo ContaCorrente chamada cc1, recebendo um construtor vazio
		ContaCorrente cc1 = new ContaCorrente();
		//criando uma variavel do tipo ContaCorrente chamada cc2, recebendo a referencia de cc1
		ContaCorrente cc2 = cc1;
		
		// criado uma array de conta corrente unidimensional, chamada listacontas de tamanho 5
		ContaCorrente[] listaContas = new ContaCorrente[5];
		listaContas[0] = cc2;
		
		System.out.println(cc1.getNumero());
		System.out.println(cc2.getNumero());
		System.out.println(listaContas[0].getNumero());
		
		cc1.setNumero(44);
		
		System.out.println(cc1.getNumero());
		System.out.println(cc2.getNumero());
		System.out.println(listaContas[0].getNumero());

	}

}
