package com.dio.concessionaria.concessionariaapi.volkswagen;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.awt.print.Pageable;
import java.util.Optional;

@RestController
@RequestMapping("/volkswagen")
public class VolkswagenResourse {

    @Autowired                            //Desse jeito ou criando o construtor dele
    private VolkswagenRepositorio repository;

    //Lá no Postman (localhost:8080/fiat?page=0&size=10&sort=name,asc) como exemplo
    @GetMapping
    public Page<Volkswagen> volkswagen(Pageable page) {                          //Mudar de Lista para formato de página
        return repository
                .findAll((org.springframework.data.domain.Pageable) page);     //caso não funcione, deixar só (page)
    }
    //Buscar por id
    @GetMapping("/{id}")
    public ResponseEntity getOne(@PathVariable Long id) {
        Optional<Volkswagen> optional = repository.findById(id);
        if (optional.isPresent()){
            return ResponseEntity.ok().body(optional.get());
        }else {
            return ResponseEntity.notFound().build();
        }
    }
}
