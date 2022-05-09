package ExercicioTeste;

import java.util.Scanner;

public class ExercicioWhile9 {
	public static void main (String[]args) {
		
		Scanner sc = new Scanner (System.in);
		int valor = 0;
		float soma = 0;
		int cont = 1;
		
		while (cont != 11) {
			
			System.out.print(cont +") Digite um numero: ");
			valor = sc.nextInt();
			
			soma += valor; 
			
			cont ++;
		}
		
		System.out.println("A soma dos numeros é: " + soma);
		
		float media = soma/10;
		System.out.println("A média dos numeros é: " + media);
	}
}
