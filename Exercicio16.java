package PacoteExercicio;

import java.util.Scanner;

public class Exercicio16 {
	public static void main (String[]args) {
		
		Scanner sc = new Scanner(System.in);
		int fruta = 0;
		System.out.print("Quantas ma��s voc� vai querer? ");
		fruta = sc.nextInt();
		
		if (fruta > 12) {
			System.out.print("Sair� por " + (fruta * 1) + " R$");
		}
		else {
			System.out.print("Sair� por " + (fruta* 1.3) + " R$");
		}
	}
}
