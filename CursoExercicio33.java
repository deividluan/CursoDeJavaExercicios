package ExercicioTeste;

import java.util.Scanner;

public class CursoExercicio33 {
	public static void main (String[]args) {
		
		Scanner sc = new Scanner (System.in);
		int numero1, numero2 = 0;
		
		System.out.print("Digite um valor: ");
		numero1 = sc.nextInt();
		
		System.out.print("Digite outro valor: ");
		numero2 = sc.nextInt();
		
		if (numero1 > numero2) {
			System.out.print("Primeiro � maior");
		}
		else if (numero2 > numero1) {
			System.out.print("Segundo � maior");
		}
		else {
			System.out.print("N�meros iguais");
		}
	}
}
