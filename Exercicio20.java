package PacoteExercicio;

import java.util.Scanner;

public class Exercicio20 {
	public static void main (String[]args) {
		
		Scanner sc = new Scanner (System.in);
		int numero1, numero2 = 0;
		
		System.out.print("Digite um numero: ");
		numero1 = sc.nextInt();
		
		System.out.print("Digite outro numero: ");
		numero2 = sc.nextInt();
		
		if (numero1 > numero2) {
			System.out.print(numero1 + " e " + numero2);
		}
		else {
			System.out.print(numero2 + " e " + numero1);
		}
	}
}
