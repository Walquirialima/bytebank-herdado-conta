package br.com.bytebank.banco.test;

public class TesteString {

	public static void main(String[] args) {
		
//		String nome = "Walquiria"; // object literal
//		
//		for(int i = 0; i <nome.length(); i++) {
//			System.out.println(nome.charAt(i)); // mostrando todos os caracteres usando o FOR
//		}
//		
//		//String outro = new String("Alura"); //má pratica, sempre prefere a sintaxe literal
//		
//		//String novo = outro.replace("A", "a"); // metodo para alterar a letra maiscula para minuscula
//		
//		//String novo = nome.toUpperCase(); //metodo para aumentar a letra
//		String novo = nome.toLowerCase(); //metodo para diminuir a letra
//		
//		char c = nome.charAt(3); //retorna o valor no indice especifico
//		System.out.println(c);
//		
//		int pos = nome.indexOf("ria");
//		System.out.println(pos); // retorna o indice dentro da String com o indice especificado
//		
//		String sub = nome.substring(1);
//		System.out.println(sub); // retorna a string que é uma substring desta string
//		
//		String vazio = " Alura ";
//		String outroVazio = vazio.trim(); // anula todos os espaço em uma String
//		
//		System.out.println(outroVazio.isEmpty()); // retorna se a string esta vazia e devolve um booleano true ou false
//		
//		System.out.println(vazio.contains("Alu")); // verifica se a String possui uma substring
//		
//		System.out.println(novo);
		
//		String texto = "Socorram";
//		texto = texto.concat("-");
//		texto = texto.concat("me");
//		texto = texto.concat(", ");
//		texto = texto.concat("subi ");
//		texto = texto.concat("no ");
//		texto = texto.concat("ônibus ");
//		texto = texto.concat("em ");
//		texto = texto.concat("Marrocos");
//		System.out.println(texto); 
		
		StringBuilder builder = new StringBuilder("Socorram");
		builder.append("-");
		builder.append("me");
		builder.append(", ");
		builder.append("subi ");
		builder.append("no ");
		builder.append("ônibus ");
		builder.append("em ");
		builder.append("Marrocos");
		String texto = builder.toString();
		System.out.println(texto);
		
	}

}
