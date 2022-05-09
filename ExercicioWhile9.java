package ExercicioTeste;

import java.util.Scanner;

public class ExercicioWhile9 {
	public static void main (String[]args) {
		
		Scanner sc = new Scanner (System.in);
		int valor = 0;
		int soma = 0;
		int cont = 1;
		
		while (cont != 11) {
			
			System.out.print(cont +") Digite um numero: ");
			valor = sc.nextInt();
			
			soma += valor; 
			
			cont ++;
		}
		
		soma = soma/10;
		System.out.print("A média dos numeros é: " + soma);
	}
}
