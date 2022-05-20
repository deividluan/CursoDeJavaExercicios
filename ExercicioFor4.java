package ExercicioTeste;

public class ExercicioFor4 {
	public static void main (String[]args) {
		int cont = 0;
		int soma = 0;
		
		for (cont = 0; cont != 501; cont++) {
			if (cont % 2 == 0) {
				soma += cont;
			}
		}
		System.out.print("soma de todos os pares até 500: " + soma);
	}

}
