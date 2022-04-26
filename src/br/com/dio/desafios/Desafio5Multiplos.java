package br.com.dio.desafios;
/*
Leia 2 valores inteiros (A e B). Ap�s, o programa deve mostrar uma 
mensagem "Sao Multiplos" ou "Nao sao Multiplos", indicando se os 
valores lidos s�o m�ltiplos entre si.

Entrada
A entrada cont�m valores inteiros.

Sa�da
A sa�da deve conter uma das mensagens conforme descrito acima.
 
Exemplo de Entrada 	Exemplo de Sa�da
6 24				Sao Multiplos
6 25				Nao sao Multiplos
*/
import java.io.IOException;
import java.util.Scanner;

public class Desafio5Multiplos {

	public static void main(String[] args) throws IOException {
    	
        Scanner leitor = new Scanner(System.in);
        //continue a solucao
        int A  = leitor.nextInt();
        int B  = leitor.nextInt();
        if ( B % A == 0 ) {
            System.out.println("Sao Multiplos");
        } else {
        	System.out.println("Nao sao Multiplos");
            
        }
    }
}
