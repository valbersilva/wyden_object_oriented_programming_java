# Cadastro de Membros da Comunidade Escolar

Este projeto consiste em um sistema simples de cadastro de membros da comunidade escolar, desenvolvido em Java, seguindo os princípios da Programação Orientada a Objetos.

## Tecnologias Utilizadas

* Java 17+
* IntelliJ IDEA (IDE recomendada)
* Estrutura de diretórios padrão do Java (`src/`, `model/`)

## Instruções de Instalação e Execução

1. Clone o repositório ou copie os arquivos para sua máquina local.
2. Abra o projeto no IntelliJ IDEA.
3. Certifique-se de que o JDK está configurado corretamente no projeto.
4. Execute o arquivo `Main.java` como aplicação Java.

## Estrutura Organizacional do Projeto

```
src/
├── Main.java
├── model/
│   ├── Pessoa.java
│   ├── Aluno.java
│   ├── Professor.java
│   └── TecnicoAdministrativo.java
```

* `Pessoa.java`: Classe abstrata base com atributos comuns (nome, idade, CPF) e métodos sobrescritos `toString`, `equals`, `hashCode`.
* `Aluno.java`, `Professor.java`, `TecnicoAdministrativo.java`: Classes derivadas com atributos específicos e método sobrescrito `exibirDados()`.
* `Main.java`: Responsável pela execução do programa, criação de objetos e uso da coleção determinada.

## Critério de Armazenamento

* A matrícula usada foi `202312345`.
* Soma dos dígitos: `2+0+2+3+1+2+3+4+5 = 22`
* `22 % 3 = 1` → A estrutura de dados utilizada foi `Set<Pessoa>`.

## Funcionalidades Implementadas

* Encapsulamento total dos atributos.
* Sobrescrita de métodos `toString()`, `equals()`, `hashCode()`.
* Criação de três tipos de membros: Aluno, Professor, Técnico-Administrativo.
* Inclusão de atributo e método extra na classe `TecnicoAdministrativo`:

    * `trabalhaRemoto: boolean`
    * `verificarLocalTrabalho()`: retorna se o funcionário atua de forma remota ou presencial.
* Armazenamento dos objetos em uma coleção `Set` para evitar duplicatas.
* Impressão detalhada dos dados de cada membro via `exibirDados()` e validação da coleção.

## Exemplos de Uso

Ao executar o programa:

* O cálculo do tipo de coleção será exibido.
* Três objetos (um de cada tipo) serão criados.
* Dados serão exibidos usando os métodos implementados.
* Os objetos serão adicionados a uma `Set` e listados.

## Informações Adicionais

* O projeto foi organizado para facilitar a leitura, reuso de código e expansão futura (ex: novos tipos de membros).
* Ideal para projetos acadêmicos que exploram herança, encapsulamento, sobrescrita e uso de coleções.

---

Desenvolvido como parte da disciplina de Programação Orientada a Objetos.

Aluno: \[Seu Nome Aqui]
Matrícula: 202312345
