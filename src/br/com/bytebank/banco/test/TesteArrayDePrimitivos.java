package br.com.bytebank.banco.test;

public class TesteArrayDePrimitivos {

	// Array []
	public static void main(String[] args) {

		int[] idades = new int[5]; // inicializa o array com os valores padroes

		for (int i = 0; i < idades.length; i++) {
			idades[i] = i * i;

			System.out.println(idades[i]);
		}

		idades[0] = 59;
		idades[1] = 39;
		idades[2] = 49;
		idades[3] = 59;
		idades[4] = 69;
		
		int idades1 = idades[4];

		System.out.println(idades1);

		System.out.println(idades.length);
	
		// Entrada de dados com numeros Float
		
		float[] numeros = new float[10];
		
		double numeros1 = numeros[0];
		
		numeros[0] = 1.0f;
		numeros[1] = 2.0f;
		numeros[2] = 3.0f;
		numeros[3] = 4.0f;
		numeros[4] = 5.0f;
		numeros[5] = 6.0f;
		numeros[6] = 7.0f;
		numeros[7] = 8.0f;
		numeros[8] = 9.0f;
		numeros[9] = 10.0f;
		
		for(int i = 0; i < numeros.length; i++) {
			System.out.println(numeros[i]);
		}
				
		System.out.println(numeros1);
		
		
		
		

	}
		

}
