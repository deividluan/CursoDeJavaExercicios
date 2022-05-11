package ExercicioTeste;

public class ExercicioWhileDo2 {
	public static void main (String[]args) {
		int numero = 1;
		int soma = 0;
		
		do {
			if (numero % 2 == 0) {
				soma += numero;
			}
			numero ++;
		}
		while (numero < 501);
		
		System.out.print("Soma de todos os pares até 500: " + soma);
	}
}
