/*Em aulas anteriores, nós implementamos as regras da Organização Mundial de Saúde para calcular o IMC (Índice de Massa Corporal).

Existem outras regras mais detalhadas, como as da NHANES II survey (USA 1976-1980), que indicam os seguintes critérios para adultos:

Condição	IMC em mulheres	IMC em homens
Abaixo do peso	Menor que 19.1	Menor que 20.7
No peso ideal	Entre 19.1 e 25.8	Entre 20.8 e 26.4
Um pouco acima do peso	Entre 25.9 e 27.3	Entre 26.5 e 27.8
Acima do peso ideal	Entre 27.4 e 32.3	Entre 27.9 e 31.1
Obeso	Maior que 32.3	Maior que 31.1
Implemente um programa que obtém os valores como entrada do usuário e imprime na tela o resultado (condição da pessoa), 
usando essas regras e aplicando todos os conteúdos que você aprendeu até agora neste módulo.
*/

import java.util.Scanner;

public class CalculadoraIMC{
	
	public static void main( String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		boolean ValidaSexo = false; 
		
		String sexo = " ";
		
		while ( !ValidaSexo){
				System.out.print("Sexo: (M/H) ");
				sexo = entrada.next();
				sexo = sexo.toUpperCase();
				System.out.printf("Sexo: %s %n", sexo);
				if ( sexo.equals("M") || (sexo.equals("H")) )  {
					ValidaSexo = true;
				} else {
					System.out.println("Opção Inválida!");
				}
		}
		
		System.out.print("Peso: ");
		double peso = entrada.nextDouble();
		
		System.out.print("Altura: ");
		double altura = entrada.nextDouble();
		
		double imc = ( peso / (altura*altura) );
		System.out.printf("IMC: %s %n", imc);
		
		
		
		
		
		if (sexo.equals("M")) {
			System.out.printf("Sexo == %s%n", sexo);
			if ( imc < 19.1) {
				System.out.printf("Menor que 19.1 %n");
				System.out.print("Abaixo do peso");
			} else if ( imc <= 25.8) {
				System.out.print("Peso ideal");
			} else if (imc <=27.3) {
				System.out.print("Um pouco acima do peso");
			} else if (imc <= 32.3) {
				System.out.print("Acima do peso ideal");
			} else {
				System.out.print("Obeso!");
			}
		
		} else if(sexo.equals("H")) {
			System.out.printf("Sexo == %s%n", sexo);
			if ( imc <= 20.7) {
				System.out.printf("Menor que 19.1 %n");
				System.out.print("Abaixo do peso");
			} else if ( imc <= 26.4) {
				System.out.print("Peso ideal");
			} else if (imc <=27.8) {
				System.out.print("Um pouco acima do peso");
			} else if (imc <= 31.1) {
				System.out.print("Acima do peso ideal");
			} else {
				System.out.print("Obeso!");
			}
		
		}
		
	}
}