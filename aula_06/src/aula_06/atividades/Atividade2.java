package aula_06.atividades;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Atividade2 {

	public static void main(String[] args) {
		
		ArrayList<Integer> lista = new ArrayList<Integer>();
		Collections.addAll(lista, 2, 5 ,1 ,3, 4, 9, 7, 8, 10, 6);
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		int num = leia.nextInt();
		int posicao = lista.indexOf(num);
		
		if(posicao==-1)
			System.out.printf("\nO número %d não foi encontrado!", num);
		else 
			System.out.printf("\nO número %d está localizado na posição: %d", num, posicao);
	}

}
