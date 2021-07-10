package br.com.bytebank.banco.modelo;

public class ContaCorrente extends Conta implements Tributavel{
	
	public ContaCorrente(int agencia, int numero) {
		super(agencia, numero);
	}
	
	public ContaCorrente() {
		super(0, 0);
	}
	
	@Override
    public void saca(double valor) throws SaldoInsuficienteException {
        double valorTaxa = valor + 0.2;
        super.saca(valorTaxa);
	}

	// implementação do metodo abstrato da classe Conta
	@Override
	public void deposita(double valor) {
		super.saldo += valor;
		
	}

	@Override
	public double getValorImposto() {
		return super.saldo * 0.01;
	}

	
	@Override
	public String toString() {
		return "ContaCorrente, " + super.toString();
	}
}
