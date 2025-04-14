package aula02;

import java.util.Scanner;

public class Atividade3 {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite o Salário Bruto: ");
		float salarioBruto = leia.nextFloat();
		
		System.out.print("Digite o Adicional Noturno: ");
		float adicionalNoturno = leia.nextFloat();
		
		System.out.print("Digite as Horas Extras: ");
		float horasExtras = leia.nextFloat();
		
		System.out.print("Digite os descontos: ");
		float descontos = leia.nextFloat();
		
		float salarioLiquido = salarioBruto + adicionalNoturno + (horasExtras * 5) - descontos;
		System.out.printf("O Salário Líquido é de %.2f R$", salarioLiquido);
		
	}

}
