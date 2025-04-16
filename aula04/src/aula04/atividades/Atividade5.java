package aula04.atividades;

import java.util.Scanner;

public class Atividade5 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int numero = 0, soma = 0;
		
		do {
			
			System.out.print("Digite um número inteiro: ");
			numero = leia.nextInt();
			if(numero > 0)
				soma += numero;
			
		} while(numero != 0);
		
		System.out.println("\nA soma dos números positivos é: " + soma);
		
		leia.close();

	}

}
