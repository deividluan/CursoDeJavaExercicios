package ExercicioTeste;

public class ExercicioWhile8 {
	public static void main (String[]args) {
		
		int celso = 10;
		int cont = 0;
		
		while (cont != 10) {
			int fire = ((9 * celso) / 5) +  32;
			System.out.println(celso + "℃ em Fahrenheit é: " + fire + "℉");
			celso += 10;
			cont ++;
		}
	}
}
