package ExercicioTeste;

public class ExercicioWhileDo7 {
	public static void main (String[]args) {
		
		int num = 0, fatorial = 1,numant = 1, cont = 0; 

			do {
					fatorial *= numant;
					numant ++;
					cont ++;
					System.out.println("O fatorial de " + num + " é " + fatorial);
					num ++;
			
			}
			while (cont < 11);
	}
}
