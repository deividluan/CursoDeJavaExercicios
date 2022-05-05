package ExercicioTeste;

import java.util.Scanner;

public class Exercicio32 {
	public static void main (String[]args) {
		
		Scanner sc = new Scanner (System.in);
		String time1, time2 = "";
		int GolsTime1, GolsTime2 = 0;
 		
		System.out.println("-=-=- TIME 1 -=-=-");
		
		System.out.print("Nome do time: ");
		time1 = sc.next();
		
		System.out.print("Numero de Gols: ");
		GolsTime1 = sc.nextInt();
		
		System.out.println("-=-=- TIME 2 -=-=-");
		
		System.out.print("Nome do time: ");
		time2 = sc.next();
		
		System.out.print("Numero de Gols: ");
		GolsTime2 = sc.nextInt();
		
		System.out.println("-=-=- RESULTADO -=-=-");
		
		if (GolsTime1 > GolsTime2) {
			System.out.print("O ganhador foi: " + time1);
		}
		else if (GolsTime2 > GolsTime1) { 
			System.out.print("O ganhador foi: " + time2);
		}
		else {
			System.out.print("Deu empate");
		}
	}
}
