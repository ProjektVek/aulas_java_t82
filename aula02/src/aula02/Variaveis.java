package aula02;

import java.util.Scanner;

public class Variaveis {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner leia = new Scanner(System.in);
		
		// Definição de variáveis
		System.out.print("Digite o primeiro número inteiro: ");
		int numero_01 = leia.nextInt();
		
		System.out.print("Digite o segundo número inteiro: ");
		int numero_02 = leia.nextInt();
		char opcao = 'V';
		boolean menorIdade = true;
		
		// String nome = "Victor";
		System.out.print("Digite o seu nome: ");
		String nome = leia.next();
		
		// Definição da constante PI
		final float PI = 3.1415f;
		
		// Atribuição de valor
		// numero_02 = 75;
		
		// Exibição em tela
		System.out.println("Variável numero 1 é igual a: " + numero_01);
		System.out.printf("Variável numero 2 é igual a: %d \n", numero_02);
		System.out.printf("Constante PI é igual a: %.2f \n", PI);
		System.out.println("Variável nome em letras maiúsculas: " + nome.toUpperCase());
	}

}
