package ExercicioTeste;

import java.util.Scanner;

public class ExercicioWhile1 {
	public static void main (String[]args) {
		
		Scanner sc = new Scanner (System.in);
		int cont = 1;
		int numero = 0;
		
		System.out.print("Digite um numero: ");
		numero = sc.nextInt();
		
		while (cont < 11) {
			System.out.println(numero + " X " + cont + " = " + (numero * cont));
			cont++;
		}
	}

}
