package ExercicioTeste;

public class ExercicioWhileDo7 {
	public static void main (String[]args) {
		
		int num = 0, fatorial = 1, cont = 0; 
		
		do {
			do {
				fatorial *= cont;
				cont ++;
				System.out.println("O fatorial de " + num + " é " + fatorial);
			}
			while (cont < num);
			
			num ++;
		}
		while (num < 11);
	}
}
