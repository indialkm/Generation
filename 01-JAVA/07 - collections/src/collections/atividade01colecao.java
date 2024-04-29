package collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class atividade01colecao {
	public static void main(String[] args) {
		Set<Integer> conjunto = new HashSet<Integer>();
		Scanner leia =  new Scanner(System.in);
		
		
		for(int i = 0; i < 10; i++)
		{
			int num = 0;
			System.out.print("Digite um número, mas não pode ser repetido: \n");
			conjunto.add(leia.nextInt());
			System.out.println();
		}
		
		System.out.print("Lista dos números: ");
		Iterator<Integer> iterator = conjunto.iterator();
		while (iterator.hasNext()) {
	            Integer elemento = iterator.next();
	            System.out.print(" |" +elemento+ "| ");
	        }

		
	}

}
