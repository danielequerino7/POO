package visao;
import java.util.Scanner;
import java.util.ArrayList;

public class Principal {

	private static Scanner teclado;

	public static void main(String[] args) {
		teclado = new Scanner(System.in);
		
		int n = 3;
		ArrayList<Integer> A = new ArrayList<Integer>();
		ArrayList<Integer> B = new ArrayList<Integer>();
		ArrayList<Integer> C = new ArrayList<Integer>();
		int somaA = 0;
		
		for(int i = 0; i < n; i++) { // preenchendo os vetores A e B
			System.out.print("Elemento A[" + i + "]: ");
			A.add(teclado.nextInt());
			System.out.print("Elemento B[" + i + "]: ");
			B.add(teclado.nextInt());
			somaA = somaA + A.get(i); // soma dos elementos de A
			C.add(A.get(i) + B.get(i)); // soma dos elementos de A e B na mesma posição, guardados no array C
		}

		System.out.println("\nSoma dos elementos do vetor A = " + somaA);
		System.out.print("Soma dos elementos de mesmo indice entre o vetor A e B formando o vetor C = " + C);
	}
}