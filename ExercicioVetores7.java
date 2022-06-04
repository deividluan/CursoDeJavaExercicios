package ExercicioTeste;

public class ExercicioVetores7 {
	public static void main (String[]args) {
		
		int[] lista = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		for (int cont : lista) {
			if (lista[cont] % 2 == 0) {
				int por2 = lista[cont] / 2;
				System.out.print(por2 + ", ") ;
			}
			else {
				int por3 = lista[cont] / 3;
				System.out.print(por3 + ", ");
			}
		}
	}
}
