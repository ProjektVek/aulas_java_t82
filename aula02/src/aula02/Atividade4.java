package aula02;

import java.util.Scanner;

public class Atividade4 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite n1: ");
		float n1 = leia.nextFloat();
		
		System.out.print("Digite n2: ");
		float n2 = leia.nextFloat();
		
		System.out.print("Digite n3: ");
		float n3 = leia.nextFloat();
		
		System.out.print("Digite n4: ");
		float n4 = leia.nextFloat();
		
		float diferenca = (n1 * n2) - (n3 * n4);
		System.out.printf("O calculo da diferença é: %.1f", diferenca);
	}

}
