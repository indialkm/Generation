package exercicio01;

import java.util.Scanner;

public class media {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite a nota 1: ");
		float nota1 = leia.nextFloat();
		
		System.out.println("Digite a nota 2: ");
		float nota2 = leia.nextFloat();
		
		System.out.println("Digite a nota 3: ");
		float nota3 = leia.nextFloat();
		
		System.out.println("Digite a nota 4: ");
		float nota4 = leia.nextFloat();
		
		float media = (nota1 + nota2 + nota3 + nota4)/ 4;
		
		System.out.printf("A média desse aluno é é %.2f",media);
		
	}

}
