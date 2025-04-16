package aula04.atividades;

import java.util.Scanner;

public class Atividade3 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int idade=0, menorQue21 = 0, maiorQue50 = 0;
		
		while(idade >=0 && idade <= 130) {
			System.out.print("Digite a idade: ");
			idade = leia.nextInt();
			
			if(idade >= 0 && idade < 21)
				menorQue21++;
			
			else if(idade >= 50 && idade <= 130)
				maiorQue50++;
		}
		
		System.out.println("\nTotal de pessoas menores de 21 anos: " + menorQue21);
		System.out.println("Total de pessoas maiores de 50 anos: " + maiorQue50);
		
		leia.close();

	}

}
