package one.digitalinnovation.metodos.aula03;

import java.io.IOException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		// Retornos
		System.out.println("Exerc�cio retornos");
		
		double areaQuadrado = Quadrilatero.area(3);
		System.out.println("�rea do quadrado: " + areaQuadrado);

		double areaRetangulo = Quadrilatero.area(5, 5);
		System.out.println("�rea do ret�ngulo: " + areaRetangulo);

		double areaTrapezio = Quadrilatero.area(7, 8, 9);
		System.out.println("�rea do trap�zio: " + areaTrapezio);
		
		
			//complete os espa�os com sua solu��o
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
