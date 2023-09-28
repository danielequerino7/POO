package visao;
import aplicacao.Aluno;
import java.util.Scanner;
import java.util.ArrayList;

public class Principal {

	private static Scanner teclado;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		teclado = new Scanner(System.in);
		int opcao, matricula_desejada, escolhaNota;
		boolean encontrou;
		
		ArrayList<Aluno> lista_alunos = new ArrayList<Aluno>(); // referenciando o arraylist
		Aluno aluno; // referencia
		
		do {
			System.out.println("\n\t|---------------------------------|");
			System.out.println("\t|\tMENU PRINCIPAL            |");
			System.out.println("\t|---------------------------------|");
			System.out.println("\t|1 - CADASTRAR ALUNOS             |");
			System.out.println("\t|2 - CADASTRAR NOTAS              |");
			System.out.println("\t|3 - CALCULAR MÉDIAS              |");
			System.out.println("\t|4 - INFORMAR SITUAÇÕES           |");
			System.out.println("\t|5 - INFORMAR DADOS DE UM ALUNO   |");
			System.out.println("\t|6 - ALTERAR NOTA                 |");
			System.out.println("\t|7 - SAIR                         |");
			System.out.println("\t|---------------------------------|");
			System.out.print("\t Escolha uma opção do menu: ");
			opcao = teclado.nextInt();
			
			switch(opcao) {
				case 1:	
					teclado.nextLine(); // limpando o scanner do teclado
					aluno = new Aluno(); // instanciando um novo aluno;
					System.out.println("\n\t ---------------------------");
					System.out.println("\t     CADASTRANDO ALUNOS");
					System.out.println("\t ---------------------------");
					System.out.print("\t Digite o nome do aluno: ");	
					aluno.setNome(teclado.nextLine());
					System.out.print("\t Digite a matricula do aluno: ");
					aluno.setMatricula(teclado.nextInt());
					
					lista_alunos.add(aluno); // adicionando o objeto aluno dentro do arraylist
					System.out.println("\n\t ALUNO CADASTRADO COM SUCESSO!");
				break;
				case 2:
					System.out.println("\n\t -------------------------");
					System.out.println("\t     CADASTRANDO NOTAS");
					System.out.println("\t -------------------------\n");
					System.out.print("\t Digite a matricula do aluno: ");
					matricula_desejada = teclado.nextInt();
					encontrou = false;
					
					for(int i = 0; i < lista_alunos.size(); i++) {
						if(matricula_desejada == lista_alunos.get(i).getMatricula()) {
							System.out.println("\t Digite as 3 notas do aluno: ");
							lista_alunos.get(i).setNotas(teclado.nextFloat(), teclado.nextFloat(), teclado.nextFloat());						}
							encontrou = true;
							System.out.println("\n\t NOTAS CADASTRADAS COM SUCESSO!");
					}
					if(!encontrou) 
						System.out.println("\t Matricula do aluno não encontrada");
					
				break;
				case 3:
					System.out.println("\n\t -------------------------");
					System.out.println("\t     CALCULANDO MÉDIA");
					System.out.println("\t -------------------------\n");
					System.out.print("\t Digite a matricula do aluno: ");
					matricula_desejada = teclado.nextInt();
					encontrou = false;
					
					for(int i = 0; i < lista_alunos.size(); i++) {
						if(matricula_desejada == lista_alunos.get(i).getMatricula()) {
							lista_alunos.get(i).calcularMedia();
							encontrou = true;
							System.out.println("\n\t MÉDIA CALCULADA COM SUCESSO!");
						}
					}
					if(!encontrou) 
						System.out.println("\t Matricula do aluno não encontrada");
					
				break;
				case 4:
					System.out.println("\n\t -------------------------");
					System.out.println("\t     SITUAÇÃO DOS ALUNOS");
					System.out.println("\t -------------------------\n");
					
					System.out.print("\t Digite a matricula do aluno: ");
					matricula_desejada = teclado.nextInt();
					encontrou = false;
					
					for(int i = 0; i < lista_alunos.size(); i++) {
						if(matricula_desejada == lista_alunos.get(i).getMatricula()) {
							System.out.println("\t Situação do aluno --> " + lista_alunos.get(i).getSituacao());
							encontrou = true;
						}
					}
					if(!encontrou) 
						System.out.println("\t Matricula do aluno não encontrada");
			
				break;
				case 5:
					System.out.println("\n\t -------------------------");
					System.out.println("\t     INFORMAR DADOS");
					System.out.println("\t -------------------------\n"); 
					System.out.print("\t Digite a matricula do aluno: ");
					matricula_desejada = teclado.nextInt(); // recebendo a matricula do usuario
					encontrou = false;
					
					for(int i = 0; i < lista_alunos.size(); i++) {
						if(matricula_desejada == lista_alunos.get(i).getMatricula()) {
							System.out.println("\n\t--------------------------------------");
							System.out.println("\t  DADOS DO ALUNO COM A MATRICULA " + matricula_desejada);
							System.out.println("\t--------------------------------------\n");
							System.out.println("\t Nome: " + lista_alunos.get(i).getNome());
							//System.out.println("\t Matricula: " + alunoAux.getMatricula());
							System.out.println("\t Nota 1: " + lista_alunos.get(i).getNota1());
							System.out.println("\t Nota 2: " + lista_alunos.get(i).getNota2());
							System.out.println("\t Nota 3: " + lista_alunos.get(i).getNota3());
							System.out.println("\t Média: " + lista_alunos.get(i).getMedia());
							System.out.println("\t Situação: " + lista_alunos.get(i).getSituacao());
							encontrou = true;
						}					
					}
					if(!encontrou) 
						System.out.println("\t Matricula do aluno não encontrada");
					
				break;
				case 6: 
					System.out.println("\n\t -------------------------");
					System.out.println("\t     ALTERANDO NOTA");
					System.out.println("\t -------------------------\n");
					System.out.print("\t Digite a matricula do aluno: ");
					matricula_desejada = teclado.nextInt();
					encontrou = false;
					
					for(int i = 0; i < lista_alunos.size(); i++) {
						if(matricula_desejada == lista_alunos.get(i).getMatricula()) {
							do {
								System.out.println("\t Qual nota você deseja alterar: (1 - nota 1, 2 - nota 2, 3 - nota 3)");
								escolhaNota = teclado.nextInt();
							}while((escolhaNota < 1) || (escolhaNota > 3));
							System.out.println("\t Digite a nova nota: ");
							lista_alunos.get(i).alterarNota(escolhaNota, teclado.nextFloat());
							encontrou = true;
							System.out.println("\n\t NOTA ALTERADA COM SUCESSO!");
						}
						
					}
					if(!encontrou) 
						System.out.println("\t Matricula do aluno não encontrada");
					
				break;
				case 7:
					System.out.println("\n\t\t FECHANDO MENU!");
				break;
				default:
					System.out.println("\t\tOpção inválida!");			
			}
			
		}while(opcao != 7);

	}
}