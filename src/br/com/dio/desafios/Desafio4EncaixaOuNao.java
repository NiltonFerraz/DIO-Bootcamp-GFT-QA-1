package br.com.dio.desafios;

import java.util.Scanner;

/*
Paulinho tem em suas mãos um pequeno problema. A professora lhe 
pediu que ele construísse um programa para verificar, à partir 
de dois valores inteiros A e B, se B corresponde aos últimos 
dígitos de A.

Entrada
A entrada consiste de vários casos de teste. A primeira linha 
de entrada contém um inteiro N que indica a quantidade de casos 
de teste. Cada caso de teste consiste de dois inteiros 
A (1 ≤ A < 231 ) e B (1 ≤ B < 231) positivos.

Saída
Para cada caso de entrada imprima uma mensagem indicando se o 
segundo valor encaixa no primeiro valor, confome exemplo abaixo.
 
Exemplo de Entrada 	
4
5678690 78690
5434554 543
1243 1243
54 654
	
Exemplo de Saída
encaixa
nao encaixa
encaixa
nao encaixa
import java.util.Scanner;
*/
public class Desafio4EncaixaOuNao {

	public static void main(String[] args) throws Exception {

		Scanner input = new Scanner(System.in);
		int A, B;

		A = input.nextInt();
		B = input.nextInt();

		if ((A % B == 0) | (B % A == 0)) {
			System.out.println("Sao Multiplos");
		} else {
			System.out.println("Nao sao Multiplos");
		}
	}
}
