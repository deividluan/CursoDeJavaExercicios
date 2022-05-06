package PacoteExercicio;

import java.util.Scanner;

public class ExercicioSwitch1 {
	public static void main (String[]args) {
		
		Scanner sc = new Scanner (System.in);
		int Dia = 0;
		
		System.out.print("Dia da semana em numero: ");
		Dia = sc.nextInt();
		
		switch(Dia) {
		
		case 1:
			System.out.print("Domingo");
			break;
			
		case 2:
			System.out.print("Segunda");
			break;
			
		case 3:
			System.out.print("Terça");
			break;
			
		case 4:
			System.out.print("Quarta");
			break;
			
		case 5:
			System.out.print("Quinta");
			break;
			
		case 6:
			System.out.print("Sexta");
			break;
			
		case 7:
			System.out.print("Sabado");
			break;
			
		}
		
	}
}
