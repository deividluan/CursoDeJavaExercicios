package PacoteExercicio;

import java.util.Scanner;

public class Exercicio41 {
	public static void main (String[]args) {
		
		Scanner sc = new Scanner (System.in);
		float nota1, nota2, nota3, mediaExercicios, mediaFinal = 0;
		
		System.out.print("Nota 1: ");
		nota1 = sc.nextFloat();
		
		System.out.print("Nota 2: ");
		nota2 = sc.nextFloat();
		
		System.out.print("Nota 3: ");
		nota3 = sc.nextFloat();
		
		mediaExercicios = (nota1 + nota2 + nota3) / 3;
		mediaFinal = ((nota1) + (nota2 * 2) + (nota3 * 3) + mediaExercicios) / 7;
		
		if (mediaFinal >= 9) {
			System.out.print("Média: " + mediaFinal + " |  Conceito: A");
		}
		else if ((mediaFinal >= 7.5) && (mediaFinal < 9)) {
			System.out.print("Média: " + mediaFinal + " |  Conceito: B");
		}
		else if ((mediaFinal >= 6 ) && (mediaFinal < 7.5)) {
			System.out.print("Média: " + mediaFinal + " |  Conceito: C");
		}
		else {
			System.out.print("Média: " + mediaFinal + " |  Conceito: D");
		}
	}

}
