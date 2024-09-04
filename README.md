# Projeto Web Services com Spring Boot e JPA/Hibernate

Este repositório contém um projeto de exemplo utilizando **Spring Boot** com **JPA/Hibernate** para criar uma aplicação web que realiza operações básicas de CRUD (Create, Read, Update, Delete). O projeto também inclui configuração de um banco de dados de teste em memória (H2) e tratamento de exceções.

## Objetivos

- Criar um projeto Spring Boot com Java.
- Implementar um modelo de domínio.
- Estruturar as camadas lógicas: `resource`, `service`, `repository`.
- Configurar um banco de dados de teste (H2).
- Povoar o banco de dados com dados iniciais.
- Implementar operações CRUD.
- Implementar tratamento de exceções.

## Tecnologias Utilizadas

- **Spring Boot**: Framework para o desenvolvimento.
- **JPA/Hibernate**: Mapeamento objeto-relacional para acesso a dados.
- **H2**: Banco de dados relacional em memória para testes.
- **Maven**: Ferramenta de gerenciamento de dependências.

## Estrutura do Projeto

### 1. Configuração do Projeto

O projeto utiliza Maven para gerenciar dependências e configurações. O arquivo principal de configuração é `pom.xml`.

### 2. Camadas Lógicas

- **`resource`**: Contém os controladores REST que expõem os endpoints da API.
- **`service`**: Contém a lógica de negócios e as regras de manipulação dos dados.
- **`repository`**: Contém as interfaces que estendem `JpaRepository` para operações de acesso a dados.

### 3. Modelo de Domínio
![image](https://github.com/user-attachments/assets/eb77a71f-b21b-4048-8acd-62c7b4d181e8)

Modelo de domínio com todas as entidades definidas.

### 4. Configuração do Banco de Dados

O banco de dados H2 foi configurado no arquivo `application.properties`.

```properties
# DATASOURCE
spring.datasource.driverClassName=org.h2.Driver
spring.datasource.url=jdbc:h2:mem:testdb
spring.datasource.username=sa
spring.datasource.password=
# H2 CLIENT
spring.h2.console.enabled=true
spring.h2.console.path=/h2-console
# JPA, SQL
spring.jpa.database-platform=org.hibernate.dialect.H2Dialect
spring.jpa.defer-datasource-initialization=true
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.format_sql=true
````
### 5. Tratamento de Exceções

**ResourceNotFoundException:** Para casos em que recursos solicitados pelo cliente não sejam encontrados no servidor;
**DatabaseException:** Uma exceção genérica para tratar problemas no banco de dados. 

## Referências

Projeto desenvolvido no curso de Java do professor Nelio Alves - @devsuperior


