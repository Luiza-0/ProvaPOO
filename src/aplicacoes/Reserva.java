package aplicacoes;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import comunidade.Professor;
import recursos.Laboratorio;

public class Reserva implements IReserva {

	
	@Override
	public Solicitação solicitacaoReserva(Professor p, Laboratorio I, String d, String h) {
		
		System.out.println("Reserva efetuada:");
		System.out.println("Professor: " + identificacaoProfessor().getNome());
		System.out.println("Disciplina: " + identificacaoProfessor().getDisciplina());
		System.out.println("Laboratório: " + identificacaoLaboratorio().getIdentificacao());
		System.out.println("Quantidade de máquinas: " + identificacaoLaboratorio().getCapacidade());
		
		return null;	
	}

	
	@Override
	public Professor identificacaoProfessor() {
		
		Scanner sc = new Scanner(System.in);
		Base base = new Base();
        List<Professor> professores = base.professores();

        System.out.print("Professor, informe o nome: ");
        String professor = sc.next();
        for (int i = 0; i < professores.size(); i++) {

            if(professor.equals(professores.get(i).getNome())) {
                return professores.get(i);
            }
        }
		return null;
	}
	
	@Override
	public Laboratorio identificacaoLaboratorio() {
		Scanner sc = new Scanner(System.in);
		Base base = new Base();
        List<Laboratorio> laboratorios = base.laboratorio();

        System.out.print("Professor, informe qual laboratorio deseja reservar: ");
        String laboratorio = sc.next();
        for (int i = 0; i < laboratorios.size(); i++) {

            if(laboratorio.equals(laboratorios.get(i).getIdentificacao())) {
                return laboratorios.get(i);
            }
        }
		return null;
	}
	
	@Override
	public String identificacaoData() {
		Calendar c = Calendar.getInstance();
		Date data = c.getTime();
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
        System.out.printf("Professor, informe para qual dia deseja reservar: " +sdf.format(data)); 
        
		return null;
	}

	@Override
	public String identificacaoHora() {
		Scanner sc = new Scanner(System.in);
		
		List<String> horarios = new ArrayList<>();
		
		horarios.add("07:00");
		horarios.add("08:25");
		horarios.add("09:50");
		horarios.add("11:15");
		horarios.add("14:00");
		horarios.add("15:25");
		horarios.add("16:50");
		horarios.add("19:00");
		horarios.add("20:25");
		
		
		System.out.print("Horários Possiveis: ");
		for(String x : horarios) {
			System.out.printf(x + " ");
		}
		
        System.out.print("Professor, informe para qual horário deseja reservar o laboratorio: ");
        String horario = sc.nextLine();
        for (int i = 0; i < horarios.size(); i++) {

            if(horario.equals(horarios.get(i))) {
                return horarios.get(i);
            }
        }
        
        sc.close();
		return null;
	}
	
	
}
