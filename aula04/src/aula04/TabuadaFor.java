package aula04;

import java.util.Scanner;

public class TabuadaFor {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite um número inteiro: ");
		int numero = leia.nextInt();
		
		System.out.println("");
		for(int contador = 1; contador <= 10; contador++) {
			System.out.printf("%d * %d = %d\n", numero, contador, (numero * contador));
		}
		
		leia.close();

	}

}
