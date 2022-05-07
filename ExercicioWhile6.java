package ExercicioTeste;

import java.util.Scanner;

public class ExercicioWhile6 {
	public static void main (String[]args) {
		int expoente, base, baseInicial, cont = 0;
		 
		Scanner sc = new Scanner (System.in);
		
		System.out.print("Base: ");
		base = sc.nextInt();
		baseInicial = base;
		
		System.out.print("Expoente: ");
		expoente = sc.nextInt();
		
		while (cont != expoente) {
				base *= baseInicial;
				System.out.print(base + ", ");
				cont++;
		}
		System.out.println(" |  O valor final é: " + base);
	}
}