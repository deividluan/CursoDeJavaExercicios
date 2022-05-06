package PacoteExercicio;

import java.util.Scanner;

public class Exercicio13 {
	public static void main (String[]args) {
		
		Scanner sc = new Scanner (System.in);
		int nota1, nota2, nota3 = 0;
		
		System.out.print("Nota um: ");
		nota1 = sc.nextInt();
		
		System.out.print("Nota dois: ");
		nota2 = sc.nextInt();
		
		System.out.print("Nota três: ");
		nota3 = sc.nextInt();
		
		double media = ((nota1 * 2) + (nota2 * 3) + (nota3 * 5)) /  10;
		System.out.print("A média do aluno é: " + media);
	}
}
