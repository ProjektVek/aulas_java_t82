package aula_05;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class Vetores {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		// Vetor de números inteiros inicializado com valores
		int vetorInteiros[] = {10, 15, 35, 70, 140, 300, 450};
		
		// Vetor de Objetos Float, com tamanho 5
		Float[] vetorReal = new Float[5];
		
		// Vetor de Objetos String
		String vetorStrings[] = { "Boxer", "Pastor Alemão", "Pinscher", "Husky Siberiano", "Corgi" };
		
		//váriavel float para armazenar a soma dos elementos vetorReal
		float soma = 0;
		
		// Laço para exibir os dados de vetorInteiros
		for(int indice = 0; indice < vetorInteiros.length; indice ++) {
			System.out.printf("vetorInteiros[%d] = %d \n", indice, vetorInteiros[indice]);
		}
		
		System.out.println();
		
		// Laço para coletar números para vetor real
		for(int indice = 0; indice < vetorReal.length; indice ++) {
			System.out.print("Digite um número Real: ");
			vetorReal[indice] = leia.nextFloat();
		}
		
		//Soma os Valores do vetor Real
		for(var valor: vetorReal) {
			soma += valor;
		}
		
		//Exibe a Soma:
		System.out.println("\nSoma: " + soma);
		
		System.out.println();
		
		//Ordena os elementos do vetor real de forma crescente e imprime
		Arrays.sort(vetorReal);
		
		for(float valor : vetorReal) {
			System.out.println("Elemento atual: " + valor);
		}
		
		//Ordena os elementos do vetor real de forma decrescente e imprime
		Arrays.sort(vetorReal, Collections.reverseOrder());
		
		System.out.println();
		
		for(float valor : vetorReal)
			System.out.println("Elemento atual: " + valor);
		
		// Ordenando o vetorStrings em ordem crescente
		Arrays.sort(vetorStrings);
 
		// Exibindo o vetorStrings com os dados em ordem crescente
		System.out.println();
		
		for (var valor : vetorStrings)
			System.out.println("Elemento atual: " + valor);
		
		leia.close();

	}

}
