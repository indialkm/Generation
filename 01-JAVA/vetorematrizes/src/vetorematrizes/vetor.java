package vetorematrizes;

import java.util.Scanner;

public class vetor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("\t\tJogo de adivinhação, qual número têm no vetor: \n\n");
		
		int numeros[] = {1,8,2,3,24,9,308,401,5,6};
		int adivinha = 0;
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Qual número você acha que têm no vetor de 10 posições? \n Digite:");
		adivinha = leia.nextInt();
		
		leia.close();
		
		for(int i = 0; i < 10; i++)
		{
			if(adivinha == numeros[i]) {
			 System.out.printf("Parabéns, você é um ícone, o número %d, está na posição %d \n", adivinha, i);
			 return;
			}else {
				
				System.out.println("\nTente novamente\n");
				 return;
				
			}
		}
		
		
		
		

	}

}