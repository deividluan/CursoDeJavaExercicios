package ExercicioTeste;

public class ExercicioFor6 {
	public static void main (String[]args) {
		int expoente = 0;
		int base = 3;
		int cont = 0;
		int baseIni = 3;
		
		for (expoente = 1; expoente < 15; expoente++) {
			while (cont < expoente) {
				if (cont != 0) {
					base *= baseIni;
				}
				cont ++;
			}
			
			System.out.println("3 ^ " + expoente + " = " + base);
		}
	}
}
