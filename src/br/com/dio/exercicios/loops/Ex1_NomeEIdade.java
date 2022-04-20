package br.com.dio.exercicios.loops;

import java.util.Scanner;

/*
Faça um programa que leia conjuntos de dois valores,
o primeiro representando o nome do aluno e o segundo representando a sua idade.
(Pare o programa inserindo o valor 0 no campo nome)
*/
public class Ex1_NomeEIdade {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		String nome = "";
		int idade;
		
		while (nome != "0") {
			System.out.println("Digite o nome: ");
			nome = entrada.next();
			
			if (nome.equals("0")) break;
			
			System.out.println("Digite a idade: ");
			idade = entrada.nextInt();
			System.out.println("Nome: " + nome + " Idade: " + idade);
			
		} 
		
		System.out.println("Continua aqui... ");
		
		
		
		
	}
}
