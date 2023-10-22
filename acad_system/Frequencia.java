package acad_system;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

public class Frequencia {
	
	private Date data;
    private Professor professor;
    private Disciplina disciplina;
    private List<RegistroFrequencia> registros;

    public List<RegistroFrequencia> getRegistros() {
		return registros;
	}

	public void setRegistros(List<RegistroFrequencia> registros) {
		this.registros = registros;
	}

	public Frequencia(Date data, Professor professor, Disciplina disciplina) {
        this.data = data;
        this.professor = professor;
        this.disciplina = disciplina;
        this.registros = new ArrayList<>();
    }
    
    public void adicionarRegistroFrequencia(Aluno aluno) {
    	Random random = new Random();
        RegistroFrequencia registro = new RegistroFrequencia(aluno, this, random.nextDouble() * 100.0);
        registros.add(registro);
    }

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Professor getProfessor() {
		return professor;
	}

	public void setProfessor(Professor professor) {
		this.professor = professor;
	}

	public Disciplina getDisciplina() {
		return disciplina;
	}

	public void setDisciplina(Disciplina disciplina) {
		this.disciplina = disciplina;
	}
    
    

}
