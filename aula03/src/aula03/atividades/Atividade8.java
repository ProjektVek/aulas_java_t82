package aula03.atividades;

import java.util.Scanner;

public class Atividade8 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\n           Operações       ");
		System.out.println("*****************************");
		System.out.println("1 - Saldo");
		System.out.println("2 - Saque");
		System.out.println("3 - Depósito");
		System.out.println("*****************************");
		System.out.print("\nEscolha a operação: ");
		int codigoOperacao = leia.nextInt();
		
		double saldo = 1000;
		double novoSaldo = saldo;
		switch(codigoOperacao) {
		case 1:
			System.out.println("\nOperação - Saldo");
			System.out.printf("\nSaldo: R$ %.2f",saldo);
			break;
		case 2:
			System.out.print("\nDigite o Valor do Saque: ");
			double valorSaque = leia.nextDouble();
			novoSaldo = saldo - valorSaque;
			
			System.out.println("\nOperação - Saque");
			if(novoSaldo<0) {
				System.out.println("\nSaldo Insuficiente!");
			} else {
				System.out.printf("\nNovo Saldo: R$ %.2f",novoSaldo);
			}
			break;
		case 3:
			System.out.print("\nDigite o Valor do Depósito: ");
			double valorDeposito = leia.nextDouble();
			novoSaldo = saldo + valorDeposito;
			
			System.out.println("\nOperação - Depósito");
			System.out.printf("\nNovo Saldo: R$ %.2f",novoSaldo);
			break;
		default:
			System.out.println("\nOperação Inválida!");
		}
		
		leia.close();
		
	}

}
