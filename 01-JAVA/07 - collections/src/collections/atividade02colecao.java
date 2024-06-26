package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class atividade02colecao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> conjunto = new HashSet<Integer>();
		Scanner leia =  new Scanner(System.in);
		Random rand = new Random();
		Integer numeroAdivinhado = 0;
		
		for(int i = 0; i < 10; i++)
		{
			conjunto.add(rand.nextInt(100));
			
		}
		
		System.out.println("Digita um número: ");
		numeroAdivinhado = leia.nextInt();
		leia.close();
		
		Iterator<Integer> iterator = conjunto.iterator();

		while (iterator.hasNext()) {
			  Integer elemento = iterator.next();
				System.out.print(" | "+ elemento + " | ");
	          
				if(elemento == numeroAdivinhado)
				{
					System.out.printf("\nNúmero %d encontrado\n", numeroAdivinhado);
				
					
				}else if(elemento != numeroAdivinhado && iterator.hasNext() == false){
					System.out.printf("\nO número %d não foi encontrado\n", numeroAdivinhado);
				}
		}
		
	}

}
