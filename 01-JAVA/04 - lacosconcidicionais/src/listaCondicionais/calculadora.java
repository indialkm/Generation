package listaCondicionais;

import java.util.Scanner;

public class calculadora {

	public static void main(String[] args) {

//		Faça um algoritmo em Java que leia 3 valores inteiros 
//		A, B e C e imprima na tela se a soma de A + B é maior, menor ou igual a C.

		Scanner leia = new Scanner(System.in);

		System.out.println("Digite o 1º numero: ");
		int numero1 = leia.nextInt();
		System.out.println("Digite o 2º numero: ");
		int numero2 = leia.nextInt();
		System.out.println("Digite a operação ");
		String operacao = leia.next();
		int resultado;
		
		leia.close();

		switch (operacao) {
		case "+":
			resultado = numero1 + numero2;
			System.out.printf("O resultado da soma : %d", resultado);
			break;

		case "-":
			if (numero1 > numero2) {
				resultado = numero1 - numero2;
				System.out.printf("O resultado da subtração : %d", resultado);
			} else {
				resultado = numero2 - numero1;
				System.out.printf("O resultado da subtração : %d", resultado);
			}

			break;

		case "*":
			resultado = numero1 * numero2;
			if(resultado % 2 == 0) {
			System.out.printf("Esse número é par e sua multiplicação é : %d", resultado);
			}else {
				System.out.printf("Esse número é ímpar e sua multiplicação é : %d", resultado);	
			}
			break;

		case "/":
			if (numero1 > numero2) {
				resultado = numero1 / numero2;
				int resto = numero1%numero2;
				System.out.printf("O resultado da divisão : %d\n", resultado);
				System.out.printf("E o seu resto é : %d", resto);
				
			} else {
				resultado = numero2 / numero1;
				int resto = numero1%numero2;
				System.out.printf("O resultado da dividir : %d\n", resultado);
				System.out.printf("E o seu resto é : %d", resto);
			}
			break;

		default:
			System.out.println("Filhão, se escolheu a operação errada. Vamos prestar atenção!");
			break;
		}

	}

}
