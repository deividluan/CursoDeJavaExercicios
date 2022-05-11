package ExercicioTeste;

public class ExercicioWhileDo3 {
	public static void main (String[]args) {
		
		int numero = 1;
		
		do {
			
			if (numero % 4 == 0) {
				System.out.print(numero + ", ");
			}
			numero ++;
		}
		while (numero < 200);
	}
}
