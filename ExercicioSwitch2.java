package PacoteExercicio;

import java.util.Scanner;

public class ExercicioSwitch2 {
	public static void main (String[]args) {
		
		Scanner sc = new Scanner (System.in);
		int mes = 0;
		
		System.out.print("Digite o mês do ano em numero: ");
		mes = sc.nextInt();
		
		switch(mes) {
		case 1:
			System.out.print("Janeiro");
			break;
		
		case 2:
			System.out.print("Fevereiro");
			break;
			
		case 3:
			System.out.print("Março");
			break;
			
		case 4:
			System.out.print("Abril");
			break;
			
		case 5:
			System.out.print("Maio");
			break;
			
		case 6:
			System.out.print("junho");
			break;
		
		case 7:
			System.out.print("julho");
			break;
			
		case 8:
			System.out.print("agosto");
			break;
		
		case 9:
			System.out.print("Setembro");
			break;
			
		case 10:
			System.out.print("Outubro");
			break;
			
		case 11:
			System.out.print("Novembro");
			break;
		
		case 12:
			System.out.print("Dezembro");
			break;
		}	
	}

}
