package aplicacao;

public class Cachorro {

	private String nome;
	private String raca;
	private int idade;
	
	
	public Cachorro(String name, String raca, int age) {
		nome = name;
		this.raca = raca;
		idade = age;
	}
	
	public String informarEstado() {
		return "Nome: " + nome + "\nRaça: " + raca + "\nIdade: " + idade;
	}
	public Cachorro clonarCachorro() {
		Cachorro clone_C1 = new Cachorro(nome, raca, idade);
		return clone_C1;
	}

	public String getNome() {
		return nome;
	}
	public String getRaca() {
		return raca;
	}
	public int getIdade() {
		return idade;
	}
	public void setNome(String name) {
		nome = name;
	}
	public void setRaca(String raca) {
		this.raca = raca;
	}
	public void setIdade(int age) {
		idade = age;
	}
	
}