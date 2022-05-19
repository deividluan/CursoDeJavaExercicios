package ExercicioTeste;

public class ExercicioFor11 {
	public static void main (String[]args) {
		int cont = 0;
		int ant = 1;
		int fatorial = 1;
		
		for (cont = 0; cont < 11; cont++) {
			if (cont % 2 == 1) {
				while (ant < cont + 1) {
					fatorial *= ant;
					ant ++;
				}
			System.out.println("Falorial de " + cont + " é " + fatorial);
			}
		}
	}
}
