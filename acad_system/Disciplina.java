package acad_system;

import java.util.List;

public class Disciplina {
	
	private String nome;
    private List<Professor> professores;
    private boolean ofertada;

    public Disciplina(String nome, List<Professor> professores) {
        this.nome = nome;
        this.professores = professores;
        this.ofertada = false;
    }

    public void ofertar() {
        this.ofertada = true;
    }

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Professor> getProfessores() {
		return professores;
	}

	public void setProfessores(List<Professor> professores) {
		this.professores = professores;
	}

	public boolean isOfertada() {
		return ofertada;
	}

	public void setOfertada(boolean ofertada) {
		this.ofertada = ofertada;
	}

}
