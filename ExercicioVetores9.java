package ExercicioTeste;

import java.util.Scanner;

public class ExercicioVetores9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
				
		String[] nomes =  {"flavio", "junior", "carlos", "renan", "rafael", "julia", "ana", "fernanda", "alexandre", "eduardo" };
		
		System.out.print("Digite um nome: ");
		String digitado = sc.next();
		
		for (String freio : nomes) {
		
			if (digitado == freio) {
					System.out.print(freio + ", ");
			}
		}
	}

}
