package model;

public class Aluno extends Pessoa {
    private String matricula;
    private String curso;

    public Aluno(String nome, int idade, String cpf, String matricula, String curso) {
        super(nome, idade, cpf);
        this.matricula = matricula;
        this.curso = curso;
    }

    public String getMatricula() { return matricula; }
    public void setMatricula(String matricula) { this.matricula = matricula; }

    public String getCurso() { return curso; }
    public void setCurso(String curso) { this.curso = curso; }

    @Override
    public void exibirDados() {
        System.out.println("ALUNO: " + toString());
    }

    @Override
    public String toString() {
        return super.toString() + ", Matrícula: " + matricula + ", Curso: " + curso;
    }

    @Override
    public boolean equals(Object o) {
        if (!super.equals(o)) return false;
        if (!(o instanceof Aluno)) return false;
        Aluno aluno = (Aluno) o;
        return matricula.equals(aluno.matricula);
    }

    @Override
    public int hashCode() {
        return super.hashCode() + matricula.hashCode();
    }
}
