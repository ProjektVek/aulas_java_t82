package aula03.atividades;

import java.util.Scanner;

public class atividade5 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite o código do produto (de 1 a 6): ");
		int codigo = leia.nextInt();
		
		System.out.print("Digite a quantidade comprada: ");
		int quantidade = leia.nextInt();
		
		if(quantidade < 1) {
			System.out.println("\nQuantidade inválida!");
			leia.close();
			return;
		}
		
		String produto = "";
		double valorTotal = 0;
		
		switch(codigo) {
		case 1:
			produto = "Cachorro Quente";
			valorTotal = 10 * quantidade;
			break;
		case 2:
			produto = "X-Salada";
			valorTotal = 15 * quantidade;
			break;
		case 3:
			produto = "X-Bacon";
			valorTotal = 18 * quantidade;
			break;
		case 4:
			produto = "Bauru";
			valorTotal = 12 * quantidade;
			break;
		case 5:
			produto = "Refrigerante";
			valorTotal = 8 * quantidade;
			break;
		case 6:
			produto = "Suco de Laranja";
			valorTotal = 13 * quantidade;
			break;
		default:
			System.out.println("\nOpção inválida!");
			leia.close();
			return;
		}
		
		System.out.printf("\nProduto: %s", produto);
		System.out.printf("\nValor Total: R$ %.2f", valorTotal);
		
		leia.close();


	}

}
