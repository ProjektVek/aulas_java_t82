package aula_06.atividades;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Atividade3 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		Set<Integer> numeros = new HashSet<Integer>();
		
		for(int i = 1; i <= 10; i++) {
			System.out.printf("Digite o número %d: ", i);
			numeros.add(leia.nextInt());
		}
		
		System.out.println("\nDados do set: ");
		
		Iterator<Integer> iNumeros = numeros.iterator();
		
		while(iNumeros.hasNext()) {
			System.out.println(iNumeros.next());
		}

	}

}
