package ExercicioTeste;

import java.util.Scanner;

public class ExercicioWhileDo5 {
	public static void main (String[]args) {
		
		
		Scanner sc = new Scanner (System.in);
		int valores = 0;
		int fatorial = 1;
		int valoresant = 1;
		int cont = 0;
		
		do {
			System.out.print("Digite um numero: ");
			valores = sc.nextInt();
			
			do {
				fatorial *= valoresant;
				valoresant ++;
			}
			while (valoresant < valores + 1);
			
			System.out.println("O fatorial desse numero é: " + fatorial);
			
			cont ++;
		}
		while (cont < 15);
	}
}
