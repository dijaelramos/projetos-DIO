package com.dio.matricula.alunos.Controller;

import com.dio.matricula.alunos.Cliente.Cliente;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/clientes")
public class ClienteController {
    @Autowired
    private final ClienteService clienteService;
    @Autowired
    public ClienteController(ClienteService clienteService) {
        this.clienteService = clienteService;
    }
    @PostMapping
    public ResponseEntity<Cliente> adicionarCliente(@RequestBody Cliente cliente) {
        Cliente novoCliente = clienteService.adicionarCliente(cliente);
        return new ResponseEntity<>(novoCliente, HttpStatus.CREATED);
    }
    @GetMapping
    public ResponseEntity<List<Cliente>> listarTodosClientes() {
        List<Cliente> clientes = clienteService.listarTodosClientes();
        return new ResponseEntity<>(clientes, HttpStatus.OK);
    }
    @GetMapping("/{cpf}")
    public ResponseEntity<Cliente> buscarClientePorCPF(@PathVariable String cpf) {
        Cliente cliente = clienteService.buscarClientePorCPF(cpf);
        return new ResponseEntity<>(cliente, HttpStatus.OK);
    }
    @PutMapping("/{cpf}")
    public ResponseEntity<Cliente> atualizarCliente(@PathVariable String cpf, @RequestBody Cliente clienteAtualizado) {
        Cliente cliente = clienteService.atualizarCliente(cpf, clienteAtualizado);
        return new ResponseEntity<>(cliente, HttpStatus.OK);
    }
    @DeleteMapping("/{cpf}")
    public ResponseEntity<Void> deletarCliente(@PathVariable String cpf) {
        clienteService.deletarCliente(cpf);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}