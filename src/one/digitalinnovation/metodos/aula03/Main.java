package one.digitalinnovation.metodos.aula03;

import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// Retornos
		System.out.println("Exercício retornos");
		
		double areaQuadrado = Quadrilatero.area(3);
		System.out.println("Área do quadrado: " + areaQuadrado);

		double areaRetangulo = Quadrilatero.area(5, 5);
		System.out.println("Área do retângulo: " + areaRetangulo);

		double areaTrapezio = Quadrilatero.area(7, 8, 9);
		System.out.println("Área do trapézio: " + areaTrapezio);
		
		
			//complete os espaços com sua solução
	                Scanner leitor = new Scanner(System.in);
			int N = leitor.nextInt();
			double X, Y;
			for (int i = 0; i < N; i++) {
				X = leitor.nextDouble();
				Y = leitor.nextDouble();
				if (Y ==  0   ) System.out.println("divisao impossivel");
				else System.out.println( X / Y);
			}
	    
		
	}
}
