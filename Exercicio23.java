package PacoteExercicio;

import java.util.Scanner;
import java.lang.String;

public class Exercicio23 {
	public static void main (String[]args) {
		
		Scanner sc = new Scanner (System.in);
		String sexo = "";
		Double altura, peso = 0.0;
		
		System.out.print("Digite seu sexo (M/F): ");
		sexo = sc.next();
		
		System.out.print("Digite sua altura: ");
		altura = sc.nextDouble();
		
		System.out.println("Sexo: "+ sexo);
		System.out.println("altura: " + altura);
		
		if (sexo == "M") {
			peso = (72.7 * altura) - 58;
			System.out.print("Seu peso ideal é: " + peso);
		}
		else if (sexo == "F") {
			peso = (62.1 * altura) - 44.7;
			System.out.print("Seu peso ideal é: " + peso);
		}
		else {
			System.out.print("ERRO! Digite M ou F");
		}
	}
}
