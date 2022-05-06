package PacoteExercicio;

import java.util.Scanner;

public class Exercicio19 {
	public static void main (String[]args) {
		
		Scanner sc = new Scanner (System.in);
		int valor1, valor2 = 0;
		
		System.out.print("Digite um numero: ");
		valor1 = sc.nextInt();
		
		System.out.print("Digite outro numero: ");
		valor2 = sc.nextInt();
		
		if (valor1 > valor2) {
			System.out.print(valor1 + " é maior que " + valor2);
		}
		else {
			System.out.print(valor2 + " é maior que " + valor1);
		}
	}
}
