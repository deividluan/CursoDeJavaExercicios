package PacoteExercicio;

	import java.util.Scanner;
	
public class Exercicio40 {
	public static void main (String[]args) {
		
		Scanner sc = new Scanner (System.in);
		String produto = "";
		double QuantAd, PrecoUnitario = 0;
		
		System.out.print("Nome do Produto: ");
		produto = sc.next();
		
		System.out.print("Quantidade Adquirida: ");
		QuantAd = sc.nextInt();
		
		System.out.print("Preço unitario: ");
		PrecoUnitario = sc.nextInt();
		
		double total = QuantAd + PrecoUnitario;
		
		if (QuantAd <= 5) {
			double desconto = total - ((PrecoUnitario / 100) * 2); 
			System.out.print("Produto: " + produto + "  |  Preço a pagar: " + desconto);
		}
		else if ((QuantAd > 5) && (QuantAd <= 10)) {
			double desconto = total - ((PrecoUnitario / 100) * 3);
			System.out.print("Produto: " + produto + "  |  Preço a pagar: " + desconto);
		}
		else {
			double desconto = total - ((PrecoUnitario / 100) * 5);
			System.out.print("Produto: " + produto + "  |  Preço a pagar: " + desconto);
		}
	}
}
