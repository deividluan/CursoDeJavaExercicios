package PacoteExercicio;

import java.util.Scanner;

public class ExercicioWhileDo8 {
	public static void main (String[]args) {
		Scanner sc = new Scanner (System.in);
		String resposta = "";
		int largura, comprimento, area, total = 0;
		int cont = 1;
		
		do {
			System.out.println("-=-=-=-=-=-=-=-=-=-=-=-=-=-=-");
			if (cont == 1){
				System.out.println("         Quarto");
				
				System.out.print("Largura: ");
				largura = sc.nextInt();
				
				System.out.print("Comprimento: ");
				comprimento = sc.nextInt();
				
				area = comprimento * largura;
				
			}
			else if (cont == 2){
				System.out.println("          Sala");

				System.out.print("Largura: ");
				largura = sc.nextInt();
				
				System.out.print("Comprimento: ");
				comprimento = sc.nextInt();
				
				area = comprimento * largura;
				
			}
			else if (cont == 3) {
				System.out.println("      Area de serviço");

				System.out.print("Largura: ");
				largura = sc.nextInt();
				
				System.out.print("Comprimento: ");
				comprimento = sc.nextInt();
				
				area = comprimento * largura;
				
			}
			else if (cont == 4) {
				System.out.println("        Cozinha");

				System.out.print("Largura: ");
				largura = sc.nextInt();
				
				System.out.print("Comprimento: ");
				comprimento = sc.nextInt();
				
				area = comprimento * largura;
				
			}
			else if (cont == 5) {
				System.out.println("        Garagem");

				System.out.print("Largura: ");
				largura = sc.nextInt();
				
				System.out.print("Comprimento: ");
				comprimento = sc.nextInt();
				
				area = comprimento * largura;
				
			}
			else if (cont == 6) {
				System.out.println("        Quintal");

				System.out.print("Largura: ");
				largura = sc.nextInt();
				
				System.out.print("Comprimento: ");
				comprimento = sc.nextInt();
				
				area = comprimento * largura;
				
			}
			else {
				break;
			}
			
			System.out.print("Quer continuar (S/N): ");
			resposta = sc.next();
			
			total += area;
			cont ++;
		}
		while (resposta != "S");
		
		System.out.print("Tamanho da casa: " + total + " métros quadrados");
	}
}
