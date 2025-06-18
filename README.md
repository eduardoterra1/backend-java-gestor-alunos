# Desafio técnico - Java Spring Boot 

- Este desafio foi desenvolvido como um estudo de caso com objetivo de aprimorar as habilidades e conhecimento tecnico na linguagem Java. Utilizando o framework Spring.

## Informações sobre o projeto
Criar uma API com funcionalidade CRUD para fazer a gestão de cadastro de Alunos e vincula-los a uma matricula de um curso. 

## Entidades

### Entity Aluno (1 ---> *)
| Variavel  | Tipo  | 
| ------------- |:-------------:|
| ID      | Long PK    |
| nome      | String     |
| dataNascimento      | LocalDate     |
| telefone      | String     |

### Entity Matricula (* ---> 1)
| Variavel | Tipo | 
| ------------- |:-------------:|
| ID      | Long PK    |
| nomeCurso     | String     |
| dataInicio      | LocalDate     |
| aluno_id      | Long FK     |

### Entity BaseEntity (Classe de herança)
| Left columns  | Right columns | 
| ------------- |:-------------:|
| dataInclusao      | LocalDateTime     |
| dataAtualizacao      | LocalDateTime   |

## Funcionalidades da API. 
- Cadastrar um aluno junto de sua matrícula
- Listar todos os alunos cadastrados
- Listar todas as matrºiccula de um aluno a partir de seu ID
- Atualizar os dados cadastrais de um aluno (e suas matrículas)
- Remover um aluno (e suas matrículas)

### Tecnologias que foram utilizadas neste projeto
- JAVA 17
- Spring Boot
- Spring DATA JPA
- H2 DATABASE (para testes locais)
- Maven
- Rest Client (arquivo .http para teste rápidos)
