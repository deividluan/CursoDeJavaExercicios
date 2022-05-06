package PacoteExercicio;

import java.util.Scanner;

public class Exercicio24 {
	public static void main (String[]args) {
		
		Scanner sc = new Scanner(System.in);
		float SalarioFixo, ValorDaVenda = 0;
		
		System.out.print("Seu salario fixo: ");
		SalarioFixo = sc.nextFloat();
		
		System.out.print("Valor das vendas: ");
		ValorDaVenda = sc.nextFloat();
		
		float SalarioFim = SalarioFixo + ((ValorDaVenda / 100) * 3);
		
		if (ValorDaVenda > 1500) {
			float SalarioConvertido = SalarioFim + ((ValorDaVenda / 100) * 5);
			System.out.print("Seu salario é: " + SalarioConvertido);
		}
		else {
			System.out.print("Seu salario é: " + SalarioFim);
		}
		
	}
	
	
}
