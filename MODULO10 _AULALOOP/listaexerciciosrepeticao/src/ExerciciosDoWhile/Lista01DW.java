package ExerciciosDoWhile;

import java.util.Scanner;

public class Lista01DW {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Escreva um algoritmo em Java, que leia números inteiros via teclado,
//		até que o número zero seja digitado. Ao final, mostre na tela a soma de todos os números digitados, 
//		que sejam positivos. 
		
		Scanner leia = new Scanner(System.in);
		int num = 1,soma = 0;
		
		do 
		{
			System.out.print("Digite um número: ");
			num = leia.nextInt();
			
			if(num > 0)
			{
				soma += num;
	
			}
			
			
		}while(num != 0);

		System.out.printf("A soma dos números positivos é: %d", soma);
	
	
	}

}
