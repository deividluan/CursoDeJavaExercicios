package ExercicioTeste;

public class ExercicioWhile7 {
	public static void main (String[]args) {
		int cont= 0;
		int anterior = 0;
		int atual= 1;
		
		while (cont != 15) {
			System.out.print(anterior + ", ");
			atual += anterior;
			anterior = atual;
			cont ++;
		}
	}
}
