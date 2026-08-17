# CRUD Para Estudantes

API REST para cadastro de estudantes desenvolvida com **Spring Boot**, **JPA/Hibernate** e banco de dados **H2** em memória.

## Tecnologias

- Java 21
- Spring Boot 4.1.0
- Spring Data JPA
- H2 Database (in-memory)
- Maven

## Estrutura do Projeto

```
src/main/java/com/fatec/helloworld/
├── controllers/     → Recebe as requisições HTTP
├── services/        → Lógica de negócio
├── repositories/    → Acesso ao banco de dados
└── entities/        → Modelo de dados (Student)
```

## Endpoints

| Método | Rota | Descrição |
|--------|------|-----------|
| GET | `/students` | Lista todos os estudantes |
| GET | `/students/{id}` | Busca estudante por ID |
| POST | `/students` | Cadastra novo estudante |
| PUT | `/students/{id}` | Atualiza dados do estudante |
| DELETE | `/students/{id}` | Remove estudante |

## Campos do Estudante

| Campo | Tipo | Descrição |
|-------|------|-----------|
| id | Long | Identificador automático |
| name | String | Nome completo |
| email | String | E-mail institucional |
| course | String | Curso matriculado |
| semester | Integer | Semestre atual |
| gpa | Double | Média geral (nota) |
| phone | String | Telefone de contato |
| city | String | Cidade |

## Como executar

```bash
./mvnw spring-boot:run
```

A aplicação sobe na porta `8080`.

## H2 Console

Acesse o banco de dados em: `http://localhost:8080/h2-console`

- **JDBC URL:** `jdbc:h2:mem:studentsdb`
- **User:** `sa`
- **Password:** *(vazio)*

## Exemplo de requisição POST

```json
{
  "name": "João Silva",
  "email": "joao@fatec.br",
  "course": "Análise e Desenvolvimento de Sistemas",
  "semester": 2,
  "gpa": 8.5,
  "phone": "(15) 99999-0000",
  "city": "Sorocaba"
}
```
