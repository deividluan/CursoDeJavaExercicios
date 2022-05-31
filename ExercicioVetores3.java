package ExercicioTeste;

public class ExercicioVetores3 {

	public static void main(String[] args) {
		
		int[] B = new int[11];
		
		for (int cont = 0; cont < B.length; cont++) {
			
			if (cont % 2 == 0 ) {
				B[cont]=0;
			}
			else {
				B[cont]=1;
			}
		System.out.print(B[cont] + ", ");
		}

	}

}
