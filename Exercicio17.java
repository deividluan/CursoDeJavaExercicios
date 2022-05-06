package PacoteExercicio;

import java.util.Scanner;

public class Exercicio17 {
	public static void main (String[]arg) {
		
		Scanner sc = new Scanner (System.in);
		float nota1, nota2 = 0;
		
		System.out.print("Nota 1: ");
		nota1 = sc.nextFloat();
		
		System.out.print("nota 2: ");
		nota2 = sc.nextFloat();
		
		float media = (nota1 + nota2) / 2;
		
		if (media >= 6) {
			System.out.print("Média: " + media + "      Resultado: Aprovado");
		}
		else {
			System.out.print("Média: " + media + "      Resultado: Reprovado");
		}
	}
}
