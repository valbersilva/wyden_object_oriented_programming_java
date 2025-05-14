import model.Aluno;
import model.Professor;
import model.TecnicoAdministrativo;
import model.Pessoa;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        String matricula = "202312345";
        int soma = 2 + 0 + 2 + 3 + 1 + 2 + 3 + 4 + 5;
        int resultado = soma % 3;

        System.out.println("Matrícula: " + matricula);
        System.out.println("Soma dos dígitos: " + soma);
        System.out.println("Resultado módulo 3: " + resultado);

        Set<Pessoa> membros = new HashSet<>();

        Aluno aluno = new Aluno("Carlos Silva", 20, "12345678900", "202312345", "Sistemas de Informação");
        Professor professor = new Professor("Ana Paula", 40, "09876543211", "198726", "Programação Orientada a Objetos");
        TecnicoAdministrativo tecnico = new TecnicoAdministrativo("João Souza", 35, "11122233344", "Tecnologia", "Analista de TI", true);

        // Exibir dados
        aluno.exibirDados();
        professor.exibirDados();
        tecnico.exibirDados();

        // toString, equals, hashCode
        System.out.println(aluno.toString());
        System.out.println(professor.toString());
        System.out.println(tecnico.toString());

        System.out.println("HashCodes:");
        System.out.println(aluno.hashCode());
        System.out.println(professor.hashCode());
        System.out.println(tecnico.hashCode());

        // Adicionando na coleção
        membros.add(aluno);
        membros.add(professor);
        membros.add(tecnico);

        // Exibindo objetos da coleção
        System.out.println("\n--- Membros Cadastrados ---");
        for (Pessoa p : membros) {
            p.exibirDados();
        }
    }
}
