package ExercicioTeste;

import java.util.Scanner;

public class ExercicioWhileDo10 {
	public static void main (String[]args) {
		
		Scanner sc = new Scanner (System.in);
		int divisor, denominador, resultado, denominadorIni = 0;
		int cont = 0;
	
		System.out.print("Digite o denominador: ");
		denominador = sc.nextInt();
		
		denominadorIni = denominador;
		
		System.out.print("Digite o divisor: ");
		divisor = sc.nextInt();
			
		do {
			cont ++;
			denominador -= divisor; 
		}
		while (denominador - divisor >= 0);
		System.out.println(divisor + " cabe " + cont + " vezes dentro de " + denominadorIni);
		System.out.print(denominador);
	}
}
