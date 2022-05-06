package PacoteExercicio;

import java.util.Scanner;

public class Exercicio38 {
	public static void main (String[]args) {
		
		Scanner sc = new Scanner (System.in);
		int usuario, senha = 0;
		int usuarioCerto = 1234;
		int senhaCorreta = 9999;
		
		System.out.print("Usuario: ");
		usuario = sc.nextInt();
		
		if (usuario == 1234) {
			
			System.out.print("Senha: ");
			senha = sc.nextInt();
			
			if (senha == 9999) {
				System.out.print("Acesso Permitido!");
			}
			else {
				System.out.print("Acesso negado!");
			}
		}
		else {
			System.out.print("Senha incorréta!");
		}
			
	}
}
