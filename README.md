# DSClient - Sistema de Gerenciamento de Clientes

Este é um projeto de uma API REST desenvolvida com Java e Spring Boot para o gerenciamento de clientes, permitindo operações completas de CRUD (Create, Read, Update e Delete) com persistência de dados.

## 🚀 Tecnologias Utilizadas
* **Java 21**
* **Spring Boot 4.0.2**
* **Spring Data JPA**
* **Bean Validation**
* **H2 Database** (Banco em memória)
* **Maven**

## 🏗️ Estrutura de Camadas
A aplicação segue o padrão de arquitetura em camadas para garantir a separação de responsabilidades:
1. **Controladores (Web/REST)**: `ClientController` gerencia os endpoints e a comunicação com o cliente.
2. **Serviços (Negócio)**: `ClientService` contém as regras de negócio e integrações.
3. **Acesso a Dados (Repository)**: `ClientRepository` realiza a comunicação com o banco de dados via JPA.
4. **Entidades/DTOs**: Representação dos dados e transferência de objetos (`Client` e `ClientDTO`).

## 🛠️ API Endpoints

| Método | Endpoint | Descrição |
| :--- | :--- | :--- |
| **GET** | `/clients` | Retorna todos os clientes de forma paginada |
| **GET** | `/clients/{id}` | Retorna um cliente por seu ID |
| **POST** | `/clients` | Cria um novo cliente |
| **PUT** | `/clients/{id}` | Atualiza os dados de um cliente existente |
| **DELETE** | `/clients/{id}` | Remove um cliente do sistema |

## ✅ Validações
O sistema utiliza anotações do Bean Validation no `ClientDTO` para garantir dados consistentes:
* **Nome**: Não pode ser vazio (`@NotBlank`).
* **Data de Nascimento**: Não pode ser uma data futura (`@PastOrPresent`).

## ⚠️ Tratamento de Exceções
A API possui um tratamento global de erros através da classe `ControllerExceptionHandler`:
* **404 Not Found**: Lançado quando um recurso solicitado não existe.
* **422 Unprocessable Entity**: Retornado em erros de validação, listando o campo e a mensagem de erro específica.

## ⚙️ Como Executar
1. Clone este repositório.
2. Certifique-se de ter o JDK 21 instalado.
3. Execute a aplicação via terminal:
   ```bash
   # Windows
   ./mvnw.cmd spring-boot:run
   
   # Linux/Mac
   ./mvnw spring-boot:run
4. O console do banco de dados H2 pode ser acessado em http://localhost:8080/h2-console (URL JDBC: jdbc:h2:mem:testdb).
