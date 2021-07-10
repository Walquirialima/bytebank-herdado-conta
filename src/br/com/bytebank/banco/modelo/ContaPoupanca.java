package br.com.bytebank.banco.modelo;

public class ContaPoupanca extends Conta {
	
	public ContaPoupanca(int agencia, int numero) {
		super(agencia, numero);
	}

	// implementação do metodo abstrato da classe Conta
	@Override
	public void deposita(double valor) {
		super.saldo += valor;
		
	}
	
	@Override
	public String toString() {
		return "ContaPoupana, " + super.toString();
	}

}
