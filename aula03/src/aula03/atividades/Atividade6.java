package aula03.atividades;

import java.util.Scanner;

public class Atividade6 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite o nome do Colaborador: ");
		String nome = leia.next();
		
		if(nome.equals("")) {
			System.out.println("Nome inválido!");
			leia.close();
			return;
		}
		
		System.out.print("Digite o código do cargo (de 1 a 6): ");
		int codigoCargo = leia.nextInt();
		
		//Processando código do cargo
		String nomeCargo = "";
		double reajuste = 0;
		
		switch(codigoCargo) {
		case 1:
			nomeCargo = "Gerente";
			reajuste = 0.1;
			break;
		case 2:
			nomeCargo = "Vendedor";
			reajuste = 0.07;
			break;
		case 3:
			nomeCargo = "Supervisor";
			reajuste = 0.09;
			break;
		case 4:
			nomeCargo = "Motorista";
			reajuste = 0.06;
			break;
		case 5:
			nomeCargo = "Estoquista";
			reajuste = 0.05;
			break;
		case 6:
			nomeCargo = "Técnico de TI";
			reajuste = 0.08;
			break;
		default:
			System.out.println("\nCódigo Inválido!");
			leia.close();
			return;
		}
		
		System.out.print("Digite o salário: ");
		double salario = leia.nextDouble();
		
		if(salario<0) {
			System.out.println("\nSalário Inválido!");
			leia.close();
			return;
		}
		
		double novoSalario = salario * (1 + reajuste);
		
		System.out.printf("\nNome do Colaborador: %s", nome);
		System.out.printf("\nCargo: %s", nomeCargo);
		System.out.printf("\nNovo Salário: %.2f", novoSalario);
		
		leia.close();
	}

}
