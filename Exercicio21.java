package PacoteExercicio;

import java.util.Scanner;

public class Exercicio21 {
	public static void main (String[]args) {
		
		Scanner sc = new Scanner (System.in);
		int fim, inicio, tempo = 0;
		
		System.out.print("Horario que iniciou a partida: ");
		inicio = sc.nextInt();
		
		System.out.print("Horario que terminou a partida: ");
		fim = sc.nextInt();
		
		if (inicio > fim) {
			tempo = (inicio - fim) - 24;
		}
		else {
			tempo = (fim - inicio);
		}
		System.out.print("A partida teve " + tempo + " horas de duração");
	}
}
