package br.com.dio.desafios;

/*  Desafio
Tendo como base a hora inicial e final de um jogo, 
calcule a duração dele, sabendo que o mesmo pode 
começar em um dia e terminar em outro, tendo uma 
duração mínima de, 60 minutos e máxima de 24 horas.

Entrada
A entrada contém dois valores inteiros representando 
a hora de início e a hora de fim do jogo.

Saída
Apresente a duração do jogo conforme exemplo abaixo.
 
Exemplo de Entrada 	Exemplo de Saída
16 2				O JOGO DUROU 10 HORA(S)
0 0					O JOGO DUROU 24 HORA(S)
2 16				O JOGO DUROU 14 HORA(S)  */
import java.util.Scanner;

public class Desafio6TempoJogo {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int inicio, fim, horas;
		inicio = scan.nextInt();
		fim = scan.nextInt();

		if (inicio == 0 && fim == 0) {
			System.out.print("O JOGO DUROU 24 HORA(S)\n");
		} else if (inicio > fim) {
			System.out.print("O JOGO DUROU " + (24 - (inicio - fim)) + " HORA(S)\n");
		} else if (fim > inicio) {
			System.out.print("O JOGO DUROU " + (fim - inicio) + " HORA(S)\n");
		}
	}
}
