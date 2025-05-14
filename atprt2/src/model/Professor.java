package model;

public class Professor extends Pessoa {
    private String siape;
    private String disciplina;

    public Professor(String nome, int idade, String cpf, String siape, String disciplina) {
        super(nome, idade, cpf);
        this.siape = siape;
        this.disciplina = disciplina;
    }

    public String getSiape() { return siape; }
    public void setSiape(String siape) { this.siape = siape; }

    public String getDisciplina() { return disciplina; }
    public void setDisciplina(String disciplina) { this.disciplina = disciplina; }

    @Override
    public void exibirDados() {
        System.out.println("PROFESSOR: " + toString());
    }

    @Override
    public String toString() {
        return super.toString() + ", SIAPE: " + siape + ", Disciplina: " + disciplina;
    }

    @Override
    public boolean equals(Object o) {
        if (!super.equals(o)) return false;
        if (!(o instanceof Professor)) return false;
        Professor prof = (Professor) o;
        return siape.equals(prof.siape);
    }

    @Override
    public int hashCode() {
        return super.hashCode() + siape.hashCode();
    }
}
