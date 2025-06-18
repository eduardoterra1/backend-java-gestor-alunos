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

## 🚀 Tecnologias Utilizadas
- JAVA 17
- Spring Boot
- Spring DATA JPA
- H2 DATABASE (para testes locais)
- Maven
- Rest Client (arquivo .http para teste rápidos)

## 🛠️ Configurações

### Banco de Dados

- **Testes**: Banco em memória H2

## ▶️ Como Executar

```bash
# Clonar o repositório
git clone https://github.com/seuusuario/backend-java-gestor-alunos.git
cd /pasta/seurepositorio

# Build com Maven
mvn clean install

# Rodar o projeto
mvn spring-boot:run
```

## 🔗 Endpoints

### ➕ Criar Aluno

**POST** `/alunos`

Cria um novo aluno.

#### Requisição (JSON)
```json
{
  "nome": "João da Silva",
  "email": "joao@email.com",
  "cpf": "123.456.789-00"
}
```

Resposta 201 Created
json
```
{
  "id": 1,
  "nome": "João da Silva",
  "email": "joao@email.com",
  "cpf": "123.456.789-00"
}
```

📄 Listar Todos os Alunos
GET /alunos

Retorna uma lista de todos os alunos cadastrados.

Resposta 200 OK
```
[
  {
    "id": 1,
    "nome": "João da Silva",
    "email": "joao@email.com",
    "cpf": "123.456.789-00"
  },
  {
    "id": 2,
    "nome": "Maria Souza",
    "email": "maria@email.com",
    "cpf": "987.654.321-00"
  }
]
```

📘 Listar Matrículas de um Aluno
GET /alunos/{id}/matriculas

Retorna a lista de matrículas de um aluno específico.

Parâmetros de Rota
id (Long): ID do aluno

Resposta 200 OK
```
[
  {
    "id": 101,
    "curso": "Matemática",
    "dataMatricula": "2025-01-10"
  },
  {
    "id": 102,
    "curso": "Física",
    "dataMatricula": "2025-03-05"
  }
]
```

✏️ Atualizar Aluno
PUT /alunos/{id}

Atualiza os dados de um aluno existente.

Parâmetros de Rota
id (Long): ID do aluno
Requisição (JSON)
```
{
  "nome": "João da Silva Júnior",
  "email": "joaojr@email.com",
  "cpf": "123.456.789-00"
}
```
Resposta 200 OK
json
```
{
  "id": 1,
  "nome": "João da Silva Júnior",
  "email": "joaojr@email.com",
  "cpf": "123.456.789-00"
}
```
❌ Remover Aluno
DELETE /alunos/{id}

Remove um aluno do sistema.
```
Parâmetros de Rota
id (Long): ID do aluno

Resposta 204 No Content
Nenhum corpo de resposta.
```


