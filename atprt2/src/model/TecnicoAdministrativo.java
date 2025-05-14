package model;

public class TecnicoAdministrativo extends Pessoa {
    private String setor;
    private String cargo;
    private boolean trabalhaRemoto;  // Atributo extra

    public TecnicoAdministrativo(String nome, int idade, String cpf, String setor, String cargo, boolean trabalhaRemoto) {
        super(nome, idade, cpf);
        this.setor = setor;
        this.cargo = cargo;
        this.trabalhaRemoto = trabalhaRemoto;
    }

    public String getSetor() { return setor; }
    public void setSetor(String setor) { this.setor = setor; }

    public String getCargo() { return cargo; }
    public void setCargo(String cargo) { this.cargo = cargo; }

    public boolean isTrabalhaRemoto() { return trabalhaRemoto; }
    public void setTrabalhaRemoto(boolean trabalhaRemoto) { this.trabalhaRemoto = trabalhaRemoto; }

    public String verificarLocalTrabalho() {
        return trabalhaRemoto ? "Trabalha remotamente" : "Trabalha presencialmente";
    }

    @Override
    public void exibirDados() {
        System.out.println("FUNCIONÁRIO TÉCNICO: " + toString());
    }

    @Override
    public String toString() {
        return super.toString() + ", Setor: " + setor + ", Cargo: " + cargo + ", " + verificarLocalTrabalho();
    }

    @Override
    public boolean equals(Object o) {
        if (!super.equals(o)) return false;
        if (!(o instanceof TecnicoAdministrativo)) return false;
        TecnicoAdministrativo func = (TecnicoAdministrativo) o;
        return setor.equals(func.setor) && cargo.equals(func.cargo);
    }

    @Override
    public int hashCode() {
        return super.hashCode() + setor.hashCode() + cargo.hashCode();
    }
}
