package com.dest1.credito.controller;

import com.dest1.credito.entities.Credito;
import com.dest1.credito.repository.CreditoRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping ("api/credito")
public class CreditoController {

    private final CreditoRepository repository;

    public CreditoController(CreditoRepository repository){
        this.repository = repository;
    }

    @GetMapping
    public List<Credito> mostrar(){
        return repository.findAll();
    }

    @PostMapping
    public void criar(@RequestBody Credito cartao){

        repository.save(cartao);

    }

}
