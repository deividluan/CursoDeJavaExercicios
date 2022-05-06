package PacoteExercicio;

import java.util.Scanner;

public class Exercicio43 {
	public static void main (String[]args) {
		
		Scanner sc = new Scanner (System.in);
		int a, b, c = 0;
		String mens = "";
		
		System.out.print("Medida A: ");
		a = sc.nextInt();
		
		System.out.print("Medida B: ");
		b = sc.nextInt();
		
		System.out.print("Medida C: ");
		c = sc.nextInt();
		
		if ((a < b+c) && (b < a + c) && (c < a + b)) {
			if ((a == b) && (b == c)) {
				mens = "Triangulo Equilatero";
			}
			else {
				if ((a == b) || (b == c) || (a == c)) {
					mens = "Triangulo Isóceles";
				}
				else {
					mens = "Triangulo Escaleno";
				}
			}
		}
		else {
			mens = "Não é possivel formar um triangulo";
		}
		System.out.print(mens);
	}
}
// 1 - N.Possivel | 2 - T.Escaleno | 3 - N.Possivel \\ 
// 4 - T.Equilatero | 5 - T.Isóceles\\