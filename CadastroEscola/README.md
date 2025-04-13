# Cadastro de Membros da Comunidade Escolar

Este é um pequeno sistema desenvolvido em Java com o objetivo de realizar o cadastro de diferentes tipos de membros de uma comunidade escolar: alunos, professores e técnicos administrativos.

## 🎯 Objetivo

O projeto foi desenvolvido como parte das atividades da disciplina de Programação Orientada a Objetos. O foco principal é demonstrar o uso de herança, encapsulamento e polimorfismo em Java.

## 🛠️ Tecnologias utilizadas

- Java 17 ou superior
- IntelliJ IDEA (opcional, mas recomendado)
- JDK configurado no ambiente

## 📁 Estrutura do Projeto

CadastroEscola/
├── src/
│   ├── Pessoa.java
│   ├── Aluno.java
│   ├── Professor.java
│   ├── TecnicoAdministrativo.java
│   └── Main.java

## 🧑‍🏫 Descrição das classes

- `Pessoa`: classe base com atributos comuns (nome, idade, CPF).
- `Aluno`: herda de Pessoa e possui matrícula, curso e média de notas. Inclui um método para verificar aprovação.
- `Professor`: herda de Pessoa e possui SIAPE e disciplina que leciona.
- `TecnicoAdministrativo`: herda de Pessoa e possui setor de trabalho e cargo.
- `Main`: classe responsável por instanciar os objetos, preencher dados e chamar os métodos de exibição.

## ▶️ Como rodar

1. Abra o projeto no IntelliJ IDEA (ou outro IDE de sua preferência).
2. Certifique-se de que o SDK Java está corretamente configurado.
3. Na pasta `src`, localize a classe `Main.java`.
4. Clique com o botão direito sobre o arquivo e selecione `Run 'Main.main()'`.
5. O terminal exibirá os dados de cada tipo de membro.

## 📌 Observações

- Todos os atributos são privados e acessados por meio de métodos getters e setters.
- O método `exibirDados()` é sobrescrito em cada classe derivada.
- Foi adicionado um método específico na classe `Aluno` chamado `verificarAprovacao()` para indicar se o aluno está aprovado com base em sua média.

---


# Contact Information

```
Desenvolvido para:
UniFBV Wyden <>
Desenvolvido por: Valber Silva <valber.l.p.silva@gmail.com>

README Author: Valber Silva <valber.l.p.silva@gmail.com>
```
