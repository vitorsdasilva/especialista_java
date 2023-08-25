/*Você sabia que existem anos no calendário com 365 dias e outros com 366 dias?

Os anos com 366 dias são chamados de anos bissextos.

Isso acontece para manter o calendário anual ajustado com a translação do planeta Terra e com os eventos sazonais relacionados às estações do ano.

As seguintes regras definem se um ano é ou não um ano bissexto:

São bissextos todos os anos múltiplos de 400, por exemplo: 1600, 2000, 2400, etc
São bissextos todos os múltiplos de 4 e não múltiplos de 100, por exemplo: 1996, 2004, 2008, 2012, etc
Não são bissextos todos os demais anos
Desenvolva um programa que, dado um ano digitado pelo usuário, imprime na tela se é um ano bissexto ou não.

Dica de matemática: para saber se um número é múltiplo de outro, basta realizar o cálculo de módulo (resto da divisão). Um número é múltiplo de outro se o módulo for igual a 0.
*/

import java.util.Scanner;

public class AnoBissexto {
	public static void main (String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o ano : ");
		int anoDigitado = entrada.nextInt();
		
		boolean bissexto = ( (anoDigitado%400 == 0 ) || ( (anoDigitado%4 == 0) 
			&& (anoDigitado%100 != 0) ) );

		if (bissexto)
			System.out.printf("O ano %d é bissexto", anoDigitado);
		else
			System.out.printf("O ano %d não é bissexto", anoDigitado);
	}
}