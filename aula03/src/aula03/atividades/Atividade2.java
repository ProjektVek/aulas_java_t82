package aula03.atividades;

import java.util.Scanner;

public class Atividade2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite um número diferente de 0: ");
		int numero = leia.nextInt();
		
		if(numero == 0) { //Verifica se o número é igual a zero
			System.out.println("\nNúmero inválido");
		
		} else if(numero > 0) { //Verifica se o número é positivo
			
			if((numero % 2) == 0) { //Verifica se o número é par
				System.out.printf("\nO Número %d é par e positivo!", numero);
			} else {
				System.out.printf("\nO Número %d é ímpar e positivo!", numero);
			}
			
		} else {
			
			if((numero % 2) == 0) { //Verifica se o número é par
				System.out.printf("\nO Número %d é par e negativo!", numero);
			} else {
				System.out.printf("\nO Número %d é ímpar e negativo!", numero);
			}
			
		}
		
		leia.close();

	}

}
