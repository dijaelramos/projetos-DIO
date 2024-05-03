package com.dio.matricula.alunos.Repository;

import com.dio.matricula.alunos.Cliente.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, String> {
}
