# estudo-jpa

Projeto de estudos focado em **JPA/Hibernate**, com o objetivo de praticar:

- mapeamento de entidades
- relacionamentos entre tabelas
- persistência com `EntityManager`
- consultas com **JPQL**
- integração com **MySQL**

## Objetivo

Este repositório foi criado para consolidar conceitos práticos de JPA em Java, usando um exemplo simples de domínio com:

- `JohreiCenter`
- `Pessoa`

A ideia é exercitar desde o mapeamento das entidades até a execução de consultas utilizando relacionamentos.

## Tecnologias utilizadas

- Java
- JPA
- Hibernate
- Maven
- MySQL

## Estrutura do projeto

```text
src/main/java/br/com/alura/johreicenter
 ├── modelo
 │    ├── JohreiCenter.java
 │    └── Pessoa.java
 └── testes
      ├── TesteRelacionamentoJohreiPessoa.java
      └── ConsultaPorJohrei.java

src/main/resources/META-INF
 └── persistence.xml