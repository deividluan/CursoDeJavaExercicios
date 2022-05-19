package ExercicioTeste;

import java.util.Scanner;

public class ExercicioFor2 {
	public static void main (String[]args) {
		Scanner sc = new Scanner (System.in);
		
		int cont, numero = 0;
		
		System.out.print("Digite um número: ");
		numero = sc.nextInt();
		
		for (cont = 1; cont <=10; cont++) {
			System.out.println(numero + " X " + cont + " = " + (numero*cont));
		}
	}
}
