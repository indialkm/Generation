package exercicio01;

import java.util.Scanner; 


public class salario {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite sálario: ");
		float salario = leia.nextFloat();
		
		System.out.println("Digite abono: ");
		float abono = leia.nextFloat();
		
		float novoSalario = abono + salario;
		
		System.out.printf("O novo salário é %.2f",novoSalario);
		
	}

}
