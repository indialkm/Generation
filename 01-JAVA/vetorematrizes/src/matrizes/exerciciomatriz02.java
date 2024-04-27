package matrizes;

import java.util.Random;
import java.util.Scanner;

public class exerciciomatriz02 {

	public static void main(String[]args) {
		
		
		Random rand = new Random();
		Scanner leia = new Scanner(System.in);
		float[][] matriz = new float[10][4];
		float[] media = new float[10];
		float soma = 0;
		
		for(int i = 0; i < 10; i++)
		{
			for(int j = 0; j < 4; j++)
			{
				System.out.println("Digite uma nota: \n");
				matriz[i][j] = leia.nextFloat();
				
//				matriz[i][j] = rand.nextFloat(10); 
			}
		}
		
		System.out.print("Notas: \n\n");
		System.out.print("----------|----|----|----|----| \n");
		for(int i = 0 ; i < 10; i++)
		{
			
			System.out.printf("%d° Aluno: ", i+1);
			
			for(int j = 0; j < 4; j++)
			{
				
				System.out.printf("|%.1f ", matriz[i][j]);
				media[i] += matriz[i][j];
				
			}
			System.out.println("|");
			System.out.print("----------|----|----|----|----| \n");
		}
		
		System.out.print("\nMédia dos alunos: \n\n");
		for(int i = 0; i < 10; i++)
		{
			System.out.printf("Aluno %d° : |%.1f|\n", i + 1 ,  media[i]/10);
		}
	}
	
}
