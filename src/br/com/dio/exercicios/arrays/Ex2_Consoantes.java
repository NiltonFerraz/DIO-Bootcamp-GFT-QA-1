package br.com.dio.exercicios.arrays;

/*
Faça um Programa que leia um vetor de 6 caracteres,
e diga quantas consoantes foram lidas.
Imprima as consoantes.
*/
public class Ex2_Consoantes {

	public static void main(String[] args) {

		String[] vetor = { "a", "b", "c", "d", "e", "f" };
		
		int soma = 0;

		for (int i = 0; i < vetor.length; i++) {

			if (
					vetor[i].equals("a") || 
					vetor[i].equals("e") || 
					vetor[i].equals("i") || 
					vetor[i].equals("o") || 
					vetor[i].equals("u")) {
			
			} else {
				soma++;
				System.out.println(vetor[i]);
			}
		}
		System.out.println("Total Consoantes: " + soma);
	}
}
