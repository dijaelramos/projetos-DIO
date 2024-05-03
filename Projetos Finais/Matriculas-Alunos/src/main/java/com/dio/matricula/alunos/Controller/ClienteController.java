package com.dio.matricula.alunos.Controller;

import com.dio.matricula.alunos.Cliente.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {
    @Autowired
    private ClienteService clienteService;

    @GetMapping
    public List<Cliente> listarClientes() {
        return clienteService.listarTodosClientes();
    }

    @GetMapping("/{cpf}")
    public Cliente buscarClientePorCPF(@PathVariable String cpf) {
        return clienteService.buscarClientePorCPF(cpf);
    }

    @PostMapping
    public Cliente adicionarCliente(@RequestBody Cliente cliente) {
        return clienteService.adicionarCliente(cliente);
    }

    @PutMapping("/{cpf}")
    public Cliente atualizarCliente(@PathVariable String cpf, @RequestBody Cliente cliente) {
        return clienteService.atualizarCliente(cpf, cliente);
    }

    @DeleteMapping("/{cpf}")
    public void deletarCliente(@PathVariable String cpf) {
        clienteService.deletarCliente(cpf);
    }
}

