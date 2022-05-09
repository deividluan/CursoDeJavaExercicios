package ExercicioTeste;

public class ExercicioWhile7 {
	int cont = 0;
	int n1 = 0;
	int n2 = 0;
	
	while (cont != 15) {
		int n3 = 0;
		n3 = n1 + n2;
		n2 = n1;
		n1 = n3;
		System.out.print(n2 + " " );
		cont ++;
		}
	}
}
