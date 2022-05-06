package PacoteExercicio;

import java.util.Scanner;

public class Exercicio30 {
	public static void main (String[]args) {
		
		Scanner sc = new Scanner (System.in);
		int numero1, numero2, numero3 = 0;
		
		System.out.print("Digite um numero: ");
		numero1 = sc.nextInt();
		
		System.out.print("Digite outro numero: ");
		numero2 = sc.nextInt();
		
		System.out.print("Digite mais um numeri: ");
		numero3 = sc.nextInt();
		
		if ((numero1 > numero2) & (numero2 > numero3)) {
			if (numero2 > numero3) {
				System.out.print("Ordem decrescente: " + numero1 + ", " + numero2 + ", " + numero3);
			}
			if (numero3 > numero2) {
				System.out.print("Ordem decrescente: " + numero1 + ", " + numero3 + ", " + numero2);
			}
		}
		if ((numero2 > numero1) & (numero2 > numero3)) {
			if (numero1 > numero3) {
				System.out.print("Ordem decrescente: " + numero2 + ", " + numero1 + ", " + numero3);
			}
			if (numero3 > numero2) {
				System.out.print("Ordem decrescente: " + numero2 + ", " + numero3 + ", " + numero1);
			}
		}
		if ((numero3 > numero1) & (numero3 > numero2)) {
			if (numero1 > numero2) {
				System.out.print("Ordem decrescente: " + numero3 + ", " + numero1 + ", " + numero2);
			}
			if (numero2 > numero1) {
				System.out.print("ordem decrescente: " + numero3 + ", " + numero2 + ", " + numero1);
			}
		}
	}
}
