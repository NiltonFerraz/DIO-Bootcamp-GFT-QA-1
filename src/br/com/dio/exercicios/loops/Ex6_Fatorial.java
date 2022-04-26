package br.com.dio.exercicios.loops;

import java.util.Scanner;

/*
Fa�a um programa que calcule o fatorial de um n�mero inteiro fornecido pelo usu�rio.
Ex.: 5!= 120 (5 X 4 X 3 X 2 X 1)
*/
public class Ex6_Fatorial {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Entre com o n�mero fatorial: ");
		int fatorial = entrada.nextInt();
		int cont = fatorial;
		
		for (int i = fatorial; i > 1; i--) {
			cont--;
			fatorial = fatorial * cont;
		}
		
		System.out.println("Resultado Fatorial: " + fatorial);
	}
}
