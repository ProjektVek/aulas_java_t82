package aula02;

import java.util.Scanner;

public class Atividade2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite a Nota 1: ");
		float nota1 = leia.nextFloat();

		System.out.print("Digite a Nota 2: ");
		float nota2 = leia.nextFloat();

		System.out.print("Digite a Nota 3: ");
		float nota3 = leia.nextFloat();

		System.out.print("Digite a Nota 4: ");
		float nota4 = leia.nextFloat();
		
		float media = (nota1 + nota2 + nota3 + nota4)/4;
		System.out.printf("A média final é %.1f",media);


	}

}
