package Exercicioswhile;

import java.util.Scanner;

public class Lista01W {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		leia a idade de várias pessoas (números inteiros),
//		mostre na tela o total de pessoas cuja idade seja menor que 21 anos e o maior que 50 anos
//		.A leitura dos dados deve ser finalizada ao 
//		digitar uma idade negativa. 

		Scanner leia = new Scanner(System.in);
		int i = 0, j = 0, idade = 1;

		while (idade > 0) 
		{
			
			System.out.print("Digite a idade de fulaninho: \n");
			idade = leia.nextInt();

			if (idade > 0 && idade < 21) 
			{
				i++;

			} else if (idade > 0 && idade > 50) 
			
			{
				
				j++;
			}

		}
		
		System.out.printf("Total de menores de 21 anos: %d\nTotal de pessoas maiores de 50 anos:%d\n", i, j);

	}

}
