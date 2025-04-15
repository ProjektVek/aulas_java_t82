package aula03.atividades;

import java.util.Scanner;

public class Atividade1 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		// Entrada de dados
		System.out.print("\nDigite o número A: ");
		int numA = leia.nextInt();
		
		System.out.print("\nDigite o número B: ");
		int numB = leia.nextInt();
		
		System.out.print("\nDigite o número C: ");
		int numC = leia.nextInt();
		
		// Laços condicionais
		if ((numA + numB) > numC) {
			System.out.printf("\n(%d + %d = %d) > %d", numA, numB, (numA + numB), numC);
			System.out.println("\nA Soma de A + B é Maior do que C");
		} else if ((numA + numB) < numC) {
			System.out.printf("\n(%d + %d = %d) < %d", numA, numB, (numA + numB), numC);
			System.out.println("\nA Soma de A + B é Menor do que C");
		} else {
			System.out.printf("\n(%d + %d = %d) = %d", numA, numB, (numA + numB), numC);
			System.out.println("\nA Soma de A + B é Igual a C");
		}
		
		leia.close();

	}

}
