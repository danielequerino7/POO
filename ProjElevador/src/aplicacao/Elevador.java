package aplicacao;

public class Elevador {
	private int andar_atual;
	private int total_andares;
	private int capacidade;
	private int pessoas_presente;
	
	
	public Elevador(int cap, int t_andares) {
		capacidade = cap;
		total_andares = t_andares;
		andar_atual = 0;
		pessoas_presente = 0;
	}
	
	public boolean entra() {
		if(pessoas_presente < capacidade) {
			pessoas_presente++;
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean sai() {
		if(pessoas_presente > 0) {
			pessoas_presente--;
			return true;
		}
		else {
			return false;
		}
	}
	
	public boolean sobe() {
		if(andar_atual < (total_andares - 1)) {
			andar_atual++;
			return true;
		}
		else {
			return false;
		}
	}
	public boolean desce() {
		if(andar_atual > 0) {
			andar_atual--;
			return true;
		}
		else {
			return false;
		}
	}
	
	
}

	