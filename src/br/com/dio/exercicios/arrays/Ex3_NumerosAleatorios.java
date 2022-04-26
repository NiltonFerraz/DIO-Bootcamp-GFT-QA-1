package br.com.dio.exercicios.arrays;

import java.util.Random;

/*
Fa�a um Programa que leia 20 n�meros inteiros aleat�rios (entre 0 e 100) armazene-os num vetor.
Ao final mostre os n�meros e seus sucessores.
*/
public class Ex3_NumerosAleatorios {

	public static void main(String[] args) {

		Random valorRandom = new Random();

		int[] vetor = new int[20];

		for (int i = 0; i < 20; i++) {
			vetor[i] = valorRandom.nextInt(100);
//			System.out.print(vetor[i] + " ");
		}

		System.out.print("Valores:    ");
		for (int i : vetor) {
			System.out.print(i + " ");
		}

		System.out.print("\nSucessores: ");
		for (int i : vetor) {
			System.out.print(++i + " ");
		}
	}
}
