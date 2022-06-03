package PacoteExercicio;
import java.util.Scanner;

public class ExercicioVetores5 {
	public static void main (String[]args) {
		Scanner sc = new Scanner(System.in);
		
		int[] numeros = {1, -2, 3, -4, 5, -6, 7, -8, 9, -10 };
		
		for (int escreve:numeros) {
			
			if (numeros[escreve] < 0) {
				numeros[escreve] = 0;
			}	
			System.out.print(escreve + ", ");
		}
	}
}