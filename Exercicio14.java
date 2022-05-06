package PacoteExercicio;

import java.util.Scanner;

public class Exercicio14 {
	public static void main (String[]args) {
		
		Scanner sc = new Scanner (System.in);
		double numero = 0;
		System.out.print("Digitem um numero: ");
		numero = sc.nextDouble();
		
		if (numero > 10) {
			System.out.print("O numero " + numero + " é maior que 10");
		}
		else {
			System.out.print("O numero " + numero + " é menor que 10");
		}
	}
}
