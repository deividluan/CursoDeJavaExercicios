package PacoteExercicio;

import java.util.Scanner;

public class Exercicio27 {
	public static void main (String[]args) {
		Scanner sc = new Scanner (System.in);
		double numero = 0;
		
		System.out.print("Digite um n�mero (pode ser negativo): ");
		numero = sc.nextDouble ();
		
		if (numero > 0) {
			System.out.print("O numero " + numero + " � positivo");
		}
		else if (numero < 0) {
			System.out.print("O numero " + numero + " � negativo");
		}
		else {
			System.out.print("O seu numero � 0 ");
		}
	}
}
