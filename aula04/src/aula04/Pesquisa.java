package aula04;

import java.util.Scanner;

public class Pesquisa {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		
		int futebol = 0,
			voleibolM18 = 0, 
			basqueteMn18 = 0, 
			outros = 0,
			somaIdades = 0,
			esporte = 0;
		double media;
		
		String continua = "s";
		
		while(continua.equalsIgnoreCase("s")) {
			System.out.print("Digite a idade: ");
			int idade = leia.nextInt();
			somaIdades += idade;
			
			do {
				System.out.print("Digite o esporte favorito(1-Fut / 2-Vol / 3-Basq / 4-Outros): ");
				esporte = leia.nextInt();
			} while(esporte < 1 || esporte > 4);
			
			
			if(esporte == 1)
				futebol++;
			else if(esporte == 2 && idade >= 18)
				voleibolM18++;
			else if(esporte == 3 && idade < 18)
				basqueteMn18++;
			else
				outros++;
			
			System.out.print("Deseja Continuar? (S/N): ");
			continua = leia.next();
		}
		
		int totalDePessoas = futebol + voleibolM18 + basqueteMn18 + outros;
		media = somaIdades / totalDePessoas;
		
		System.out.println("\nPessoas que gostam de futebol: " + futebol);
		System.out.println("Pessoas que gostam de Volei e tem idade maior que 18 anos: " + voleibolM18);
		System.out.println("Pessoas que gostam de Basquete e tem menos que 18 anos: " + basqueteMn18);
		System.out.println("Pessoas que gostam de outras opções: " + outros);
		System.out.println("Total de pessoas: " + totalDePessoas);
		System.out.printf("Média da Idades: %.0f", media);
		
		
		leia.close();

	}

}
