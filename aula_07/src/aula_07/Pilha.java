package aula_07;

import java.util.Stack;

public class Pilha {

	public static void main(String[] args) {
		
		// Cria a pilha
		Stack<String> pilha = new Stack<String>();
		
		// Adiciona items a pilha
		pilha.add("Comunicação não violenta");
		pilha.add("IT");
		pilha.add("A Coragem de ser Imperfeito");
		pilha.add("O Senhor dos aneis");
		pilha.add("O Homem em busca de sentido");
		pilha.add("O Codigo da Vinci");
		
		System.out.println(pilha);
		
		// Retorna o valor do ultimo objeto e remove da pilha
		pilha.pop();
		
		System.out.println(pilha);
		
		// Insere elemento na pilha
		pilha.push("Roube como um Artista");
		
		System.out.println(pilha);
		
		System.out.println(pilha.peek());
		
		System.out.printf("O livro 'O Senhor dos aneis' existe na pilha?: %b", pilha.contains("O Senhor dos aneis"));
	}

}
