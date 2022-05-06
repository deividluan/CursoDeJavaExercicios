package PacoteExercicio;

import java.util.Scanner;

public class Exercicio36 {
	public static void main (String[]args) {
		
		Scanner sc = new Scanner (System.in);
		int homem1, homem2, mulher1, mulher2, soma1, soma2 = 0;
		
		System.out.print("Idade homem 1: ");
		homem1 = sc.nextInt();
		
		System.out.print("Idade mulher 1: ");
		mulher1 = sc.nextInt();
		
		System.out.print("Idade homem 2: ");
		homem2 = sc.nextInt();
		
		System.out.print("Idade mulher 2: ");
		mulher2 = sc.nextInt();
		
		if (homem1 > homem2) {
			if (mulher1 > mulher2) {
				soma1 = homem1 + mulher2;
				soma2 = homem2 + mulher1;
			}
			else {
				soma1 = homem1 + mulher1;
				soma2 = homem2 + mulher2;
			}
		}
		else {
			if (mulher1 > mulher2) {
				soma1 = homem2 + mulher1;
				soma2 = homem1 + mulher2;
			}
			else {
				soma1 = homem2 + mulher2;
				soma2 = homem1 + mulher1;
			}
		}
		System.out.println("Soma da idade do homem mais velho com a mulher mais nova: " + soma1);
		System.out.println("soma da idade do homem mais novo com a mulher mais velha: " + soma2);
	}
}
