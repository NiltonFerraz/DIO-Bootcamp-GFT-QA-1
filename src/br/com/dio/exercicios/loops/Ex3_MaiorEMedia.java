package br.com.dio.exercicios.loops;

import java.util.Scanner;

/*
Faça um programa que leia 5 números
e informe o maior número
e a média desses números.
*/
public class Ex3_MaiorEMedia {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		int i = 5;
		int soma = 0;
		int anterior = 0;
		int num;

		do {
			System.out.println("Digite o número: ");
			num = entrada.nextInt();

			if (num > anterior) 
				anterior = num;

			i--;
			soma += num;

		} while (i > 0);

		System.out.println("Maior: " + num);
		System.out.println("Média: " + soma / 5);

	}
}
