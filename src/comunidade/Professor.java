package comunidade;

import aplicacoes.Base;
import recursos.Disciplina;

public class Professor extends Base {
	
	 private String nome;
	 private Disciplina disciplina;
 
	public Professor(String nome, Disciplina disciplina) {
		this.nome = nome;
		this.disciplina = disciplina;
	}

	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public Disciplina getDisciplina() {
		return disciplina;
	}


	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}

	public String toString () {
		return getNome() + " => " + getDisciplina();
	}
	
}
