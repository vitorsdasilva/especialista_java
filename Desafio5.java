/*
5) Desafio da estrutura do-while
	Escreva um programa que solicita números inteiros para o usuário 
	de forma "infinita", até que o usuário escolha não digitar mais nenhum número 
	(pergunte ao usuário após informar cada número).

	Some todos os números ímpares e todos os números pares e imprima na saída o resultado.
	
	
*/
import java.util.Scanner;

public class Desafio5 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        boolean digitarProximo = true;
        int somaNumerosPares = 0;
        int somaNumerosImpares = 0;

        do {
            System.out.print("Digite um número: ");
            int numero = entrada.nextInt();

            if (numero % 2 == 0) {
                somaNumerosPares += numero;
            } else {
                somaNumerosImpares += numero;
            }

            System.out.print("Deseja digitar outro número? ");
            digitarProximo = entrada.nextBoolean();
        } while (digitarProximo);

        System.out.printf("Soma dos números pares: %d%n", somaNumerosPares);
        System.out.printf("Soma dos números ímpares: %d%n", somaNumerosImpares);
    }

}