package com.dio.matricula.alunos.Controller;

import com.dio.matricula.alunos.Cliente.Cliente;
import com.dio.matricula.alunos.Exception.ClienteNotFoundException;
import com.dio.matricula.alunos.Repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public List<Cliente> listarTodosClientes() {
        return clienteRepository.findAll();
    }

    public Cliente buscarClientePorCPF(String cpf) {
//        return clienteRepository.findById(cpf).orElse(null);
        return clienteRepository.findById(cpf)
                .orElseThrow(() -> new ClienteNotFoundException("Cliente com CPF " + cpf + " não encontrado"));
    }

    public Cliente adicionarCliente(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    public Cliente atualizarCliente(String cpf, Cliente cliente) {
        if (clienteRepository.existsById(cpf)) {
            cliente.setCpf(cpf); // Garantir que o CPF não seja alterado
            return clienteRepository.save(cliente);
        }
        return null;
    }

    public void deletarCliente(String cpf) {
        clienteRepository.deleteById(cpf);
    }
}

