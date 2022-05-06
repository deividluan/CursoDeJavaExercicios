package PacoteExercicio;

import java.util.Scanner;

public class Exercicio18 {
	public static void main (String[]arg) {
		
		Scanner sc = new Scanner (System.in);
		int idade, atual, nascimento = 0;
		
		System.out.print("Ano de nascimento: ");
		nascimento = sc.nextInt();
		
		System.out.print("Ano atual: ");
		atual = sc.nextInt();
		
		idade = atual - nascimento;
		
		if (idade >= 18) {
			System.out.print("Com " + idade + " você já pode votar");
		}
		else {
			System.out.print("Com "+ idade + " você não pode votar");
		}
	}
}
