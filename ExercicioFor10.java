package ExercicioTeste;

public class ExercicioFor10 {
	public static void main (String[]args) {
		int celso = 0;
		int fire = 0;
		
		for (celso = 10; celso < 101; celso += 10) {
			fire = ((9 * celso) / 5) + 32;
			System.out.println(celso + "ºC em Fahrenheit é " +  fire + "ºF");
		}
	}
}
