package aula_08;

import java.util.Scanner;

public class CalculadoraMetodos {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		while(true) {
		System.out.println("\n");
		System.out.println("******************************************");
		System.out.println("*               1 - Somar                *");
		System.out.println("*               2 - Subtrair             *");
		System.out.println("*               3 - Multiplicar          *");
		System.out.println("*               4 - Dividir              *");
		System.out.println("*               0 - Sair                 *");
		System.out.println("******************************************");
		
		System.out.printf("\nDigite a opção desejada: ");
		int opcao = leia.nextInt();
		
		if(opcao == 0 ) {
			sobre();
			System.exit(0);
		}
			
		System.out.print("\nDigite o primeiro número: ");
		double numero1 = leia.nextDouble();
		
		System.out.print("Digite o segundo número: ");
		double numero2 = leia.nextDouble();
		
		switch(opcao) {
		case 1 -> System.out.printf("\n%.2f + %.2f = %.2f", numero1, numero2, somar(numero1,numero2));
		case 2 -> System.out.printf("\n%.2f - %.2f = %.2f", numero1, numero2, subtrair(numero1,numero2));
		case 3 -> System.out.printf("\n%.2f * %.2f = %.2f", numero1, numero2, multiplicar(numero1,numero2));
		case 4 -> System.out.printf("\n%.2f / %.2f = %.2f", numero1, numero2, dividir(numero1,numero2));
		default -> System.out.println("\nOpção Inválida!");
		}
		
		}
	}
	
	static double somar(double numero1, double numero2) {
		return numero1 + numero2;
	}
	
	static double subtrair(double numero1, double numero2) {
		return numero1 - numero2;
	}
	
	static double multiplicar(double numero1, double numero2) {
		return numero1 * numero2;
	}
	
	static double dividir(double numero1, double numero2) {
		return numero1 / numero2;
	}

	static void sobre() {
		System.out.println("Calculadora com métodos");
		System.out.println("Feita por Victor Hugo");
	}
}
