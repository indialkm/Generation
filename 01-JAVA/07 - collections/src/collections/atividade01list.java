package collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Scanner;

public class atividade01list {
	
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		ArrayList<String> cores = new ArrayList<String>();
		
		for(int i = 0 ; i < 5; i++) 
		{
			System.out.println("Digite cor: \n");
			cores.add(leia.nextLine());
			System.out.println();
		}
		
		System.out.println(cores);
		System.out.println();
		
		
		cores.sort(null);
		
		for(String cor: cores) 
		{
		
			System.out.println(cor);

		}
		
		
	}

}
