package ExercicioTeste;

import java.util.Scanner;

public class Exercicio31 {
	public static void main (String[]args) {
		
		Scanner sc = new Scanner (System.in);
		int medida1, medida2, medida3 = 0;
		
		System.out.print("medida 1: ");
		medida1 = sc.nextInt();
		
		System.out.print("medida 2: ");
		medida2 = sc.nextInt();
		
		System.out.print("medida 3: ");
		medida3 = sc.nextInt();
		
		if ((medida1 < medida2 + medida3) && (medida2 < medida1 + medida3) && (medida3 < medida1 + medida2)){
			System.out.print("É possivel formar um triangulo!");
		}
		else {
			System.out.print("não é possivel formar um triangulo!");
		}
	}
	
}
