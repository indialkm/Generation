package exercicios;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class exerciciofila {
	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<String>();
		Scanner leia = new Scanner(System.in);
		int menu = 1;
		
		do {
			
			System.out.println("\nOlá! Digite a opção\n|1|Adicionar um novo Cliente na fila.\n|2|Listar todos os Clientes na fila\n!3!Chamar(retirar) uma pessoa da fila\n|0|O programa deve ser finalizado\n");
			menu = leia.nextInt();
			leia.nextLine();
			System.out.print("------------------------------------------------------------");
			
			switch(menu) {
			case 0:
				leia.close();
				break;
			case 1:	
				System.out.println("\nAdicione um nome: \n");
				fila.add(leia.nextLine());
				System.out.println("Cliente adicionado com suceso! \n");
				System.out.println();
				break;
			case 2:
				
				System.out.println("\nO tamanho da lista é de: " + fila.size() + "\n");
				for(String cliente: fila) {
					System.out.println(cliente + "\n");
				}
				break;
			case 3:
				
				if(fila.isEmpty() == true)
				{
					System.out.println("\nA lista está vazia, adicione um cliente para poder ser chamado");
				}else {
					System.out.println("\nNome a ser chamado " + fila.peek() + "\n");
					fila.poll();
				}
					break;
			default:
				break;
			}
			System.out.print("------------------------------------------------------------");
		}while(menu != 0);
		
		
	}

}
