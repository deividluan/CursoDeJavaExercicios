package ExercicioTeste;

import java.util.Scanner;

public class ExercicioWhileDo6 {
	public static void main (String[]args) {
		
		Scanner sc = new Scanner (System.in);
		int valores, soma = 0, cont = 0;
		
		do {
			System.out.print("Digite um numero (negativo para parar) : ");
			valores = sc.nextInt();
			
			if (valores > 0) {
				soma += valores;
				cont ++;
			}
		}
		while (valores > 0);
		System.out.println("somatorio: " + soma);
		System.out.println("Total de valores lidos: " + cont);
		System.out.println("Média: " + (soma / cont));
	}
}
