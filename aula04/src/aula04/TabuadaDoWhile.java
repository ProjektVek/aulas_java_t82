package aula04;

import java.util.Scanner;

public class TabuadaDoWhile {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite um número inteiro: ");
		int numero = leia.nextInt();
		
		int contador = 1;
		do {
			System.out.printf("%d * %d = %d\n", numero, contador, (numero * contador));
			contador++;
		} while (contador <= 10);
		leia.close();

	}

}
