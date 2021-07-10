package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TestandoArrayReferencia {

	public static void main(String[] args) {
		
		//array do tipo Object que pode guardar qualquer referencia
		Object[] referencias = new Object[5];
		
		ContaCorrente cc1 = new ContaCorrente(22, 11);
		referencias[0] = cc1;
		
		ContaPoupanca cc2 = new ContaPoupanca(22, 22);
		referencias[1] = cc2;
		
		Cliente cliente = new Cliente();
		referencias[2] = cliente;
		
		Object referenciaGenerica = referencias[1];
		
		System.out.println(((ContaPoupanca) referenciaGenerica).getNumero());
		
		//com o type cast transforma a referencia que é do tipo Conta para mais especifica ContaPoupanca
		Conta ref = (ContaPoupanca)referencias[1];
		
		//imprime a mesma referencia do objeto criado
		System.out.println(ref.getNumero());
		System.out.println(cc2.getNumero());
	
		
		// Cast implicito primitivo
		int numero = 3;
		//double valor = numero;
		
		// Cast explicito primitivo
		double valor = (double) numero;
		
		System.out.println(valor);
		
		// double não cabe no int, por isso tem que usar um cast explicito para compilar
		double valor1 = 3.6;
		int numero1 = (int) valor1;
		
		System.out.println(numero1);
		

	}

}
