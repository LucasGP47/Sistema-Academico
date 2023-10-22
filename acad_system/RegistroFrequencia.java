package acad_system;

public class RegistroFrequencia {
	
	private Aluno aluno;
    private Frequencia frequencia;
    private Double percentual;

    public RegistroFrequencia(Aluno aluno, Frequencia frequencia, double percentual) {
        this.aluno = aluno;
        this.frequencia = frequencia;
        this.percentual = percentual;
    }

	public Aluno getAluno() {
		return aluno;
	}

	public void setAluno(Aluno aluno) {
		this.aluno = aluno;
	}

	public Frequencia getFrequencia() {
		return frequencia;
	}

	public void setFrequencia(Frequencia frequencia) {
		this.frequencia = frequencia;
	}

	public Double getPercentual() {
		return percentual;
	}

	public void setPercentual(Double percentual) {
		this.percentual = percentual;
	}
    
    

}
