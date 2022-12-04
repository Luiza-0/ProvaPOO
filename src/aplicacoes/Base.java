package aplicacoes;

import java.util.ArrayList;
import java.util.List;

import comunidade.Aluno;
import comunidade.Professor;
import recursos.Curso;
import recursos.Disciplina;
import recursos.Laboratorio;

public class Base implements IBase  {
		
	
	@Override
	public List<Laboratorio> laboratorio () {
		
		
		List<Laboratorio> laboratorios = new ArrayList<>(12);
		
			for (int i = 1; i <=12; i++) {
				
				if(i<=4) {
				laboratorios.add(new Laboratorio(20, "LAB " + i));
					}else if(i>4 && i<12) {
						laboratorios.add(new Laboratorio(15, "LAB " + i ));
							}else if (i==12){
							laboratorios.add(new Laboratorio(30, "LAB " + i));
						}
			}
			
			for(Laboratorio x : laboratorios) {
				System.out.println(x);
			}
			
		return laboratorios;
	}

	@Override
	public List<Aluno> alunos () {
		
		
		List<Aluno> alunos = new ArrayList<>(500);
			
		for (int i = 1; i <= 500; i++) {
		
			alunos.add(new Aluno(2022200 + i , "Aluno00" + i));
			
		}
		
		for(Aluno x : alunos) {
			System.out.println(x);
		}
			
		return alunos;
	}

	@Override
	public List<Professor> professores () {
		

		List<Professor> professores = new ArrayList<>(10);
		
		List<Disciplina> d = new ArrayList<>();
		disciplinas();
		
		professores.add(new Professor("Professor01", d.get(0)));
		professores.add(new Professor("Professor01", d.get(1)));
		professores.add(new Professor("Professor02", d.get(2)));
		professores.add(new Professor("Professor03", d.get(3)));
		professores.add(new Professor("Professor04", d.get(4)));
		professores.add(new Professor("Professor05", d.get(5)));
		professores.add(new Professor("Professor06", d.get(6)));
		professores.add(new Professor("Professor07", d.get(7)));
		professores.add(new Professor("Professor08", d.get(8)));
		professores.add(new Professor("Professor09", d.get(9)));
		professores.add(new Professor("Professor10", d.get(10)));
		
		for(Professor x : professores) {
			System.out.println(x);
		}
			
		return professores;
	}

	@Override
	public List<Curso> cursos () {
		
		List<Curso> cursos = new ArrayList<>(6);
			
		cursos.add(new Curso("BES", "BACHARELADO EM ENGENHARIA DE SOFTWARE", 200));
		cursos.add(new Curso("ADS", "ANÁLISE E DESENVOLVIMENTO DE SISTEMAS", 120));
		cursos.add(new Curso("JGD", "JOGOS DIGITAIS", 90));
		cursos.add(new Curso("GTI", "GOVERNANÇA DE TECNOLOGIA DA INFORMAÇÃO", 40));
		cursos.add(new Curso("INF", "INFORMÁTICA", 20));
		cursos.add(new Curso("RDC", "REDE DE COMPUTADORES", 30));
		
		for(Curso x : cursos) {
			System.out.println(x);
		}
			
		return cursos;
	}

	@Override
	public List<Disciplina> disciplinas() {
		
		List<Disciplina> disciplinas = new ArrayList<>(10);
			
		disciplinas.add(new Disciplina("BES005", "LÓGICA DE PROGRAMAÇÃO"));
		disciplinas.add(new Disciplina("BES006", "ESTRUTURA DE DADOS"));
		disciplinas.add(new Disciplina("BES008", "PROGRAMAÇÃO ORIENTADA A OBJETOS"));
		disciplinas.add(new Disciplina("BES011", "BANCOS DE DADOS"));
		disciplinas.add(new Disciplina("BES012", "ENGENHARIA DE REQUISITOS"));
		disciplinas.add(new Disciplina("BES020", "PROGRAMAÇÃO PARA DISPOSITIVOS MÓVEIS"));
		disciplinas.add(new Disciplina("BES026", "SISTEMAS DISTRIBUIDOS"));
		disciplinas.add(new Disciplina("BES038", "INTELIGÊNCIA ARTIFICIAL"));
		disciplinas.add(new Disciplina("BES0049", "PROGRAMAÇÃO WEB"));
		disciplinas.add(new Disciplina("BES048", "PROGRAMAÇÃO FRONT-END"));
		
		for(Disciplina x : disciplinas) {
			System.out.println(x);
		}
			
		return disciplinas;
	}	
	//AJEITAR DISCIPLINA E PROFESSOR
}
