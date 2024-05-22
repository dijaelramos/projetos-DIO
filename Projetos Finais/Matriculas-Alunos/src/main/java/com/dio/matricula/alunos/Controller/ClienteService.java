package com.dio.matricula.alunos.Controller;

import com.dio.matricula.alunos.Cliente.Cliente;
import com.dio.matricula.alunos.Exception.ClienteJaExistenteException;
import com.dio.matricula.alunos.Exception.ClienteNotFoundException;
import com.dio.matricula.alunos.Repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ClienteService {

    @Autowired
    private final ClienteRepository clienteRepository;

    public ClienteService(ClienteRepository clienteRepository) {
        this.clienteRepository = clienteRepository;
    }

    public List<Cliente> listarTodosClientes() {
        return clienteRepository.findAll();
    }

    public Cliente buscarClientePorCPF(String cpf) {
        return clienteRepository.findById(cpf)
                .orElseThrow(() -> new ClienteNotFoundException("Cliente com CPF " + cpf + " não encontrado"));
    }

    public Cliente adicionarCliente(Cliente cliente) {
        if (clienteRepository.existsById(cliente.getCpf())) {
            throw new ClienteJaExistenteException("Já existe uma matrícula com o CPF " + cliente.getCpf());
        }
        return clienteRepository.save(cliente);
    }

    public Cliente atualizarCliente(String cpf, Cliente clienteAtualizado) {
        Cliente clienteExistente = clienteRepository.findById(cpf)
                .orElseThrow(() -> new ClienteNotFoundException("Cliente com CPF " + cpf + " não encontrado"));

        clienteExistente.setNomeCompleto(clienteAtualizado.getNomeCompleto());
        clienteExistente.setEndereco(clienteAtualizado.getEndereco());
        clienteExistente.setTelefone(clienteAtualizado.getTelefone());
        clienteExistente.setDataNascimento(clienteAtualizado.getDataNascimento());
        clienteExistente.setDataPagamento(clienteAtualizado.getDataPagamento());

        return clienteRepository.save(clienteExistente);
    }

    public void deletarCliente(String cpf) {
        if (!clienteRepository.existsById(cpf)) {
            throw new ClienteNotFoundException("Cliente com CPF " + cpf + " não encontrado");
        }
        clienteRepository.deleteById(cpf);
    }
}

