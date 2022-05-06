package PacoteExercicio;

import java.util.Scanner;

public class Exercicio28 {
	public static void main (String[]args) {
		Scanner sc = new Scanner (System.in);
		
		int numero1, numero2, numero3 = 0;
		
		System.out.print("Digite um número: ");
		numero1 = sc.nextInt ();
		
		System.out.print("Digite outro número: ");
		numero2 = sc.nextInt ();
		
		System.out.print("Digite mais um número: ");
		numero3 = sc.nextInt ();
		
		if ((numero1 > numero2) & (numero1 > numero3)) {
			System.out.print("O maior numero é o: " + numero1);
		}
		else if ((numero2 > numero1) & (numero2 > numero3)) {
			System.out.print("O maior numero é o: " + numero2);
		}
		else if ((numero3 > numero1) & (numero3 > numero2)) {
			System.out.print("O maior numero é o: " + numero3);
		}
	}
}
