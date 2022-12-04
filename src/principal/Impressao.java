package principal;

import java.util.List;

import comunidade.Aluno;
import comunidade.Professor;
import recursos.Curso;
import recursos.Disciplina;
import recursos.Laboratorio;

public class Impressao {

	
		public void imprimirCurso(List<Curso> cursos) {

	        
	        for (int i = 0; i < 6; i++) {
	            System.out.println("  " + cursos.get(i).toString());
	        }

		}
		
		public void imprimirDisciplina(List<Disciplina> disciplina) {

	        
	        for (int i = 0; i < 11; i++) {
	            System.out.println("  " + disciplina.get(i).toString());
	        }

		}
		
		public void imprimirLaboratorio(List<Laboratorio> laboratorio) {

	        
	        for (int i = 0; i < 12; i++) {
	            System.out.println("  " + laboratorio.get(i).toString());
	        }

		}
		
		public void imprimirProfessor(List<Professor> professores) {

	        
	        for (int i = 0; i < 10; i++) {
	            System.out.println("  " + professores.get(i).toString());
	        }

		}
		
		
		public void imprimirAlunos(List<Aluno> alunos) {

	        
	        for (int i = 0; i < alunos.size(); i++) {
	            System.out.println("  " + alunos.get(i).toString());
	        }

		
		
	}
		
}