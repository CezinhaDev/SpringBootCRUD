CRUD com Spring Boot

Este projeto é um estudo de CRUD (Create, Read, Update, Delete) utilizando Spring Boot, Spring Web, Spring Data JPA e H2 Database. O objetivo é praticar o desenvolvimento de APIs RESTful com persistência em banco de dados em memória.

Tecnologias Utilizadas

Java 17

Spring Boot

Spring Web

Spring Data JPA

H2 Database (banco de dados em memória)

Maven (gerenciamento de dependências)

Postman (testes de API)

Estrutura do Projeto
src/main/java/com/crud/demo
├── controllers
│   └── UserControllers.java  # Endpoints da API
├── entity
│   └── User.java             # Entidade do usuário
├── repository
│   ├── UserRepository.java   # Interface para operações no banco
│   └── UserRequest.java      # DTO para requisições de atualização
└── DemoApplication.java      # Classe principal do Spring Boot
src/main/resources
├── application.properties    # Configurações do Spring Boot e H2

Funcionalidades

A API permite as seguintes operações sobre usuários:

Método HTTP	Endpoint	Descrição
POST	/users	Criar um novo usuário
GET	/users	Listar todos os usuários
GET	/users/{id}	Buscar usuário por ID
PUT	/users/{id}	Atualizar usuário por ID
DELETE	/users/{id}	Deletar usuário por ID
Configuração do H2 Database

O projeto utiliza o H2 Database em memória. As configurações estão no arquivo application.properties:

spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.username=sa
spring.datasource.password=password
spring.h2.console.enabled=true
spring.jpa.hibernate.ddl-auto=update


Para acessar o console H2, abra:

http://localhost:8080/h2-console


JDBC URL: jdbc:h2:mem:testdb

Username: sa

Password: password

Como Rodar o Projeto

Clone o repositório:

git clone <seu-repositorio-url>


Entre na pasta do projeto:

cd demo


Execute o projeto usando Maven:

./mvnw spring-boot:run


Acesse a API em:

http://localhost:8080/users


Teste os endpoints utilizando Postman.

Exemplo de Requisição com Postman

Criar usuário (POST)

URL: http://localhost:8080/users

Body (JSON):

{
  "name": "César Henrique",
  "email": "cesar@email.com"
}


Atualizar usuário (PUT)

URL: http://localhost:8080/users/{id}

Body (JSON):

{
  "name": "César H.",
  "email": "cesar.h@email.com"
}


Deletar usuário (DELETE)

URL: http://localhost:8080/users/{id}

Observações

O projeto utiliza UUID como identificador de usuários.

Banco de dados H2 é em memória, ou seja, os dados serão perdidos ao reiniciar a aplicação.

Ótimo para aprendizado e testes de CRUD sem necessidade de banco externo.