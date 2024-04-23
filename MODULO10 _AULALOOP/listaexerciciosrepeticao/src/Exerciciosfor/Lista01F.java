package Exerciciosfor;

import java.util.Scanner;

public class Lista01F {

	public static void main(String[] args) {
//		Escreva um algoritmo em Java, que leia 2 números inteiros via teclado, onde o primeiro número deve ser menor do 
//		que o segundo número. Caso contrário, deve ser exibida uma mensagem na tela informando que o intervalo é inválido e 
//		sair do programa.  No intervalo informado, mostre na tela todes os números que são múltiplos de 3 e 5. 
		
		Scanner leia = new Scanner(System.in);
		int num01, num02, i;
		
		System.out.print("Digite um número: \n");
		num01 = leia.nextInt();
		
		System.out.print("Digite outro número: \n");
		num02 = leia.nextInt();
		
		
		if(num01 < num02)
		{
			for(i = num01; i <= num02; i++) {
				
				if((i % 3 == 0) && (i % 5 == 0)) {
					System.out.printf("%d é múltiplo de 3 e 5 \n", i);
				}

				
			}
			
		}else {
			System.out.print("\nIntervalo inválido");
		}
			


	}

}
