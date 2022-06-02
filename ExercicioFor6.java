package ExercicioTeste;

public class ExercicioFor6 {
	public static void main (String[]args) {
		int cont = 0;
		
		for (cont = 1; cont < 200; cont++) {
			if (cont % 4 == 0) {
				System.out.print(cont + ", ");
			}
		}
	}
}
