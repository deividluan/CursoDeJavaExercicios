package ExercicioTeste;

import java.util.Scanner;

public class ExercicioWhile2 {
	public static void main (String[]args) {
		
		Scanner sc = new Scanner (System.in);
		int numero = 1;
		int zero, tot = 0;
		
		while (numero < 101) {
			tot = tot + numero;
			numero++;
		}
		System.out.println("Resultado: " + tot);
	}

}
