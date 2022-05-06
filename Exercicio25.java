package PacoteExercicio;

import java.util.Scanner;

public class Exercicio25 {
	public static void main (String[]args) {
		Scanner sc = new Scanner (System.in);
		
		float NumeroDaConta, credito, debito, saldo = 0;
		
		System.out.print("Digite o numero da sua conta: ");
		NumeroDaConta = sc.nextFloat();
		
		System.out.print("Digite seu saldo: ");
		saldo = sc.nextFloat();
		
		System.out.print("Digite seu debito: ");
		debito = sc.nextFloat();
		
		System.out.print("Digite seu crédito: ");
		credito = sc.nextFloat();
		
		Float SaldoFinal = saldo - (debito + credito);
		
		if (SaldoFinal > 0) {
			System.out.print("Saldo final: " + SaldoFinal + "   Resultado: Positivo");
		}
		else {
			System.out.print("Saldo final: " + SaldoFinal + "   Resultado: Negativo");
		}
	}
}
