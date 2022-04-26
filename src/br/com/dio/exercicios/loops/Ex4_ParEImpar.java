package br.com.dio.exercicios.loops;

import java.util.Scanner;

/*
Fa�a um programa que pe�a N n�meros inteiros,
calcule e mostre a quantidade de n�meros pares
e a quantidade de n�meros impares.
*/
public class Ex4_ParEImpar {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int quantidade, num, par = 0, impar = 0;
		int contador = 0;

		System.out.println("Informe a quantidade de n�meros: ");
		quantidade = entrada.nextInt();

		while (contador < quantidade) {
			System.out.println("Informe o n�mero: ");
			num = entrada.nextInt();

			if (num % 2 == 0) {
				par++;
			} else
				impar++;

			quantidade--;
		}
		System.out.println("Pares: " + par);
		System.out.println("�mpares: " + impar);

	}
}
