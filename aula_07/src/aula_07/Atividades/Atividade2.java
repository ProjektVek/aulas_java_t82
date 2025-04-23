package aula_07.Atividades;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class Atividade2 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int opcao = 2;

		// Cria a pilha
		Stack<String> pilhaDeLivros = new Stack<String>();
		
		do {
			// Imprime menu
			System.out.println("\n");
			System.out.println("*********************************************************");
			System.out.println("*                                                       *");
			System.out.println("*             1 - Adicionar Livro na pilha              *");
			System.out.println("*             2 - Listar todos os livros                *");
			System.out.println("*             3 - Retirar Livro da pilha                *");
			System.out.println("*             0 - Sair                                  *");
			System.out.println("*                                                       *");
			System.out.println("*********************************************************");
			
			System.out.print("\nDigite a opção desejada: ");
			opcao = leia.nextInt();
			
			// Valida Opção
			while (opcao < 0 || opcao > 3) {
				System.out.println("\nOpcao inválida!");
				System.out.print("Digite uma opção válida: ");
				opcao = leia.nextInt();
			}
			
			// Processa Opção
			switch(opcao) {
			
			// Adiciona Livro
			case 1:
				System.out.print("\nDigite o nome do livro: ");
				String nome = leia.next();
				pilhaDeLivros.push(nome);
				System.out.printf("\nLivro %s adicionado com sucesso!", nome);
				break;
			
			// Lista Livros
			case 2:
				int contador = 0;
				System.out.println();
				
				if(pilhaDeLivros.size()==0)
					System.out.println("Não há livros na lista!");
				else
					for(var livro : pilhaDeLivros) {
						contador++;
						System.out.printf("Livro %d: %s\n", contador, livro);
						}
				break;
			
			// Remove Livro
			case 3:
				if(pilhaDeLivros.size()==0)
					System.out.println("\nNão há livros na lista!");
				else
					System.out.printf("\nLivro %s retirado da lista!", pilhaDeLivros.pop());
				
				break;
			
			case 0:
				System.out.println("\nPrograma Finalizado!");
				break;
			}
			
		} while(opcao != 0);
		
		leia.close();

	}

}
