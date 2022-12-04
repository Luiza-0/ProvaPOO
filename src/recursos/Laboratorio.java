package recursos;

public class Laboratorio {
	
	private String identificacao;
	private Integer capacidade;
	
	public Laboratorio(Integer capacidade, String identificacao) {
		super();
		this.capacidade = capacidade;
		this.identificacao = identificacao;
	}
	public Integer getCapacidade() {
		return capacidade;
	}
	public void setCapacidade(Integer capacidade) {
		this.capacidade = capacidade;
	}
	public String getIdentificacao() {
		return identificacao;
	}
	public void setIdentificacao(String identificacao) {
		this.identificacao = identificacao;
	}
	
	public String toString() {
		return getIdentificacao() + " => " + getCapacidade() + " maquinas";
	}

	

}