package aplicacoes;

import comunidade.Professor;
import recursos.Laboratorio;

public interface IReserva {
	
	Solicitação solicitacaoReserva(Professor p, Laboratorio I, String d, String h);
	Professor identificacaoProfessor();
	Laboratorio identificacaoLaboratorio();
	String identificacaoData();
	String identificacaoHora();
	
}
