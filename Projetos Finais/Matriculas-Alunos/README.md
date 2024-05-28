
# Projeto de API para Inserção de Alunos

Este projeto é uma API RESTful desenvolvida em Java usando Spring Boot para gerenciar a matrícula de alunos em um curso profissionalizante. A API permite criar, ler, atualizar e deletar informações dos alunos no banco de dados MySQL.

## Ferramentas Utilizadas

### 1. Spring Boot
- **Descrição:** Framework Java que simplifica o desenvolvimento de aplicações standalone e web.
- **Função no Projeto:** Estrutura principal do projeto, fornecendo suporte para RESTful APIs, integração com banco de dados, e muito mais.
- **Documentação:** [Spring Boot Documentation](https://spring.io/projects/spring-boot)

### 2. Spring Data JPA
- **Descrição:** Abstração de persistência que facilita o uso de bancos de dados relacionais.
- **Função no Projeto:** Gerenciamento das operações de banco de dados como criação, leitura, atualização e deleção de registros.
- **Documentação:** [Spring Data JPA Documentation](https://spring.io/projects/spring-data-jpa)

### 3. Hibernate
- **Descrição:** Framework ORM (Object-Relational Mapping) que facilita a comunicação entre aplicações Java e bancos de dados relacionais.
- **Função no Projeto:** Mapeamento das entidades Java para as tabelas do banco de dados.
- **Documentação:** [Hibernate Documentation](https://hibernate.org/orm/documentation/)

### 4. MySQL
- **Descrição:** Sistema de gerenciamento de banco de dados relacional.
- **Função no Projeto:** Armazenamento dos dados dos alunos.
- **Documentação:** [MySQL Documentation](https://dev.mysql.com/doc/)

### 5. MySQL Workbench
- **Descrição:** Ferramenta visual para administração de bancos de dados MySQL.
- **Função no Projeto:** Gerenciamento e visualização dos dados no banco de dados MySQL.
- **Documentação:** [MySQL Workbench Documentation](https://dev.mysql.com/doc/workbench/en/)

### 6. Postman
- **Descrição:** Plataforma para desenvolvimento de APIs que facilita o teste de endpoints.
- **Função no Projeto:** Testes de integração para os endpoints da API.
- **Documentação:** [Postman Documentation](https://learning.postman.com/docs/getting-started/introduction/)

## Configuração do Projeto

### Dependências do Maven

```xml
<dependencies>
    <!-- Dependência do Spring Boot Starter Web -->
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-web</artifactId>
    </dependency>
    <!-- Dependência do Spring Boot Starter Data JPA -->
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-data-jpa</artifactId>
    </dependency>
    <!-- Dependência do MySQL -->
    <dependency>
        <groupId>mysql</groupId>
        <artifactId>mysql-connector-java</artifactId>
        <scope>runtime</scope>
    </dependency>
    <!-- Dependência do Spring Boot Starter Test -->
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-test</artifactId>
        <scope>test</scope>
    </dependency>
    <!-- Dependência do Spring Boot Starter Validation -->
    <dependency>
        <groupId>org.springframework.boot</groupId>
        <artifactId>spring-boot-starter-validation</artifactId>
    </dependency>
</dependencies>
```

### Configuração do Banco de Dados MySQL

Adicione as seguintes configurações no arquivo `application.properties`:

```properties
spring.datasource.url=jdbc:mysql://localhost:3306/matricula_db
spring.datasource.username=seu_usuario
spring.datasource.password=sua_senha
spring.jpa.hibernate.ddl-auto=update
spring.jpa.show-sql=true
spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.MySQL8Dialect
```

### Executando o Projeto

1. **Clonar o Repositório:**
   ```bash
   git clone https://github.com/dijaelramos/projetos-DIO.git
   cd seu-repositorio
   ```

2. **Executar a Aplicação:**
   ```bash
   mvn spring-boot:run
   ```

### Testando a API com Postman

1. **Endpoint para Criar um Novo Cliente (POST):**
    - **URL:** `http://localhost:8080/clientes`
    - **Método:** POST
    - **Body (JSON):**
      ```json
      {
          "cpf": "12345678901",
          "nomeCompleto": "Fulano de Tal",
          "endereco": "Rua Exemplo, 123",
          "telefone": 123456789,
          "dataNascimento": "1990-05-15",
          "dataPagamento": "2024-05-01"
      }
      ```

2. **Endpoint para Listar Todos os Clientes (GET):**
    - **URL:** `http://localhost:8080/clientes`
    - **Método:** GET

3. **Endpoint para Atualizar um Cliente (PUT):**
    - **URL:** `http://localhost:8080/clientes/{cpf}`
    - **Método:** PUT
    - **Body (JSON):**
      ```json
      {
          "nomeCompleto": "Fulano de Tal Atualizado",
          "endereco": "Rua Atualizada, 456",
          "telefone": 987654321,
          "dataNascimento": "1990-06-15",
          "dataPagamento": "2024-06-01"
      }
      ```

4. **Endpoint para Deletar um Cliente (DELETE):**
    - **URL:** `http://localhost:8080/clientes/{cpf}`
    - **Método:** DELETE

### Executando Comandos SQL no MySQL Workbench

1. **Inserir um Novo Cliente:**
   ```sql
   USE matricula_db;

   INSERT INTO cliente (cpf, nome_completo, endereco, telefone, data_nascimento, data_pagamento)
   VALUES ('12345678901', 'Fulano de Tal', 'Rua Exemplo, 123', 123456789, '1990-05-15', '2024-05-01');
   ```

2. **Atualizar os Dados de um Cliente:**
   ```sql
   USE matricula_db;

   UPDATE cliente
   SET nome_completo = 'Fulano de Tal Atualizado', 
       endereco = 'Rua Atualizada, 456', 
       telefone = 987654321, 
       data_nascimento = '1990-06-15', 
       data_pagamento = '2024-06-01'
   WHERE cpf = '12345678901';
   ```

3. **Deletar um Cliente:**
   ```sql
   USE matricula_db;

   DELETE FROM cliente
   WHERE cpf = '12345678901';
   ```

4. **Visualizar Todos os Clientes:**
   ```sql
   USE matricula_db;

   SELECT * FROM cliente;
   ```

## Contribuição

1. Faça um fork do repositório.
2. Crie uma branch para sua feature (`git checkout -b feature/nova-feature`).
3. Commit suas mudanças (`git commit -am 'Adiciona nova feature'`).
4. Faça um push para a branch (`git push origin feature/nova-feature`).
5. Crie um novo Pull Request.

## Licença

Este projeto está licenciado sob a Licença MIT - veja o arquivo LICENSE para mais detalhes.

---