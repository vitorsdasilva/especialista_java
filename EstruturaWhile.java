/*
3) Desafio da estrutura while
	Escreva um programa que solicita números inteiros ao usuário de forma contínua 
	e soma todos os números informados.

	O programa deve parar de solicitar mais números e imprimir a soma deles na saída 
	apenas quando o valor total somado for igual ou superior a 100.

	
*/

import java.util.Scanner;

public class EstruturaWhile {
	public static void main (String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		int numero;
		int totalSomado = 0;
		while (true){
			System.out.print("Numero inteiro: ");
			numero = entrada.nextInt(); 
			totalSomado += numero;
			if (totalSomado > 100) {
				break;
			}
		}
		
		System.out.printf ("A soma total é %d ", totalSomado); 
	}
}