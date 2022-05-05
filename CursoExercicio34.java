package ExercicioTeste;

import java.util.Scanner;

public class CursoExercicio34 {
	
	public static void main (String[]args) {
		
		Scanner sc = new Scanner (System.in);
		String resposta1, resposta2, resposta3 = "";
		
		System.out.println("| A = Verdadeiro | B = Verdadeiro | C = Falso |");
		System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
		
		System.out.print("(A e B) ou (A ou B)      Verdadeiro ou Falso: ");
		resposta1 = sc.next();
		
		System.out.print("(A ou B) e (A e C)       Verdadeiro ou Falso: ");
		resposta2 = sc.next();
		
		System.out.print("A ou C e ou A e não B    Verdadeiro ou Falso: ");
		resposta3 = sc.next();
	}
}
