package PacoteExercicio;

import java.util.Scanner;

public class ExercicioWhile12 {
	public static void main (String[]args) {
		
		Scanner sc = new Scanner (System.in);
		
		int numero = 1;
		int cont = 0;
		int maior = 0;
		int menor = 0;
		
		while (numero > 0) {
			System.out.print("Digite um numero (pode ser negativo) : ");
			numero = sc.nextInt();
			
			if (cont == 0) {
				maior = numero;
				menor = numero;
			}
			else {
				if (numero > maior) {
					maior = numero;
				}
				if (numero < menor) {
					menor = numero;
				}
			}
		}
		
		System.out.println("Maior numero: " + maior);
		System.out.print("Menor numero: " + menor);
	}
}
