package visao;
import aplicacao.Elevador;
import java.util.Scanner;

public class Principal {

	private static Scanner teclado;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		teclado = new Scanner(System.in);
		int opcao, qtdPessoas, qtdAndares;
		
		System.out.print("Qual a capacidade do elevador? ");
		qtdPessoas = teclado.nextInt();
		System.out.print("Quantos andares tem o elevador? ");
		qtdAndares = teclado.nextInt();
		
		Elevador elevador1 = new Elevador(qtdPessoas, qtdAndares);
		//elevador1.inicializa(qtdPessoas, qtdAndares);
		System.out.println("\n");
		
		do {
			System.out.println("----- MENU ELEVADOR -----");
			System.out.println("1 - Entrar");
			System.out.println("2 - Sair");
			System.out.println("3 - Sobe");
			System.out.println("4 - Desce");
			System.out.println("5 - Fechar menu");
			System.out.print("Escolha a opção desejada: ");
			opcao = teclado.nextInt();
			
			
			
			switch(opcao) {
				case 1:
					if(elevador1.entra()) {
						System.out.println("\nEntrada permitida!\n");
					}
					else {
						System.out.println("\nEntrada negada, elevador cheio!\n");
					}
				break;
				case 2:
					if(elevador1.sai()) {
						System.out.println("\nSaída permitida!\n");
					}
					else {
						System.out.println("\nSaída negada, elevador vazio!\n");
					}
				break;
				case 3:
					if(elevador1.sobe()) {
						System.out.println("\nSubindo...\n");
					}
					else {
						System.out.println("\nElevador no último andar!\n");
					}
				break;
				case 4:
					if(elevador1.desce()) {
						System.out.println("\nDescendo...\n");
					}
					else {
						System.out.println("\nElevador no térreo!\n");
					}
				break;
				case 5:
					System.out.println("\nMenu finalizado!\n");
				break;
				default:
					System.out.println("\nOpção inválida!\n");			
			}
					
					
		}while(opcao!=5);
	}

}