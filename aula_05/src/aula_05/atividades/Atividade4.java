package aula_05.atividades;

import java.util.Scanner;

public class Atividade4 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		double[][] notas = new double[10][4];
		double[] medias = new double[10];
		
		for (int linha = 0; linha < notas.length; linha++) {
			
			double media = 0;
			
			// Le notas
			System.out.println();
			for (int coluna = 0; coluna < notas[linha].length; coluna++) {
				System.out.printf("Digite a nota %d do aluno %d: ",(coluna+1),(linha+1));
				notas[linha][coluna] = leia.nextDouble();
				media += notas[linha][coluna];
			}
			
			//Calcula media
			media /= notas[linha].length;
			medias[linha] = media;
		}
		
		// Exibe medias
		System.out.println();
		for (int indice = 0; indice < medias.length; indice++) {
			System.out.printf("\nMédia do Aluno %d: %.2f", (indice+1), medias[indice]);
		}
		
		leia.close();

	}

}
