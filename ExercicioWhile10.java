package ExercicioTeste;

public class ExercicioWhile10 {
	public static void main (String[]args) {
		
		int cont = 50;
		int soma = 0;
		int media = 0;
		
		while (cont != 71) {
			
			if (cont % 2 == 0) {
				soma += cont;
			}
			cont ++;
		}
		
		System.out.println("A soma de todos os pares entre 50 e 70 é: " + soma);
		
		media = soma / 20;
		System.out.print("A média de todos os pares entre 50 e 70 é: " + media);
	}
}
