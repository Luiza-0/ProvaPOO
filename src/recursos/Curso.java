package recursos;

public class Curso {
	
	private String sigla;
	private String descricao;
	private int capacidade;
	
	public Curso(String sigla, String descricao, int capacidade) {
		super();
		this.sigla = sigla;
		this.descricao = descricao;
		this.capacidade = capacidade;
	}
	public String getSigla() {
		return sigla;
	}
	public void setSigla(String sigla) {
		this.sigla = sigla;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public int getCapacidade() {
		return capacidade;
	}
	public void setCapacidade(int capacidade) {
		this.capacidade = capacidade;
	}
	
	public String toString ()	{
		return "(" + getSigla() + ")" + getDescricao() + " =>" + getCapacidade() + " alunos"; 
	
	}
}

