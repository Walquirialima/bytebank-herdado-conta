package br.com.bytebank.banco.modelo;

public class GuardadorDeObject {
	
	//array de Conta
	private Object[] referencias;
	
	//variavel do tipo int posicao para guardar a posicao
	private int posicaoLivre;
	
	//construtor para inicializar o atributo de uma array do tipo referencias
	public GuardadorDeObject() {
		this.referencias = new Object[10];
		this.posicaoLivre = 0;
		
	}

	public void adicionar(Object ref) {
		this.referencias[this.posicaoLivre] = ref;
		this.posicaoLivre++;
		
	}

	public int getQuantidadeDePosicao() {
		return this.posicaoLivre;
	}

	public Object getReferencia(int posicao) {		
		return this.referencias[posicao];
	}

}
