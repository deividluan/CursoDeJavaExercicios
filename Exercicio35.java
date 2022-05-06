package PacoteExercicio;

import java.util.Scanner;

public class Exercicio35 {
	public static void main (String[]args) {
		
		Scanner sc = new Scanner (System.in);
		
		double LitrosVendidos = 0;
		String CombustivelUsado = "";
		
		System.out.print("Digite o combustivel ultilizado: (A/G) ");
		CombustivelUsado = sc.next();
		
		System.out.print("Litros que comprou: ");
		LitrosVendidos = sc.nextInt();
		
		if (CombustivelUsado  == "G" ) {
			double CombSemDesconto = LitrosVendidos * 3.30;
			
			if (LitrosVendidos <= 20) {
				double CombComDesconto = CombSemDesconto - ((CombSemDesconto / 100) * 3);
				System.out.print("Preço a pagar: " + CombComDesconto);
			}
			else {
				double CombComDesconto = CombSemDesconto - ((CombSemDesconto / 100) * 5);
				System.out.print("Preço a pagar: " + CombComDesconto);
			}
			
		}
		if (CombustivelUsado == "A") {
			double CombSemDesconto = LitrosVendidos * 2.90;
			
			if (LitrosVendidos <= 20) {
				double CombComDesconto = CombSemDesconto - ((CombSemDesconto / 100) *  4);
				System.out.print("Preço a pagar: " + CombComDesconto);
			}
			else {
				double CombComDesconto = CombSemDesconto - ((CombSemDesconto / 100) * 6);
				System.out.print("Preço a pagar: " + CombComDesconto);
			}
		}
	}
}
