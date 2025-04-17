package aula_05.atividades;

import java.util.Scanner;

public class Atividade1 {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		int vetor[] = { 2, 5, 1, 3, 4, 9, 7, 8, 10, 6 };
		
		System.out.print("Digite um número para pesquisar: ");
		int numero = leia.nextInt();
		
		for(int indice = 0; indice < vetor.length; indice++) {
			if(vetor[indice]==numero) {
				System.out.printf("O número %d está localizado na posição: %d", numero, indice);
				leia.close();
				return;
			}
		}
		
		System.out.printf("O número %d não foi encontrado!", numero);
		
		leia.close();
	}

}
