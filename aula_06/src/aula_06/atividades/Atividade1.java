package aula_06.atividades;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Atividade1 {

	public static void main(String[] args) {
	
		Scanner leia = new Scanner(System.in);
		
		ArrayList<String> cores = new ArrayList<String>();
		
		for (int i = 1; i <= 5; i++) {
			System.out.printf("Digite a cor número %d: ", i);
			cores.add(leia.next());
		}
		
		System.out.println("\nListar Todas as cores: ");
		cores.forEach(System.out::println);
		
		System.out.println("\nOrdenar as cores: ");
		cores.sort(null);
		cores.forEach(System.out::println);

	}

}
