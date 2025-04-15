package aula03.atividades;

import java.util.Scanner;

public class Atividade4 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		String escolha;
		
		
		System.out.print("Escreva se o animal é 'Vertebrado' ou 'Invertebrado': ");
		escolha = leia.next();
		// Inicio Vertebrados
		if(escolha.equalsIgnoreCase("Vertebrado")) {
			
			System.out.print("Escreva se o animal é 'Ave' ou 'Mamífero': ");
			escolha = leia.next();
			
			//Inicio Aves
			if(escolha.equalsIgnoreCase("Ave")) {
				
				System.out.print("Escreva se o animal é 'Carnívoro' ou 'Onívoro': ");
				escolha = leia.next();
				
				if(escolha.equalsIgnoreCase("Carnívoro"))
					System.out.println("\nÁguia");
				
				else if(escolha.equalsIgnoreCase("Onívoro"))
					System.out.println("\nPomba");
				
				else
					System.out.println("\nEscolha Inválida");
			// Fim Aves
			
			// Inicio Mamiferos
			} else if(escolha.equalsIgnoreCase("Mamífero")) {
				
				System.out.print("Escreva se o animal é 'Herbívoro' ou 'Onívoro': ");
				escolha = leia.next();
				
				if(escolha.equalsIgnoreCase("Herbívoro"))
					System.out.println("\nVaca");
				
				else if(escolha.equalsIgnoreCase("Onívoro"))
					System.out.println("\nHomem");
				
				else
					System.out.println("\nEscolha Inválida");
			
			// Fim mamiferos
				
			} else
				System.out.println("\nEscolha Inválida");
		// Fim Vertebrados
			
		// Inicio Invertebrados
		} else if (escolha.equalsIgnoreCase("Invertebrado")) {
			
			System.out.print("Escreva se o animal é 'Inseto' ou 'Anelídeo': ");
			escolha = leia.next();
			
			// Inicio Insetos
			if(escolha.equalsIgnoreCase("Inseto")) {
				
				System.out.print("Escreva se o animal é 'Hematófago' ou 'Herbívoro': ");
				escolha = leia.next();
				
				if(escolha.equalsIgnoreCase("Hematófago"))
					System.out.println("\nPulga");
				
				else if(escolha.equalsIgnoreCase("Herbívoro"))
					System.out.println("\nLagarta");
				
				else
					System.out.println("\nEscolha Inválida");
			// Fim Insetos
			
			// Inicio Anelideos
			} else if(escolha.equalsIgnoreCase("Anelídeo")) {
				
				System.out.print("Escreva se o animal é 'Hematófago' ou 'Onívoro': ");
				escolha = leia.next();
				
				if(escolha.equalsIgnoreCase("Hematófago"))
					System.out.println("\nSanguessuga");
				
				else if(escolha.equalsIgnoreCase("Onívoro"))
					System.out.println("\nMinhoca");
				
				else
					System.out.println("\nEscolha Inválida");
			// Fim Anelideos
			} else
				System.out.println("\nEscolha Inválida");
			
		} else
			System.out.println("\nEscolha Inválida");
		// Fim Invertebrados
		
		leia.close();
	}

}
