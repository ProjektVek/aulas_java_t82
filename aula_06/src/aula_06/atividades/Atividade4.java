package aula_06.atividades;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Atividade4 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);

		Set<Integer> numeros = new HashSet<>(Arrays.asList(2, 5, 1, 3, 4, 9, 7, 8, 10, 6));
		
		System.out.print("Digite um número inteiro: ");
		int num = leia.nextInt();
		
		if(numeros.contains(num))
			System.out.printf("\nO número %d foi encontrado!", num);
		else
			System.out.printf("\nO número %d não foi encontrado!", num);
	}

}
