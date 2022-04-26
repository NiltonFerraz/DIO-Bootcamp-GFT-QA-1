package br.com.dio.desafios;

/*
Desafio
Voc� ter� o desafio de escrever um algoritmo que leia 2 n�meros 
e imprima o resultado da divis�o do primeiro pelo segundo. Caso 
n�o for poss�vel, mostre a mensagem �divisao impossivel� para os 
valores em quest�o.

Entrada
A entrada cont�m um n�mero inteiro N. Este N ser� a quantidade de 
pares de valores inteiros (X e Y) que ser�o lidos em seguida.

Sa�da
Para cada caso mostre o resultado da divis�o com um d�gito ap�s o 
ponto decimal, ou �divisao impossivel� caso n�o seja poss�vel 
efetuar o c�lculo.
 
Exemplo de Entrada 	
3
3 -2
-8 0
0 8

Exemplo de Sa�da
-1.5
divisao impossivel
0.0
*/
import java.io.IOException;
import java.util.Scanner;

public class Desafio3DividirXPorY {

	public static void main(String[] args) throws IOException {

		// complete os espa�os com sua solu��o
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();

		for (int i = 0; i < n; i++) {
			double x = input.nextDouble();
			double y = input.nextDouble();

			if (y == 0) {
				System.out.println("divisao impossivel");
			} else {
				System.out.printf("%.1f\n", (double) (x / y));
			}
		}

	}
}
