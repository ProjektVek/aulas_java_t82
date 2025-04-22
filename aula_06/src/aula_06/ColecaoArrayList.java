package aula_06;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class ColecaoArrayList {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		// Criando a coleção ArrayList
		ArrayList<Double> numeros = new ArrayList<Double>();
		
		// Adicionando valores à coleção Arraylist
		numeros.add(2.0);
		numeros.add(3.0);
		numeros.add(9.0);
		numeros.add(6.0);
		numeros.add(7.0);
		numeros.add(2.0);
		
		System.out.print("Digite um número real: ");
		double input = leia.nextDouble();
		
		numeros.add(input);
		
		// Listando valores da coleção ArrayList
		for(var numero : numeros) {
			System.out.println(numero);
		}
		
		System.out.println("\nIndice do número 9.0: " + numeros.indexOf(9.0));
		
		System.out.println("\nO numero 9.0 existe na coleção?: " + numeros.contains(9.0));
		
		System.out.println("\nQual o valor está armazenado no índice 2?: " + numeros.get(2));
		
		// Alterar o valor de um elemento
		numeros.set(2, 10.0);
		
		// Exibe os dados atualizados, atráves do método forEach
		System.out.println("\nExibe os dados após a atualização");
		numeros.forEach(System.out::println);
		
		// Exclui um elemento da lista com base no índice
		numeros.remove(2);
		
		// Exibe os dados atualizados, atráves do método forEach
		System.out.println("\nExibe os dados após a exclusão");
		numeros.forEach(System.out::println);
		
		// Ordenar a Coleção em ordem crescente
		numeros.sort(null);
		
		// Exibe os dados atualizados, atráves do método forEach
		System.out.println("\nExibe os dados após a exclusão");
		numeros.forEach(System.out::println);
		
		// Ordenar a Coleção em ordem crescente
		numeros.sort(Comparator.reverseOrder());
				
		// Exibe os dados atualizados, atráves do método forEach
		System.out.println("\nExibe os dados após a exclusão");
		numeros.forEach(System.out::println);
		
		// Limpar a coleção
		numeros.clear();
		
		System.out.println("\nO ArrayList está vazio?: " + numeros.isEmpty());
		
		leia.close();
	}

}
