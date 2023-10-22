package acad_system;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Aluno {
	
	private int matricula;
    private String nome;
    private Curso curso;
    private List<Disciplina> disciplinasMatriculadas;
    private List<Frequencia> frequencias;
    
    public Aluno(int matricula, String nome, Curso curso) {
        this.matricula = matricula;
        this.nome = nome;
        this.curso = curso;
        this.disciplinasMatriculadas = new ArrayList<>();
        this.frequencias = new ArrayList<>();
    }
    
    public void matricularDisciplina(Disciplina disciplina) {
        disciplinasMatriculadas.add(disciplina);
    }
    
    public void registrarFrequencia(Disciplina disciplina, Professor professor) {
        Frequencia frequencia = new Frequencia(new Date(), professor, disciplina);
        frequencias.add(frequencia);
    }

    
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Curso getCurso() {
		return curso;
	}
	public void setCurso(Curso curso) {
		this.curso = curso;
	}
	public List<Disciplina> getDisciplinasMatriculadas() {
		return disciplinasMatriculadas;
	}
	public void setDisciplinasMatriculadas(List<Disciplina> disciplinasMatriculadas) {
		this.disciplinasMatriculadas = disciplinasMatriculadas;
	}
	public List<Frequencia> getFrequencias() {
		return frequencias;
	}
	public void setFrequencias(List<Frequencia> frequencias) {
		this.frequencias = frequencias;
	}

}
