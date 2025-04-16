package aula04.atividades;

import java.util.Scanner;

public class Atividade2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int pares = 0, impares = 0;
			
		for(int i = 1; i <= 10; i++) {
			System.out.print("Digite um número: ");
			int numero = leia.nextInt();
			
			if(numero % 2 == 0) 
				pares++;
			else 
				impares++;
		}
		
		System.out.println("\nTotal de números pares: " + pares);
		System.out.println("\nTotal de números ímpares: " + impares);
		
		leia.close();

	}

}
