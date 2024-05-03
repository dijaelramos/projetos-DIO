# Projeto de Matrícula de Alunos

Este é um projeto de exemplo para uma aplicação de matrícula de alunos, desenvolvido usando Spring Boot.

## Visão Geral

Este projeto é uma aplicação de exemplo para gerenciar matrículas de alunos em uma escola ou instituição educacional. Ele fornece endpoints RESTful para realizar operações CRUD (Create, Read, Update, Delete) em uma entidade de Cliente, que representa os alunos matriculados.

## Funcionalidades

- Adicionar um novo cliente (aluno).
- Listar todos os clientes (alunos) cadastrados.
- Buscar um cliente (aluno) pelo CPF.
- Atualizar os dados de um cliente (aluno) existente.
- Excluir um cliente (aluno) pelo CPF.

## Tecnologias Utilizadas

- Java
- Spring Boot
- Spring Data JPA
- H2 Database (ou PostgreSQL, dependendo da configuração)
- Maven (ou Gradle, dependendo da configuração)

## Configuração do Banco de Dados

O projeto está configurado para usar um banco de dados H2 em memória por padrão. No entanto, você pode facilmente modificar a configuração para usar um banco de dados PostgreSQL ou outro banco de dados de sua escolha, alterando as configurações no arquivo `application.properties`.

## Como Executar o Projeto

1. Certifique-se de ter o Java e o Maven instalados na sua máquina.
2. Clone este repositório para o seu ambiente de desenvolvimento.
3. Navegue até o diretório raiz do projeto.
4. Execute o comando `mvn spring-boot:run` para iniciar a aplicação.
5. Acesse os endpoints da API usando uma ferramenta como Postman.

## Endpoints da API

- `GET /clientes`: Lista todos os clientes (alunos) cadastrados.
- `GET /clientes/{cpf}`: Retorna os detalhes de um cliente (aluno) específico pelo CPF.
- `POST /clientes`: Adiciona um novo cliente (aluno).
- `PUT /clientes/{cpf}`: Atualiza os dados de um cliente (aluno) existente pelo CPF.
- `DELETE /clientes/{cpf}`: Exclui um cliente (aluno) pelo CPF.

## Contribuição

Contribuições são bem-vindas! Se você encontrar algum problema ou tiver sugestões de melhorias, sinta-se à vontade para abrir uma issue ou enviar um pull request.

## Licença

Este projeto está licenciado sob a [Licença MIT](LICENSE).
