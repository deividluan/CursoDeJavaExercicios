package PacoteExercicio;

import java.util.Scanner;

public class Exercicio42 {
	public static void main (String[]args) {
		
		Scanner sc = new Scanner (System.in);
		int idade, tempoNaEmpresa, Codigo = 0;
		
		System.out.print("Codigo do funcionario: ");
		Codigo = sc.nextInt();
		
		System.out.print("Idade: ");
		idade = sc.nextInt();
		
		System.out.print("Tempo de servi�o: ");
		tempoNaEmpresa = sc.nextInt();
		
		if (idade >= 65) {
			System.out.print("Requer aposentadoria");
		}
		else if (tempoNaEmpresa >= 30) {
			System.out.print("Requer aposentadoria");
		}
		else if ((tempoNaEmpresa >= 25) && (idade >= 60)) {
			System.out.print("Requer aposentadoria");
		}
		else {
			System.out.print("N�o requer aposentadoria");
		}
	
	}
}
