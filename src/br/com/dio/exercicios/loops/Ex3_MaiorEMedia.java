package br.com.dio.exercicios.loops;

import java.util.Scanner;

/*
Fa�a um programa que leia 5 n�meros
e informe o maior n�mero
e a m�dia desses n�meros.
*/
public class Ex3_MaiorEMedia {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int i = 5;
		int soma = 0;
		int anterior = 0;
		int num;

		do {
			System.out.println("Digite o n�mero: ");
			num = entrada.nextInt();

			if (num > anterior) 
				anterior = num;

			i--;
			soma += num;

		} while (i > 0);

		System.out.println("Maior: " + num);
		System.out.println("M�dia: " + soma / 5);

	}
}
