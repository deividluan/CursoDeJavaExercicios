package PacoteExercicio;
import java.util.Scanner;

public class ExercicioVetores5 {
	public static void main (String[]args) {
		Scanner sc = new Scanner(System.in);
		
		int[] numeros = new int[11];
		
		for (int cont = 1; cont < 11; cont++) {
			
			System.out.print("Digite um numero: ");
			if (numeros[cont] > 0) {
				numeros[cont] = sc.nextInt();
			}
			else {
				numeros[cont] = 0;
			}
			
		for (int escreve:numeros) {
			System.out.print(escreve + ", ");
		}
	}
}
