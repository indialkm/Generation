package listaCondicionais;

import java.util.Scanner;

public class DiagramaAnimais4 {
	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);

		String filo, reino, classe, genero;

		System.out.print("\t\t Taxonomia - Programa\n");

		System.out.print("\n Adicione o filo: ");
		filo = leia.next().toLowerCase();

		System.out.print("\n Adicione o reino: ");
		reino = leia.next().toLowerCase();

		System.out.print("\n Adicione o classe: ");
		classe = leia.next().toLowerCase();

		leia.close();

		if (filo.equals("vertebrado")) {

			if (reino.equals("ave") && classe.equals("carnívoro")) {

				System.out.println("\nÁguia");

			} else if (reino.equals("ave") && classe.equals("onívoro")) {

				System.out.println("\nPomba");

			}

			if (reino.equals("mamífero") && classe.equals("herbívoro")) {

				System.out.println("\nVaca");

			} else if (reino.equals("mamífero") && classe.equals("onívoro")) {
				System.out.println("\nHomem");
			} 

		} else if (filo.equals("invertebrado")) {

			if (reino.equals("inseto") && classe.equals("herbívoro")) {

				System.out.println("\nLargata");

			} else if (reino.equals("inseto") && classe.equals("hematófago")) {

				System.out.println("\nPulga");

			}

			if (reino == "analídeo" && classe.equals("hematófago")) {

				System.out.println("Sanguessuga");

			} else if (reino == "analídeo" && classe.equals("onívoro")) {
				System.out.println("Minhoca");
			} 

		} else {
			System.out.println("Já errou o filo amigo, volta e lembra só pode ser invertebrado ou vertebrado");
		}

	}
}