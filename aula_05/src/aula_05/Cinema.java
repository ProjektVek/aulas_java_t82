package aula_05;

public class Cinema {

	public static void main(String[] args) {
		
		int assentos[][] = {
				{1, 0, 1, 1, 1, 1},
				{1, 0, 1, 1, 0, 1},
				{1, 0, 1, 1, 1, 1},
				{1, 1, 1, 0, 1, 1},
				{1, 0, 1, 0, 1, 1},
				{1, 0, 1, 1, 0, 1},
		};
		
		int ocupadas = 0, livres = 0;
		
		for(var fila: assentos) {
			for(var assento : fila) {
				if(assento==0)
					livres++;
				else
					ocupadas++;
			}
		}
		
		System.out.println("Assentos Livres: " + livres);
		System.out.println("Assentos Ocupados: " + ocupadas);

	}

}
