package aula_07;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {
		
		Queue<String> fila = new LinkedList<String>();
		
		//Adicionando elementos na fila
		fila.add("Carlos");
		fila.add("Giovana");
		fila.add("Livia");
		fila.add("Maria");
		fila.add("Samuel");
		fila.add("Fabrício");
		fila.add("Victor");
		
		System.out.println(fila);
		
		// Remove o primeiro elemento
		fila.remove();
		System.out.println(fila);
		
		fila.add("Thiago");
		System.out.println(fila);
		
		// Visualiza o primeiro elemento
		System.out.println(fila.peek());
		System.out.println(fila);
		
		// Visualiza o primeiro elemento e depois remove
		System.out.println(fila.poll());
		System.out.println(fila);
		
		System.out.println("\nA Maria está na fila? " + fila.contains("Maria"));
		System.out.println("O Carlos está na fila? " + fila.contains("Carlos"));
		
		System.out.println("\nQual é o tamanho da fila? " + fila.size());
		
		int contador = 0;
		for(var pessoa: fila) {
			contador++;
			if(pessoa.equalsIgnoreCase("maria")) {
				System.out.printf("\nA Maria está em %dº lugar na fila.", contador);
			}
		}

	}

}
