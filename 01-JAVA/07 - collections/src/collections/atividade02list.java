package collections;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class atividade02list {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Escreva um programa Java para criar uma Collection ArrayList de Objetos 
//		da Classe Wrapper Integer, inicializada com 10 valores inteiros. 
//		O programa deverá solicitar ao usuário, que ele digite via teclado 1
//		número inteiro e caso ele seja encontrado no ArrayList, exiba na tela a 
//		posição deste número na Collection. Caso o número não seja encontrado, 
//		ele deverá exibir na tela a mensagem: O número NN não foi encontrado!

		ArrayList<Integer> lista = new ArrayList<Integer>();
		Random random = new Random();
		Scanner leia = new Scanner(System.in);
		Integer numeroAdivinhado = 0;
		int p = 0;
		
		System.out.println("Jogo: Vamos adivinha um número\nVocê tem 3 chances\n\n");
		
		for (int i = 0; i < 10; i++) {
				int numero = random.nextInt(999) + 3;
				lista.add(numero);
			}
		
		do {
			

			System.out.println("Qual número que pode ter dentro desse vetor?Adivinha: \n");
			numeroAdivinhado = leia.nextInt();
			System.out.println();
			leia.nextLine();
			

			boolean venceu = lista.contains(numeroAdivinhado);	
			if (venceu == true) {
				System.out.println("Você venceu\n");
				System.out.println(lista);
				return;

			} else {
				p++;
				if (p == 3) {
					System.out.println("Você perdeu esse é o nosso vetor");
					System.out.println();
					System.out.println(lista);
					return;
				}

			}

		} while (p != 3);

	}
}
