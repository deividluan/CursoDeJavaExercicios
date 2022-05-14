package ExercicioTeste;

public class ExercicioWhileDo4 {
	public static void main (String[]args) {
		
		int cont = 1;
		long soma = 0;
		long grao = 1;
		
		do {
			System.out.print(grao + ", ");
			soma += grao;
			grao *= 2;
			
			cont ++;
		}
		while (cont <= 64);
		System.out.println("");
		System.out.print("No final voce terá: " + soma + " grãos");
	}
}
