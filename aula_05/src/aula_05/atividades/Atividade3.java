package aula_05.atividades;

import java.util.Scanner;

public class Atividade3 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int[][] matriz = new int[3][3];
		
		// Lendo Números
		for(int linha = 0; linha < matriz.length; linha++) {
			for(int coluna = 0; coluna < matriz.length; coluna++) {
				
				System.out.printf("Digite um número inteiro para a linha %d e coluna %d: ", linha, coluna);
				matriz[linha][coluna] = leia.nextInt();
						
			}
		}
		
		// Elementos da Diagonal Principal:
		System.out.println("\nElementos da Diagonal Principal: ");
		System.out.printf("%d %d %d", matriz[0][0], matriz [1][1], matriz[2][2]);
		
		// Soma da Diagonal Principal:
		int soma = matriz[0][0] + matriz [1][1] + matriz[2][2];
		System.out.printf("\nSoma da Diagonal Principal: %d", soma);
		
		// Elementos da Diagonal Secundária:
		System.out.println("\n\nElementos da Diagonal Secundária: ");
		System.out.printf("%d %d %d", matriz[2][0], matriz [1][1], matriz[0][2]);
		
		// Soma da Diagonal Secundária:
		soma = matriz[2][0] + matriz [1][1] + matriz[0][2];
		System.out.printf("\nSoma da Diagonal Secundária: %d", soma);
		
		leia.close();
		
	}

}
