package matrizes;

import java.util.Scanner;

public class exerciciomatriz01 {

	public static void main(String[] args) {

		int[][] matriz = new int[3][3];
		Scanner leia = new Scanner(System.in);
		float somaPrincipal = 0, somaSecundaria = 0;

		System.out.println("\n  Essa é a matriz: \n");
		

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				
				System.out.println("Digite o número: ");
				matriz[i][j] = leia.nextInt();	
			}
			System.out.println();
		}
		
		for (int i = 0; i < 3; i++) {
			System.out.print("-|---|--|---|--|---|- \n");
			for (int j = 0; j < 3; j++) {
				
				System.out.print(" | " + matriz[i][j] + " | ");
				
			}
			System.out.println();
		}

		System.out.println("\n Elementos da Diagonal Principal\n");

		for (int i = 0; i < 3; i++) {
			System.out.print("-|---|--|---|--|---|- \n");
			for (int j = 0; j < 3; j++) {
				if (i == j) {
					System.out.print(" | " + matriz[i][j] + " | ");
					somaPrincipal += matriz[i][j];
				} else {
					System.out.print(" |   | ");
				}
			}
			System.out.println();
		}

		System.out.println("\nElementos da Diagonal Secundaria\n");
		
		for (int i = 0; i < 3; i++) {
			System.out.print("-|---|--|---|--|---|- \n");
			for (int j = 0; j < 3; j++) {
				if (i + j == 2) {
					System.out.print(" | " + matriz[i][j] + " | ");
					somaSecundaria += matriz[i][j];
				} else {
					System.out.print(" |   | ");
				}
			}
			System.out.println();
		}

		System.out.printf("\nSoma dos Elementos da Diagonal Principal\n| %.2f |\n", somaPrincipal);		

		System.out.printf("\nSoma dos Elementos da Diagonal Principal\n| %.2f |\n", somaSecundaria);

	}
}
