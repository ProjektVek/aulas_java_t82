package aula03;

import java.util.Scanner;

public class ConversorDeMoedas {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double valorConvertido = 0;
		String moeda = "";
		
		System.out.println("*************************************");
		System.out.println("          Conversor de Moedas        ");
		System.out.println("*************************************");
		System.out.println("                                     ");
		System.out.println("1 - Converter para Dólar (US$)       ");
		System.out.println("2 - Converter para Euros (EU$)       ");
		System.out.println("3 - Converter para Pesos (AR$)       ");
		System.out.println("                                     ");
		System.out.println("*************************************");
		
		System.out.print("\nDigite a Opção Desejada: ");
		int opcao = leia.nextInt();
		
		System.out.print("Digite o valor em Reais (R$): ");
		double valor = leia.nextDouble();
		
		switch(opcao) {
		case 1:
			valorConvertido = valor / 5.86;
			moeda = "Dolár";
			break;
		case 2:
			valorConvertido = valor / 6.63;
			moeda = "Euro";
			break;
		case 3:
			valorConvertido = valor / 0.0049;
			moeda = "Peso Argentino";
			break;
		default:
			System.out.println("Opção é Inválida!");
			leia.close();
			return;
		}
		
		System.out.printf("\nValor convertido em %s: %.2f", moeda, valorConvertido);
		
		leia.close();
	}

}
