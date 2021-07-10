package br.com.bytebank.banco.modelo;

/**
 * Classe representa a moldura de uma conta
 * 
 * @author tipor
 *
 */

// não pode instanciar objetos da classe abstrata
public abstract class Conta {
	
	//protected publico somente para os filhos
	protected double saldo;
	private int agencia;
	private int numero;
	private Cliente titular;
	private static int total;
	
	/**
	 * Construtor para inicializar o objeto Conta a partir dos paramentros agencia e numero
	 * @param agencia
	 * @param numero
	 */
	// construtor, pode ser chamado atraves de um filho com a palavra chave super
	public Conta(int agencia, int numero) {
		Conta.total ++;
		//System.out.println("o total de contas é " + Conta.total);
		
		this.agencia = agencia;
		this.numero = numero;
		//System.out.println("estou criando uma conta " + this.numero);
	}

	// métodos da classe abstrato e não pode ter implementação, sendo os filhos obrigados a implementar
	public abstract void deposita(double valor);

	/**
	 * Valor precisa ser maior que o saldo.
	 * 
	 * @param valor
	 * @throws SaldoInsuficienteException
	 */
	
	public void saca(double valor) throws SaldoInsuficienteException{
	
		if (this.saldo < valor) {
			throw new SaldoInsuficienteException("Saldo: " + this.saldo + ", Valor: " + valor);
		}  
			this.saldo -= valor;
	}

	public void transfere(double valor, Conta destino) throws SaldoInsuficienteException {
		this.saca(valor);
		destino.deposita(valor);
	}

	public double getSaldo() {
		return this.saldo;

	}
	
	public int getNumero() {
		return this.numero;
	}
	
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	public int getAgencia() {
		return this.agencia;
	}
	
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	
	public void setTitular(Cliente titular) {
		this.titular = titular;
	}
	
	public Cliente getTitular() {
		return this.titular;
	}
	
	public static int getTotal() {
		return Conta.total;
	}
	
	// anotação fala para o compilador que o metodo deve sobreescrever o metodo da classe mae
	@Override
	public boolean equals(Object ref) {
		
		Conta outra = (Conta) ref;
		
		if(this.agencia != outra.agencia) {
			return false;
		}
		
		if(this.numero != outra.numero) {
			return false;
		}
		
		return true;
	}
	
	@Override
	public String toString() {
		return " Numero: " +  this.getNumero() + " Agencia: " +  this.getAgencia();
	}
}
