package br.com.dio.exercicios.arrays;

/*
Crie um vetor de 6 números inteiros
e mostre-os na ordem inversa.
*/
public class Ex1_OrdemInversa {

	public static void main(String[] args) {

		int[] vetor = { 5, 6, 2, 8, 4, 1 };

		for (int j = vetor.length - 1; j >= 0; j--) {

			if (j != 0)
				System.out.print(vetor[j] + ", ");
			else
				System.out.print(vetor[j]);

		}
	}
}
