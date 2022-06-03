package PacoteExercicio;

public class ExercicioVetores8 {
	public static void main (String[]args) {
		
		int[] lista = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int numero = 5;
		int cont = 0;

		for (int tudo : lista) {
			if (lista[tudo] == numero) {
				System.out.print("O numero " + numero + " esta na posição: " + lista[numero]);
				cont ++;
			}
		}
		System.out.print("O numero " + numero + " apareceu " + cont + " vezes");
	}
}
