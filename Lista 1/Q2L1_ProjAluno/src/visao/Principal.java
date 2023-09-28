package visao;
import aplicacao.Aluno;
import java.util.Scanner;

public class Principal {

	private static Scanner teclado;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opcao, matricula_desejada, escolhaNota;
		Aluno a1 = new Aluno(); // instanciando objeto
		Aluno a2 = new Aluno(); // instanciando objeto
		Aluno a3 = new Aluno(); // instanciando objeto
		teclado = new Scanner(System.in);
		
		
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
			
			teclado.nextLine(); // limpando o scanner do teclado
			switch(opcao) {
				case 1:	
					System.out.println("\n\t ---------------------------");
					System.out.println("\t     CADASTRANDO ALUNOS");
					System.out.println("\t ---------------------------");
					System.out.print("\t Digite o nome do aluno 1: ");	
					a1.setNome(teclado.nextLine()); // recebendo o nome do primeiro aluno
					System.out.print("\t Digite a matricula do aluno 1: ");
					a1.setMatricula(teclado.nextInt()); // recebendo a matricula do primeiro aluno
					teclado.nextLine(); // limpando o scanner do teclado
					System.out.print("\t Digite o nome do aluno 2: ");			
					a2.setNome(teclado.nextLine()); // recebendo o nome do segundo aluno
					System.out.print("\t Digite a matricula do aluno 2: ");
					a2.setMatricula(teclado.nextInt()); // recebendo a matricula do segundo aluno
					teclado.nextLine(); // limpando o scanner do teclado
					System.out.print("\t Digite o nome do aluno 3: ");
					a3.setNome(teclado.nextLine()); // recebendo o nome do terceiro aluno
					System.out.print("\t Digite a matricula do aluno 3: ");
					a3.setMatricula(teclado.nextInt());
					System.out.println("\n\t ALUNOS CADASTRADOS COM SUCESSO!");
				break;
				case 2:
					System.out.println("\n\t -------------------------");
					System.out.println("\t     CADASTRANDO NOTAS");
					System.out.println("\t -------------------------\n");
					System.out.println("\t Informe as 3 notas do aluno 1: ");
					a1.setNotas(teclado.nextFloat(), teclado.nextFloat(), teclado.nextFloat());
					System.out.println("\t Informe as 3 notas do aluno 2: ");
					a2.setNotas(teclado.nextFloat(), teclado.nextFloat(), teclado.nextFloat());
					System.out.println("\t Informe as 3 notas do aluno 3: ");
					a3.setNotas(teclado.nextFloat(), teclado.nextFloat(), teclado.nextFloat());
					System.out.println("\n\t NOTAS CADASTRADAS COM SUCESSO!");
				break;
				case 3:
					a1.calcularMedia();
					a2.calcularMedia();
					a3.calcularMedia();
					System.out.println("\n\t MÉDIAS CALCULADAS COM SUCESSO!");
					
				break;
				case 4:
					System.out.println("\n\t -------------------------");
					System.out.println("\t     SITUAÇÃO DOS ALUNOS");
					System.out.println("\t -------------------------\n");
					System.out.println("\tSituação do aluno 1 --> " + a1.getSituacao());
					System.out.println("\tSituação do aluno 2 --> " + a2.getSituacao());
					System.out.println("\tSituação do aluno 3 --> " + a3.getSituacao());
				
				break;
				case 5:
					System.out.println("\n\t -------------------------");
					System.out.println("\t     INFORMAR DADOS");
					System.out.println("\t -------------------------\n"); 
					System.out.print("\t Digite a matricula do aluno: ");
					matricula_desejada = teclado.nextInt(); // recebendo a matricula do usuario
					
					Aluno alunoAux = null; // a refenrencia esta iniciando com null
					System.out.println("\n\t--------------------------------------");
					System.out.println("\t  DADOS DO ALUNO COM A MATRICULA " + matricula_desejada);
					System.out.println("\t--------------------------------------\n");
					
					if(a1.buscarAluno(matricula_desejada)) {
						alunoAux = a1; // a referencia do objeto a1 está sendo guardada numa nova referencia chamada alunoAux
					}
					else if(a2.buscarAluno(matricula_desejada)) {
						alunoAux = a2; // a referencia do objeto a2 está sendo guardada numa nova referencia chamada alunoAux
					}
					else if(a3.buscarAluno(matricula_desejada)) {
						alunoAux = a3; // a referencia do objeto a3 está sendo guardada numa nova referencia chamada alunoAux
					}
					if(alunoAux != null) { // caso a referencia alunoAux tenha uma referencia para algum objeto
						System.out.println("\t Nome: " + alunoAux.getNome());
						//System.out.println("\t Matricula: " + alunoAux.getMatricula());
						System.out.println("\t Nota 1: " + alunoAux.getNota1());
						System.out.println("\t Nota 2: " + alunoAux.getNota2());
						System.out.println("\t Nota 3: " + alunoAux.getNota3());
						System.out.println("\t Média: " + alunoAux.getMedia());
						System.out.println("\t Situação: " + alunoAux.getSituacao());
					}
					else 
						System.out.println("\t Matricula não encontrada!");
					
				break;
				case 6: 
					System.out.println("\n\t -------------------------");
					System.out.println("\t     ALTERANDO NOTA");
					System.out.println("\t -------------------------\n");
					System.out.print("\t Digite a matricula do aluno: ");
					matricula_desejada = teclado.nextInt();
					
					if(a1.buscarAluno(matricula_desejada)) {
						do {
							System.out.println("\t Qual nota você deseja alterar: (1 - nota 1, 2 - nota 2, 3 - nota 3)");
							escolhaNota = teclado.nextInt();
						}while((escolhaNota < 1) || (escolhaNota > 3));
						System.out.println("\t Digite a nova nota: ");
						a1.alterarNota(escolhaNota, teclado.nextFloat());
						System.out.println("\n\t NOTA ALTERADA COM SUCESSO!");
					}
					else if(a2.buscarAluno(matricula_desejada)) {
						do {
							System.out.println("\t Qual nota você deseja alterar: (1 - nota 1, 2 - nota 2, 3 - nota 3)");
							escolhaNota = teclado.nextInt();
						}while((escolhaNota < 1) || (escolhaNota > 3));
						System.out.println("\t Digite a nova nota: ");
						a2.alterarNota(escolhaNota, teclado.nextFloat());
						System.out.println("\n\t NOTA ALTERADA COM SUCESSO!");
					}
					else if(a3.buscarAluno(matricula_desejada)) {
						do {
							System.out.println("\t Qual nota você deseja alterar: (1 - nota 1, 2 - nota 2, 3 - nota 3)");
							escolhaNota = teclado.nextInt();
						}while((escolhaNota < 1) || (escolhaNota > 3));
						System.out.println("\t Digite a nova nota: ");
						a3.alterarNota(escolhaNota, teclado.nextFloat());
						System.out.println("\n\t NOTA ALTERADA COM SUCESSO!");
					}
					else {
						System.out.println("\n\t Aluno não localizado!");
					}
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