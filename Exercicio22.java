package PacoteExercicio;

import java.util.Scanner;

public class Exercicio22 {
	public static void main (String[]args) {
		
		Scanner sc = new Scanner(System.in);
		int HorasTrabalhadas, SalarioPorHora, SalarioFinal= 0;
		
		System.out.print("Horas trabalhadas no mês: ");
		HorasTrabalhadas = sc.nextInt();
		
		System.out.print("Salario por Hora: ");
		SalarioPorHora = sc.nextInt();
		
		int HorasPorSemana = HorasTrabalhadas / 4;
		int SalarioFim = (HorasTrabalhadas * SalarioPorHora);
		
		if (HorasPorSemana > 40) {
			int SalarioConvertido = SalarioFim + ((SalarioFim/100) * 50);
			System.out.print("O seu salário é: " + SalarioConvertido);
		}
		else {
			System.out.print("O seu salario é: " + SalarioFim);
		}
		
	}
}