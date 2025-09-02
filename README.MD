# SpringBootCRUD

CRUD (Create, Read, Update, Delete) desenvolvido em **Java com Spring Boot**, utilizando **Spring Web**, **Spring Data JPA** e **H2 Database**. Este projeto é ideal para quem quer estudar desenvolvimento backend, criação de APIs REST e persistência de dados em memória.

## 🚀 Funcionalidades

- **Criar** novos registros  
- **Listar** todos os registros  
- **Atualizar** registros existentes  
- **Deletar** registros  
- Teste de endpoints via **Postman**  
- Banco de dados em memória **H2** para fácil teste e desenvolvimento

## 🛠 Tecnologias Utilizadas

- Java 17  
- Spring Boot  
- Spring Web  
- Spring Data JPA  
- H2 Database  
- Maven  

## 📦 Como Rodar o Projeto


git clone https://github.com/SEU-USUARIO/SpringBootCRUD.git
Entre na pasta do projeto:


cd SpringBootCRUD
Execute a aplicação usando Maven:


mvn spring-boot:run
Acesse o banco H2 pelo console:


http://localhost:8080/h2-console
JDBC URL: jdbc:h2:mem:testdb

Username: sa

Password: password

Teste os endpoints via Postman:

GET /entidade – Listar todos os registros

POST /entidade – Criar novo registro

PUT /entidade/{id} – Atualizar registro

DELETE /entidade/{id} – Deletar registro

Substitua entidade pelo nome do recurso que você criou (ex: users, produtos, etc).

📖 Estrutura do Projeto

src/
 └─ main/
     ├─ java/com/exemplo/
     │   ├─ controller/  # Controllers REST
     │   ├─ entity/      # Classes de modelo
     │   └─ repository/  # Interfaces de acesso a dados
     └─ resources/
         └─ application.properties  # Configurações da aplicação
💡 Observações
Banco de dados H2 é em memória, ou seja, todos os dados são perdidos ao reiniciar a aplicação.

Ideal para estudos e testes de CRUD com Spring Boot.