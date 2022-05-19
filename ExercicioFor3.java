package ExercicioTeste;

public class ExercicioFor3 {
	public static void main (String[]args) {
		int cont = 0;
		int soma = 0;
		
		for (cont = 1; cont <= 100; cont++) {
			soma += cont;
		}
		System.out.print("Soma dos numeros de 1 a 100: " + soma);
	}
}
