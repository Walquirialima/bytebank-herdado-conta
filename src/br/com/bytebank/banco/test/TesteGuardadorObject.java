package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.GuardadorDeObject;

public class TesteGuardadorObject {
	
	public static void main(String[] args) {
		
		GuardadorDeObject guardador = new GuardadorDeObject();
		
		Conta cc1 = new ContaCorrente(22, 11);		
		guardador.adicionar(cc1);
		
		Conta cc2 = new ContaCorrente(22, 22);		
		guardador.adicionar(cc2);
		
		int tamanho = guardador.getQuantidadeDePosicao();
		System.out.println(tamanho);
		
		Conta ref = (Conta) guardador.getReferencia(0);
		System.out.println(ref.getNumero());
		
	}

}
