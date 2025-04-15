package aula03.atividades;

import java.util.Scanner;

public class Atividade7 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.printf("Digite o número 1: ");
		double num1 = leia.nextDouble();
		System.out.printf("Digite o número 2: ");
		double num2 = leia.nextDouble();
		
		System.out.println("\n           Operações       ");
		System.out.println("*****************************");
		System.out.println("1 - Soma");
		System.out.println("2 - Subtração");
		System.out.println("3 - Multiplicação");
		System.out.println("4 - Divisão");
		System.out.println("*****************************");
		System.out.print("\nEscolha a operação: ");
		int codigoOperacao = leia.nextInt();
		
		char textoOperacao;
		double resultado = 0;
		switch(codigoOperacao) {
		case 1:
			textoOperacao = '+';
			resultado = num1 + num2;
			break;
		case 2:
			textoOperacao = '-';
			resultado = num1 - num2;
			break;
		case 3:
			textoOperacao = '*';
			resultado = num1 * num2;
			break;
		case 4:
			textoOperacao = '/';
			resultado = num1 / num2;
			break;
		default:
			System.out.println("\nOperação Inválida!");
			leia.close();
			return;
		}
		
		System.out.printf("\n%.1f %c %.1f = %.1f", num1, textoOperacao, num2, resultado);
		
		leia.close();

	}

}
