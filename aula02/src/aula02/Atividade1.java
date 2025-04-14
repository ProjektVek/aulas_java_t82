package aula02;

import java.util.Scanner;

public class Atividade1 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite o Salário: ");
		float salario = leia.nextFloat();
		
		System.out.print("Digite o Abono: ");
		float abono = leia.nextFloat();
		
		float novoSalario = salario + abono;
		System.out.printf("Seu novo Salário é %.2f R$", novoSalario);

	}

}
