package aplicacoes;

import comunidade.Professor;
import recursos.Laboratorio;

public class Solicitação {
	
	private Professor professor;
	private Laboratorio laboratorio;
	private String data;
	private String hora;
	
	
	public Solicitação(Professor professor, Laboratorio laboratorio, String data, String hora) {
		super();
		this.professor = professor;
		this.laboratorio = laboratorio;
		this.data = data;
		this.hora = hora;
	}
	
	
	public Professor getProfessor() {
		return professor;
	}


	public void setProfessor(Professor professor) {
		this.professor = professor;
	}


	public Laboratorio getLaboratorio() {
		return laboratorio;
	}


	public void setLaboratorio(Laboratorio laboratorio) {
		this.laboratorio = laboratorio;
	}


	public String getData() {
		return data;
	}


	public void setData(String data) {
		this.data = data;
	}


	public String getHora() {
		return hora;
	}


	public void setHora(String hora) {
		this.hora = hora;
	}
	
}
