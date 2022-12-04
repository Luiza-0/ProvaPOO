package aplicacoes;

import comunidade.Professor;
import recursos.Laboratorio;

public interface IReserva {
	
	Solicita��o solicitacaoReserva(Professor p, Laboratorio I, String d, String h);
	Professor identificacaoProfessor();
	Laboratorio identificacaoLaboratorio();
	String identificacaoData();
	String identificacaoHora();
	
}
