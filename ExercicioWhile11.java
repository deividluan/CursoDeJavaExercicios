package ExercicioTeste;

import java.util.Scanner;

public class ExercicioWhile11 {
	public static void main (String[]args) {
		
		Scanner sc = new Scanner (System.in);
		String resposta = "";
		int cont = 1;
		int largura = 0;
		int comprimento = 0;
		int area = 0;
		int total = 0;
		
		while (cont != 8) {
		
				System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
				
				if (cont == 1) {
				System.out.println("                  Sala");
				}
				
				else if (cont == 2) {
				System.out.println("                 Cozinha");
				}
				
				else if (cont == 3) {
					System.out.println("             Quarto");
					}
				
				else if (cont == 4) {
					System.out.println("         Área de serviço");
					}
				else if (cont == 5) {
					System.out.println("             Quintal");
					}
				else if (cont == 6) {
					System.out.println("             Garagem");
					}
				
				System.out.print("Digite a largura: ");
				largura = sc.nextInt();
				
				System.out.print("Digite o comprimento: ");
				comprimento = sc.nextInt();
				
				area = largura * comprimento;
				total += area;
				
				System.out.print("Deseja continuar? (S/N) ");
				resposta = sc.next();
				
		
		cont ++;	
		}
		System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");
		System.out.print("Area total da casa: " + total);
	}
}
