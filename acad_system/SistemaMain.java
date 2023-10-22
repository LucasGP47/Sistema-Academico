package acad_system;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SistemaMain {

	public static void main(String[] args) {
		
		Professor prof1 = new Professor("Cleber");
        Professor prof2 = new Professor("Matias");
        Professor prof3 = new Professor("Ronaldo");
        Professor prof4 = new Professor("Carlos");

        // Criação de disciplinas
        Disciplina disciplina1 = new Disciplina("Pesquisa em Computação", List.of(prof1, prof2));
        Disciplina disciplina2 = new Disciplina("Banco de dados", List.of(prof3, prof2));
        Disciplina disciplina3 = new Disciplina("Estrutura de Dados", List.of(prof4, prof3));
        Disciplina disciplina4 = new Disciplina("Programação Orientada", List.of(prof1, prof4));
        disciplina1.ofertar();
        disciplina2.ofertar();

        // Criação de fases
        Fase fase1 = new Fase(1, List.of(disciplina1));
        Fase fase2 = new Fase(2, List.of(disciplina2));

        // Criação de cursos
        List<Curso> cursos = new ArrayList<>();
        Curso curso1 = new Curso("Ciencia da Computação", List.of(fase1, fase2));
        Curso curso2 = new Curso("Sistemas", List.of(fase1, fase2));
        
        cursos.add(curso1);
        cursos.add(curso2);

        // Criação de alunos
        List<Aluno> alunos = new ArrayList<>();       
        Aluno aluno1 = new Aluno(1, "Lucas", cursos.get(0));
        Aluno aluno2 = new Aluno(2, "Bob", cursos.get(1));
        Aluno aluno3 = new Aluno(3, "Gerson", cursos.get(0));
        Aluno aluno4 = new Aluno(4, "Elias", cursos.get(1));
        
        alunos.add(aluno1);
        alunos.add(aluno2);
        alunos.add(aluno3);
        alunos.add(aluno4);
        
        // Matricular alunos em disciplinas
        aluno1.matricularDisciplina(disciplina1);
        aluno1.matricularDisciplina(disciplina4);
        aluno2.matricularDisciplina(disciplina2);
        aluno2.matricularDisciplina(disciplina3);
        aluno3.matricularDisciplina(disciplina2);
        aluno3.matricularDisciplina(disciplina4);
        aluno4.matricularDisciplina(disciplina1);
        aluno4.matricularDisciplina(disciplina3);

        // Registro de frequências
        aluno1.registrarFrequencia(disciplina1, prof1);
        aluno2.registrarFrequencia(disciplina2, prof2);
        aluno3.registrarFrequencia(disciplina2, prof1);
        aluno4.registrarFrequencia(disciplina2, prof2);
        
        Frequencia frequencia1 = new Frequencia(new Date(), prof1, disciplina1);
        
        frequencia1.adicionarRegistroFrequencia(aluno1);
        frequencia1.adicionarRegistroFrequencia(aluno2);
        frequencia1.adicionarRegistroFrequencia(aluno3);
        frequencia1.adicionarRegistroFrequencia(aluno4);

        // Exibe as informações
        
        for (Aluno aluno : alunos) {
            System.out.println("Aluno: " + aluno.getNome());
            System.out.println("Matriculado no curso: " + aluno.getCurso().getNome());
            System.out.println("Disciplinas matriculadas:");

           
            for (Disciplina disciplina : aluno.getDisciplinasMatriculadas()) {
                System.out.println("- " + disciplina.getNome());
            }

            System.out.println("----------");
        }
        
        List<RegistroFrequencia> registrosFrequencia1 = frequencia1.getRegistros();
        for (RegistroFrequencia registro : registrosFrequencia1) {
            System.out.println("Registro de frequência para aluno: " + registro.getAluno().getNome() + ". Frequencia: " + registro.getPercentual().intValue() + "%.");
        }

	}

}
