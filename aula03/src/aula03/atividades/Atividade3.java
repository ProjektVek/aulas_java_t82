package aula03.atividades;

import java.util.Scanner;

public class Atividade3 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite o nome do doador: ");
		String nome = leia.next();
		
		System.out.print("\nDigite a idade do doador: ");
		int idade = leia.nextInt();
		
		if(idade < 0 || idade > 130)
			System.out.println("\nIdade inválida!");
		
		else if(idade < 18 || idade > 69)
			System.out.printf("\n%s não está apto para doar sangue!", nome);
		
		else if(idade >= 60) {
			
			System.out.print("\nÉ sua primeira doação? (escreva 'true' para sim, e 'false' para não): ");
			boolean primeiraDoacao = leia.nextBoolean();
			
			if(!primeiraDoacao)
				System.out.printf("\n%s está apto para doar sangue!", nome);
			
			else
				System.out.printf("\n%s não está apto para doar sangue!", nome);

		} else {
			System.out.print("\nÉ sua primeira doação? (escreva 'true' para sim, e 'false' para não): ");
			boolean primeiraDoacao = leia.nextBoolean();
			
			System.out.printf("\n%s está apto para doar sangue!", nome);
		}
		
		leia.close();
	}

}
