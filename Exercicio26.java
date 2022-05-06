package PacoteExercicio;

import java.util.Scanner;

public class Exercicio26 {
	public static void main (String[]args) {
		Scanner sc = new Scanner (System.in);
		int QuantAtual, QuantMax, QuantMin = 0;
		
		System.out.print("Quantidade maxima de suco: ");
		QuantMax = sc.nextInt();
		
		System.out.print("Quantidade minima de suco: ");
		QuantMin = sc.nextInt();
		
		System.out.print("Quantidade atual: ");
		QuantAtual = sc.nextInt();
		
		int media = (QuantMax + QuantMin) / QuantAtual;
		
		if (QuantAtual >= media) {
			System.out.print("Não efetuar compra");		
		}
		else {
			System.out.print("Efetuar compra");
		}
	}
}
