package aula_07.Atividades;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Atividade1 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int opcao = 2;

		Queue<String> clientes = new LinkedList<String>();
		
		do {
			// Imprime menu
			System.out.println("\n");
			System.out.println("*********************************************************");
			System.out.println("*                                                       *");
			System.out.println("*             1 - Adicionar Cliente na Fila             *");
			System.out.println("*             2 - Listar todos os Clientes              *");
			System.out.println("*             3 - Retirar Cliente da Fila               *");
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
			case 1:
				System.out.print("\nDigite o nome do cliente: ");
				String nome = leia.next();
				clientes.add(nome);
				System.out.printf("\nCliente %s adicionado com sucesso!", nome);
				break;
				
			case 2:
				int contador = 0;
				System.out.println();
				
				if(clientes.size()==0)
					System.out.println("Não há clientes na lista!");
				else
					for(var cliente : clientes) {
						contador++;
						System.out.printf("Cliente %d: %s\n", contador, cliente);
						}
				break;
				
			case 3:
				if(clientes.size()==0)
					System.out.println("\nNão há clientes na lista!");
				else
					System.out.printf("\nCliente %s retirado da lista!", clientes.poll());
				
				break;
			}
			
		} while(opcao != 0);
		
		leia.close();

	}

}
