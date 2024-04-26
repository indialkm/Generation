package vetorematrizes;

import java.util.Scanner;

public class jogoDaVelha {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		String jogadorX;
		String jogadorO;
		String tabuleiro[][] = new String[3][3];
		int escolha = 1;

		do {
			printJogo(tabuleiro);
			System.out.println();
			jogadorX(tabuleiro);
			printJogo(tabuleiro);
			System.out.println();
			jogadorO(tabuleiro);
			printJogo(tabuleiro);
			System.out.println();
			escolha = verificacao(tabuleiro);
			escolha = verificarHorizontal(tabuleiro);
			escolha = verificarVertical(tabuleiro);
			escolha = verificarDiagonalPrincipal(tabuleiro);
			escolha = verificarDiagonalSecundaria(tabuleiro);

		} while (escolha != 0);

	}

	public static void printJogo(String[][] array) {
		for (int indice = 0; indice < array.length; indice++) {
			for (int j = 0; j < array[indice].length; j++) {
				if (array[indice][j] != null) {
					System.out.printf(" %s |", array[indice][j]);
				} else {
					System.out.printf("  |");
				}
			}
			System.out.println();
		}
	}

	public static void jogadorX(String[][] array) {
		Scanner leia = new Scanner(System.in);
		int linha;
		int coluna;

		System.out.print("Olá jogador X, qual linha?: \n");
		linha = leia.nextInt();

		System.out.print("Olá jogador X, qual coluna?: \n");
		coluna = leia.nextInt();

		array[linha][coluna] = "X";

	}

	public static void jogadorO(String[][] array) {
		Scanner leia = new Scanner(System.in);
		int linha;
		int coluna;

		System.out.print("Olá jogado O, qual linha?: \n");
		linha = leia.nextInt();

		System.out.print("Olá jogador O, qual coluna?: \n");
		coluna = leia.nextInt();

		array[linha][coluna] = "O";

	}

	public static int verificacao(String[][] array) {
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (array[i][j] == null) {
					return 0;
				}
			}
		}
		return 1;
	}

	public static int verificarHorizontal(String[][] array)

	{
		int m = 0;
		int n = 0;

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {

				if (array[i][j] != null) {
					if (array[i][j].equalsIgnoreCase("X")) {
						m++;
					} else if (array[i][j].equalsIgnoreCase("O")) {
						n++;
					}
				}

			}

			if (m == 3) {
				return 0;
			} else {
				m = 0;
				n = 0;
			}

		}

		return 1;

	}

	public static int verificarVertical(String[][] array) {

		int m = 0;
		int n = 0;

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {

				if (array[j][i] != null) {
					if (array[j][i].equalsIgnoreCase("X")) {
						m++;
					} else if (array[j][i].equalsIgnoreCase("O")) {
						n++;
					}

				}
			}

			if (m == 3) {
				return 0;
			} else {
				m = 0;
				n = 0;
			}

		}

		return 1;

	}

	public static int verificarDiagonalPrincipal(String[][] array) {
		int m = 0;
		int n = 0;

		for (int i = 0; i < array.length; i++) {

			if (array[i][i] != null) {
				if (array[i][i].equalsIgnoreCase("X")) {
					m++;
				} else if (array[i][i].equalsIgnoreCase("O")) {
					n++;
				}

			}
		}
		if (m == 3) {
			return 0;
		} else {
			m = 0;
			n = 0;
		}

		return 1;

	}

	public static int verificarDiagonalSecundaria(String[][] array) {
		int m = 0;
		int n = 0;

		for (int i = 3; i < array.length; i--) {

			if (array[i][i] != null) {
				if (array[i][i].equalsIgnoreCase("X")) {
					m++;
				} else if (array[i][i].equalsIgnoreCase("O")) {
					n++;
				}

			}
		}
		if (m == 3) {
			return 0;
		} else {
			m = 0;
			n = 0;
		}

		return 1;

	}

}