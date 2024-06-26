package exercicios;

import java.util.Scanner;
import java.util.Stack;

public class exerciciopilha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> pilha = new Stack<String>();
		Scanner leia = new Scanner(System.in);
		int menu = 1;

		do {
			System.out.println("\n*****************************\n");
			System.out.println("|1| Adicionar Libro na pilha\n|2| Listar todos os Livros\n|3| Retirar Livro da pilha\n|0| Sair\n");
			menu = leia.nextInt();
			leia.nextLine();
			System.out.println("*****************************");
			
			switch(menu){
			case 0:
				leia.close();
				break;
			case 1:
				System.out.println("Qual o nome do livro\n");
				pilha.push(leia.nextLine());
				System.out.println("Livro adicionado\n");
				break;
			
			case 2:
				System.out.println("Essa lista têm livros "+ pilha.size() +" e os livros são: \n");
				
				for(String livro: pilha) {
					System.out.println(livro + " \n");
				}
				break;
				
			case 3:
				
				if(pilha.empty() == true) {
					
					System.out.println("Lista vazia adicione um livro\n");
				}else {
					System.out.println("O livro a ser chamado é:" + pilha.peek());
					pilha.pop();				}
			
			break;
			
			default:
				System.out.println("Você escolheu uma posição errada, escolhe de novo");
				break;
			
			}

		} while (menu != 0);
	}

}
