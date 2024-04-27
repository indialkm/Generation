package vetor;

import java.util.Scanner;

public class exerciciosvetor01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numeros[] = { 1, 8, 2, 3, 24, 9, 308, 401, 5, 6 };
		int numeroProcurado = 0;
		Scanner leia = new Scanner(System.in);

		System.out.print("Digite um número: \n");
		numeroProcurado = leia.nextInt();

		leia.close();

		for (int i = 0; i < 10; i++) {
			if (numeroProcurado != numeros[i] && numeros[i] == numeros[numeros.length - 1]) {
				System.out.print("\nNão encontrado\n");
				
				}else if(numeroProcurado == numeros[i]) {
					System.out.printf("O númer %d faz parte do vetor na posicão %d°: \n", numeroProcurado, i);
					for (int num : numeros) {
					System.out.print(" |" + num + "| ");
					
				}
			}
		}

	}

}
