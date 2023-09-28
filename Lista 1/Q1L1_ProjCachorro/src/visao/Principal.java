package visao;
import aplicacao.Cachorro;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// A) objeto ja inicializado
		Cachorro C1; // declarando uma variavel ponteiro 
		C1 = new Cachorro("cachorro sem nome", "nenhuma raça definida", 0); // instanciando o objeto e referenciando no ponteiro 
		
		//System.out.println("Nome do cachorro: " + C1.getNome());
		//System.out.println("Raça do cachorro: " + C1.getRaca());
		//System.out.println("Idade do cachorro: " + C1.getIdade());
		
		// B)
		System.out.println("INFORMANDO OS ATRIBUTOS USANDO O MÉTODO GET");
		System.out.println("Nome: " + C1.getNome());
		System.out.println("Raça: " + C1.getRaca());
		System.out.println("Idade: " + C1.getIdade());
		
		// C)
		C1.setNome("Bolinha");
		C1.setRaca("Rottweiler");
		C1.setIdade(10);
		/*System.out.println("\nEXIBINDO OS ESTADOS APÓS O MÉTODO SET\n");
		System.out.println("Nome do cão: " + C1.getNome());
		System.out.println("Raça do cão: " + C1.getRaca());
		System.out.println("O cão tem " + C1.getIdade() + " anos.");*/
		
		// D)
		System.out.println("\nUSANDO O MÉTODO INFORMAR ESTADO");
		System.out.println(C1.informarEstado());
		
		// E)
		Cachorro C2 = C1.clonarCachorro(); // clonando o objeto C1
		System.out.println("\nVERIFICANDO A IGUALDADE DOS ESTADOS DO CLONE E DO OBJETO");
		if(C1.equals(C2)) {
			System.out.println("Os estados são iguais");	
		}
		else {
			System.out.println("Os estados não são iguais");
		}
		
		// F)
		System.out.println("\nESTADOS DO CLONE DO CACHORRO C1 (C2)");
		System.out.println(C2.informarEstado());
		
	}

}