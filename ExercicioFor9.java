package ExercicioTeste;

public class ExercicioFor9 {
	public static void main (String[]args) {
		int num = 1;
		int numant = 0;
		int numprox = 0;
		int cont = 0;
		
		for (cont = 0; cont <10; cont++) {
			System.out.print(num + ", ");
			numprox = num + numant;
			numant = num;
			num = numprox;
		}
	}
}
