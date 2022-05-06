package PacoteExercicio;

import java.util.Scanner;

public class Exercicio37 {
	public static void main (String[]args) {
		
		Scanner sc = new Scanner (System.in);
		double maca, morango, ValorMa, ValorMo, Total = 0;
		
		System.out.print("Kg de maçâs comprados: ");
		maca = sc.nextInt();
		
		System.out.print("Kg de morangos: ");
		morango = sc.nextInt();
		
		double TotFrutas = maca + morango;
		
		if (maca > 5) {
			ValorMa = maca * 1.5;
		}
		else {
			ValorMa = maca * 1.8;
		}
		
		if (morango > 5) {
			ValorMo = morango * 2.5;
		}
		else {
			ValorMo = morango * 2.2;
		}
		
		Total = ValorMo + ValorMa;
		if ((Total > 25) || (TotFrutas > 8)) {
			double TotalComDesconto = Total - ((Total / 100) * 10);
			System.out.print("Valor a pagar: " + TotalComDesconto + "R$");
		}
		else {
			System.out.print("Valor a pagar: " + Total + "R$");
		}
		
	}
		
}
