package ExercicioTeste;

import java.util.Scanner;

public class ExercicioFor7 {
	public static void main (String[]args) {
		Scanner sc = new Scanner (System.in);
		
		int base = 0;
		int expoente = 0;
		int cont = 0;
		int potencia = 0;
		
		
		System.out.print("Digite a base: ");
		base = sc.nextInt();
		
		int baseIni = base;
		
		System.out.print("Digite o expoente: ");
		expoente = sc.nextInt();
		
		for (cont = 0; cont < expoente; cont++) {
			if (cont != 0) {
				base *= baseIni;
			}
		}
		System.out.print(baseIni + " elevado a " + expoente + " é " + base);
	}
}
