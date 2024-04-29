package vetor;

import java.util.Arrays;
import java.util.Random;

public class exerciciosvetor02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random rand = new Random();
		int numeros[] = new int[10];
		float soma = 0;
		
		System.out.println("\t\t\tVetor inicial:\n");
		for(int i = 0; i < 10; i++)
		{
			numeros[i] = rand.nextInt(1000);
			System.out.print(" |"+numeros[i] + "| ");
			soma += numeros[i];
		}
		
		System.out.println("\n\n\t\t\tVetor ordenado:\n");
		Arrays.sort(numeros);
		for(int numero : numeros)
		{
			System.out.print(" |"+numero+ "| ");
		}
		
		System.out.println("\n\n\t\t\tNúmeros pares:\n");
		for(int numero: numeros)
		{	
			
			if(numero % 2 == 0)
			{
				System.out.print(" |"+numero+ "| ");
			}
			
			
		}
		
		System.out.println("\n\n\t\t\tNúmeros ímpares:\n");
		for(int numero: numeros)
		{	
				
			if(numero % 2 != 0) 
			{
				System.out.print(" |"+numero+ "| ");
			}

		}
		
		
		System.out.println("\n\n\t\t\tSoma dos números do vetor:\n" + "|" + soma + "| \n");
		System.out.println("\n\n\t\t\tSoma dos números do vetor:\n" + "|" + soma/10 + "| \n");
			
	}

}
