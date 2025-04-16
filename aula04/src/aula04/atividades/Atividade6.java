package aula04.atividades;

import java.util.Scanner;

public class Atividade6 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int numero, soma = 0, quantidadeMultiplos = 0;
		
		do {
			System.out.printf("Digite um número: ");
			numero = leia.nextInt();
			
			if(numero % 3 == 0 && numero != 0) {
				soma += numero;
				quantidadeMultiplos++;
			}
			
		} while(numero != 0);
		
		double media = soma / quantidadeMultiplos;
		
		if(quantidadeMultiplos==0)
			System.out.println("\nNenhum Multiplo de 3!");
		else
			System.out.printf("\nA média de todos os números múltiplos de 3 é: %.2f", media);
		
		leia.close();

	}

}
