package visao;
import aplicacao.Lampada;
import java.util.Scanner; // para receber entradas do teclado


public class Principal {

	private static Scanner teclado;

	public static void main(String[] args) {
		Lampada lampada1 = new Lampada(); // instanciando um objeto da classe lampada
		int opcao;
		teclado = new Scanner(System.in);
		
		do {
			
			// imprimir informações do menu no console
			System.out.println("------ MENU PRINCIPAL -------");
			System.out.println("1 - LIGAR LAMPADA");
			System.out.println("2 - DESLIGAR LAMPADA");
			System.out.println("3 - A LAMPADA ESTÁ LIGADA? ");
			System.out.println("4 - VERIFICAR POTENCIA");
			System.out.println("5 - ALTERAR POTENCIA");
			System.out.println("6 - SAIR");
			System.out.print("Escolha uma opção para o menu: ");
			opcao = teclado.nextInt(); // recebendo a entrada do teclado e salvando em opcao
			
			switch(opcao) {
				case 1:
					lampada1.ligar(); // ligando lampada
					System.out.println();
				break;
				case 2:
					lampada1.desligar(); //desligando lampada
					System.out.println();
				break;
				case 3:
					if(lampada1.estaLigada())
						System.out.println("\nA lampada está on\n");
					else
						System.out.println("\nA lampada está off\n");
				break;
				case 4:
					System.out.println("\nPotencia da lampada é: " + lampada1.verificarPotencia() + "V\n");
				break;
				case 5:
					System.out.print("\nQual a nova potência? ");
					lampada1.alterarPotencia(teclado.nextInt()); // alterando a potencia da lampada
					System.out.println();
				break;
				case 6:
					System.out.println("\nVocê saiu do menu!\n");
				break;
				default:
					System.out.println("\nOpção do menu inválida!\n");
					
			}		
			//lampada1.limpatela();
		}while(opcao != 6);
	}

}