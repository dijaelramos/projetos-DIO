package com.dio.matricula.alunos;

import com.dio.matricula.alunos.Cliente.Cliente;
import com.dio.matricula.alunos.Controller.ClienteService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import java.time.LocalDate;

@SpringBootApplication
    public class TesteLocal {
        public static void main(String[] args) {
            // Iniciar o aplicativo Spring Boot
            ConfigurableApplicationContext context = SpringApplication.run(TesteLocal.class, args);

            // Obter uma instância do serviço
            ClienteService clienteService = context.getBean(ClienteService.class);

            // Adicionar alguns clientes de exemplo
            Cliente cliente1 = new Cliente();
            cliente1.setCpf("12345678901");
            cliente1.setNomeCompleto("Fulano de Tal");
            cliente1.setEndereco("Rua Exemplo, 123");
            cliente1.setTelefone(123456789);
            cliente1.setDataNascimento(LocalDate.of(1990, 5, 15));
            cliente1.setDataPagamento(LocalDate.of(2024, 5, 1));
            clienteService.adicionarCliente(cliente1);

            Cliente cliente2 = new Cliente();
            cliente2.setCpf("98765432109");
            cliente2.setNomeCompleto("Beltrano Silva");
            cliente2.setEndereco("Avenida Teste, 456");
            cliente2.setTelefone(987654321);
            cliente2.setDataNascimento(LocalDate.of(1985, 10, 20));
            cliente2.setDataPagamento(LocalDate.of(2024, 4, 25));
            clienteService.adicionarCliente(cliente2);

            // Listar todos os clientes após a adição
            System.out.println("Todos os clientes:");
            clienteService.listarTodosClientes().forEach(System.out::println);

            // Buscar um cliente pelo CPF
            System.out.println("\nBuscar cliente pelo CPF 12345678901:");
            System.out.println(clienteService.buscarClientePorCPF("12345678901"));

            // Atualizar os dados de um cliente
            Cliente clienteAtualizado = new Cliente();
            clienteAtualizado.setNomeCompleto("Fulano de Tal da Silva");
            clienteAtualizado.setEndereco("Rua Nova, 456");
            clienteService.atualizarCliente("12345678901", clienteAtualizado);

            // Listar todos os clientes após a atualização
            System.out.println("\nTodos os clientes após a atualização:");
            clienteService.listarTodosClientes().forEach(System.out::println);

            // Deletar um cliente pelo CPF
            clienteService.deletarCliente("98765432109");

            // Listar todos os clientes após a exclusão
            System.out.println("\nTodos os clientes após a exclusão:");
            clienteService.listarTodosClientes().forEach(System.out::println);
        }

    }
