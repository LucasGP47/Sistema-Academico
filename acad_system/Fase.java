package acad_system;

import java.util.List;

public class Fase {

	private int numero;
    private List<Disciplina> disciplinas;	
	
	public Fase(int numero, List<Disciplina> disciplinas) {
        this.numero = numero;
        this.disciplinas = disciplinas;
    }

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}

	public void setDisciplinas(List<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}
	
	
	
	
}
