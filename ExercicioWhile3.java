package ExercicioTeste;

import java.util.Scanner;

public class ExercicioWhile3 {
	public static void main (String[]args) {
		
		Scanner sc  = new Scanner (System.in);
		 int numero = 2;
		 int tot = 0;
		 
		 while (numero < 501) {
			 tot = numero + tot;
			 System.out.print(numero + ", ");
			 numero ++; 
			 numero ++;
		 }
		 System.out.println("Soma de todos os pares: " + tot);
	}
}
