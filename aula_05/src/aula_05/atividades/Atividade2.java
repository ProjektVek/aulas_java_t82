package aula_05.atividades;

import java.util.Iterator;
import java.util.Scanner;

public class Atividade2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int[] vetor = new int[10];
		int soma = 0;
		
		// Lendo Inteiros
		for (int indice = 0; indice < vetor.length; indice++) {
			System.out.print("Digite um número inteiro: ");
			vetor[indice] = leia.nextInt();
			soma += vetor[indice];
		}
		
		// Exibindo índices impares:
		System.out.println("\nElementos nos índices ímpares:");
		for (int indice = 1; indice < vetor.length; indice += 2) {
			System.out.print(vetor[indice] + " ");
		}
		
		// Exibindo números pares:
		System.out.println("\n\nElementos pares:");
		for(int numero : vetor) {
			if(numero % 2 == 0)
				System.out.print(numero + " ");
		}
		
		// Exibindo Soma
		System.out.println("\n\nSoma: " + soma);
		
		// Exibindo Media
		double media = soma/vetor.length;
		System.out.printf("\nMédia: %.2f", media);
		
		leia.close();

	}

}
