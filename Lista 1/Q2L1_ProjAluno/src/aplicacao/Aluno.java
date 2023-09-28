package aplicacao;

public class Aluno {
	private String nome;
	private int matricula;
	private float nota1;
	private float nota2;
	private float nota3;
	private float media;
	private String situacao;
	
	public Aluno() {
		//situacao = "Não definida";
	}
	
	public void setNome(String novoNome) {
		nome = novoNome;
	}
	
	public void setMatricula(int novaMat) {
		matricula = novaMat;
	}
	
	public void setNotas(float n1, float n2, float n3) {
		nota1 = n1;
		nota2 = n2;
		nota3 = n3;
		calcularMedia(); // ja atualizando as medias assim que o usuario digitar as 3 notas
	}
	
	public void calcularMedia() {
		media = (nota1*4 + nota2*5 + nota3*6)/(4+5+6);
		//atualizarSituacao(); // poderia usar esse metodo da propria classe (criada no final) para melhor implementar os ifs
		if(this.media < 3) 
			this.situacao = "Reprovado";
		else if(media >= 7) 
			this.situacao = "Aprovado";
		else 
			this.situacao = "Recuperação";
	}
	
	public boolean buscarAluno(int matricula) {
		return (this.matricula == matricula); // o resultado da comparação será true ou false
	}
	
	public String getNome() {
		return nome;
	}
	
	public float getNota1() {
		return nota1;
	}
	
	public float getNota2() {
		return nota2;
	}
	
	public float getNota3() {
		return nota3;
	}
	
	public float getMedia() {
		return media;
	}
	
	public String getSituacao() {
		return situacao;
	}
	
	public int getMatricula() { // coloquei o metodo apenas para teste, depois retirar!
		return matricula;
	}
	
	public String alterarNota(int codNota, float valorNota) {
		switch(codNota) {
			case 1: 
				nota1 = valorNota;
			break;
			case 2:
				nota2 = valorNota;
			break;
			case 3: 
				nota3 = valorNota;
			break;
		}
		calcularMedia(); // recalculando a media com nota alterada
		return situacao; // retornando a situação atualizada do aluno
	}
	
	/*private void atualizarSituacao() { // metodo privado fora da classe
		if(this.media < 3) 
			this.situacao = "Reprovado";
		else if(media >= 7) 
			this.situacao = "Aprovado";
		else 
			this.situacao = "Recuperação";
	}*/
	
}