package aplicacoes;

import java.util.List;

import comunidade.Aluno;
import comunidade.Professor;
import recursos.Curso;
import recursos.Disciplina;
import recursos.Laboratorio;

public interface IBase {
	
	List<Laboratorio> laboratorio ();
	List<Aluno> alunos();
	List<Professor> professores();
	List<Curso> cursos();
	List<Disciplina> disciplinas();
	
}
