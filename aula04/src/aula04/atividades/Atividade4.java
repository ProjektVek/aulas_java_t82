package aula04.atividades;

import java.util.Scanner;

public class Atividade4 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int devBackend = 0,
			mulherCisTransFront = 0,
			homemCisTransMobileM40 = 0,
			naoBinarioFullStackMn30 = 0,
			totalPessoas = 0,
			somaIdade = 0;
		
		double mediaIdade = 0;
		
		String continua = "s";
		
		while(continua.equalsIgnoreCase("s")) {
			
			// Coleta a idade
			int idade;
			
			do {
				System.out.print("\nDigite a Idade: ");
				idade = leia.nextInt();
				if(idade < 0 || idade > 130)
					System.out.println("\nIdade inválida!");
			} while(idade < 0 || idade > 130);
			
			somaIdade += idade;
			
			// Coleta Gênero
			int genero = 0;
			
			System.out.println("\n       Identidade de Genero     ");
			System.out.println("********************************");
			System.out.println("1 - Mulher Cis");
			System.out.println("2 - Homem Cis");
			System.out.println("3 - Não Binário");
			System.out.println("4 - Mulher Trans");
			System.out.println("5 - Homem Trans");
			System.out.println("6 - Outros");
			System.out.println("********************************");
			
			do {
				System.out.print("Digite a opção de 1 a 6: ");
				genero = leia.nextInt();
				
				if(genero < 1 || genero > 6)
					System.out.println("\nOpção Inválida!");
				
			} while(genero < 1 || genero > 6);
			
			// Coleta Cargo
			System.out.println("       Pessoa Desnvolvedora     ");
			System.out.println("********************************");
			System.out.println("1 - Backend");
			System.out.println("2 - Frontend");
			System.out.println("3 - Mobile");
			System.out.println("4 - FullStack");
			System.out.println("********************************");
			
			int cargo = 0;
			
			do {
				System.out.print("Digite a opção de 1 a 4: ");
				cargo = leia.nextInt();
				
				if(cargo < 1 || cargo > 4)
					System.out.println("\nOpção Inválida!");
				
			} while(cargo < 1 || cargo > 4);
			
			// Processa Dados
			if(cargo==1)
				devBackend++;
			else if((genero == 1 || genero == 4) && cargo == 2)
				mulherCisTransFront++;
			else if((genero == 2 || genero == 5) && cargo == 3 && (idade>40))
				homemCisTransMobileM40++;
			else if(genero == 3 && cargo == 4 && idade < 30)
				naoBinarioFullStackMn30++;
			
			totalPessoas++;
			
			System.out.print("Continuar? (s/n): ");
			continua = leia.next();
		}
		
		mediaIdade = somaIdade / totalPessoas;
		
		System.out.println("\n                              Resultados                                ");
		System.out.println("**************************************************************************");
		System.out.println("Total de pessoas desenvolvedoras Backend: " + devBackend);
		System.out.println("Total de Mulheres Cis e Trans desenvolvedoras Frontend: " + mulherCisTransFront);
		System.out.println("Total de Homens Cis e Trans desenvolvedores Mobile maiores de 40 anos: " + homemCisTransMobileM40);
		System.out.println("Total de Pessoas Não Binárias desenvolvedoras FullStack menores de 30 anos: " + naoBinarioFullStackMn30);
		System.out.println("O número total de pessoas que responderam à pesquisa: " + totalPessoas);
		System.out.printf("A média de idade das pessoas que responderam à pesquisa: %.0f \n", mediaIdade);
		System.out.println("***************************************************************************");
		
		
		leia.close();

	}

}
