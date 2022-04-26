package br.com.dio.exercicios.loops;

import java.util.Scanner;

/*
Faça um programa que peça N números inteiros,
calcule e mostre a quantidade de números pares
e a quantidade de números impares.
*/
public class Ex4_ParEImpar {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int quantidade, num, par = 0, impar = 0;
		int contador = 0;

		System.out.println("Informe a quantidade de números: ");
		quantidade = entrada.nextInt();

		while (contador < quantidade) {
			System.out.println("Informe o número: ");
			num = entrada.nextInt();

			if (num % 2 == 0) {
				par++;
			} else
				impar++;

			quantidade--;
		}
		System.out.println("Pares: " + par);
		System.out.println("Ímpares: " + impar);

	}
}
