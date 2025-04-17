package aula_05;

import java.util.Scanner;

public class Matrizes {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int matrizInteiros[][] = {{10,15,35}, {70,120,140}, {50,100,150}};
		
		int matrizIrregular[][] = {{10,15}, {70,120}, {50,100}};
		
		Float matrizReal[][] = new Float[3][3];
		
		for(int linha = 0; linha < matrizInteiros.length; linha++) {
			for(int coluna = 0; coluna < matrizInteiros.length; coluna++) {
				System.out.printf("\n matrizInteiros[%d][%d] = %d", linha, coluna, matrizInteiros[linha][coluna]);
			}
		}
		
		System.out.println();
		for(int linha = 0; linha < matrizIrregular.length; linha++) {
			for(int coluna = 0; coluna < matrizIrregular[linha].length; coluna++) {
				System.out.printf("\n matrizInteiros[%d][%d] = %d", linha, coluna, matrizInteiros[linha][coluna]);
			}
		}
		
		System.out.println("\n");
		for(int linha = 0; linha < matrizReal.length; linha++) {
			for(int coluna = 0; coluna < matrizReal.length; coluna++) {
				System.out.print("Digite os números: ");
				matrizReal[linha][coluna] = leia.nextFloat();
			}
		}
		
		System.out.println();
		for(Float[] vetor : matrizReal) {
			for(var valor: vetor) {
				System.out.println("Exibir a posição atual: " + valor);
			}
		}

		leia.close();
	}

}
