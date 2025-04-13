public class Main {
    public static void main(String[] args) {
        Aluno aluno = new Aluno("Lucas Silva", 20, "123.456.789-00", "20231234", "Administração");
        aluno.setMediaNotas(8.5);

        Professor professor = new Professor("Maria Oliveira", 45, "234.567.890-00", "112233", "Gestão de Pessoas");

        TecnicoAdministrativo tecnico = new TecnicoAdministrativo("Carlos Souza", 38, "345.678.901-00", "Secretaria Acadêmica", "Assistente");

        System.out.println("=== Dados do Aluno ===");
        aluno.exibirDados();
        aluno.verificarAprovacao();

        System.out.println("\n=== Dados do Professor ===");
        professor.exibirDados();

        System.out.println("\n=== Dados do Técnico Administrativo ===");
        tecnico.exibirDados();
    }
}
