package visao;
import java.util.Scanner;

public class Principal {

	
	private static Scanner teclado;

	public static void main(String[] args) {
		teclado = new Scanner(System.in);
		int n = 3;
		int A[] = new int[n]; // referenciando e criando o array A na memória
		int B[] = new int[n]; // referenciando e criando o array B na memória
		int C[] = new int[n]; // referenciando e criando o array C na memória
		int somaA = 0;
		
		for(int i = 0; i < n; i++) { // preenchendo os vetores A e B
			System.out.print("Elemento A[" + i + "]: ");
			A[i] = teclado.nextInt();
			System.out.print("Elemento B[" + i + "]: ");
			B[i] = teclado.nextInt();
			somaA = somaA + A[i]; // soma dos elementos de A
			C[i] = A[i] + B[i]; // soma dos elementos de A e B na mesma posição, guardados no array C
		}

		System.out.println("\nSoma dos elementos do vetor A = " + somaA);
		System.out.print("Soma dos elementos de mesmo indice entre o vetor A e B formando o vetor C = ");
		for(int i = 0; i < n; i++){
			System.out.print(C[i] + " ");
		}
		
	}

}