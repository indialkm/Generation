package exercicio01;

import java.util.Scanner;

public class calculoSalario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner leia = new Scanner(System.in);
			
			System.out.println("Digite sálario bruto: ");
			float salarioBruto = leia.nextFloat();
			
			System.out.println("Digite adicional noturno: ");
			float adicionalNoturno = leia.nextFloat();
			
			System.out.println("Digite horas extras: ");
			float horasExtras = leia.nextFloat();
			
			System.out.println("Digite desconto: ");
			float desconto = leia.nextFloat();
			
			float salarioLiquido = salarioBruto + adicionalNoturno + (horasExtras * 5) - desconto;
			
			System.out.printf("O salário do funcionário é: %.2f",salarioLiquido);
			
			
			

	}

}
