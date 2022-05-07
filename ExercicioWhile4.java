package ExercicioTeste;

public class ExercicioWhile4 {
	public static void main (String[]args) {
		int cont = 0;
		
		
		while (cont < 20) {
			cont++;
			if (cont != 19) {
			System.out.print(cont + ", ");
			}
			else {
				System.out.print(cont);
			}
			cont++;
			
			
		}
	}
}
