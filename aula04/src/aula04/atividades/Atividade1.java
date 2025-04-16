package aula04.atividades;

import java.util.Scanner;

public class Atividade1 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		int num1 = 0, num2 = 0;
		
		
		do {
			System.out.print("\nDigite o número 1: ");
			num1 = leia.nextInt();
			
			System.out.print("Digite o número 2: ");
			num2 = leia.nextInt();
			if(num2 <= num1)
				System.out.println("\nIntervalo Inválido!");
				
		} while(num2 <= num1);
		
		for(int i = num1; i<=num2; i++) {
			if((i%3==0)&&(i%5==0)) {
				System.out.printf("\n%d é multiplo de 3 e 5", i);
			}
		}
		
		
		leia.close();

	}

}
