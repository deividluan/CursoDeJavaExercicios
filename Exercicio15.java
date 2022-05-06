package PacoteExercicio;

import java.util.Scanner;

public class Exercicio15 {
	public static void main (String[]args) {
		
		Scanner sc = new Scanner (System.in);
		double numero = 0;
		System.out.print("Digite um numero (pode ser negativo) : ");
		numero = sc.nextDouble();
		
		if (numero >= 0) {
			System.out.print("O numero " + numero + " é positivo");
		}
		else {
			System.out.print("O numero " + numero + " é negativo");
		}
	}
}
