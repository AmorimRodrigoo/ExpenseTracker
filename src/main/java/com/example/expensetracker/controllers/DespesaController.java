package com.example.expensetracker.controllers;

import com.example.expensetracker.dto.DespesasDTO;
import com.example.expensetracker.entity.Despesas;
import com.example.expensetracker.services.DespesaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/expenses")
public class DespesaController {

    @Autowired
    private DespesaService service;

    // Get find all
    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public List<DespesasDTO> findAll() {
        return service.findAll(null);
    }

    @GetMapping(value = "/{id_despesa}", produces = MediaType.APPLICATION_JSON_VALUE)
    public DespesasDTO findById(
            @PathVariable("id_despesa") Long id_despesa) {
        return service.findById(id_despesa);
    }

    @GetMapping(value = "/{descricao}", produces = MediaType.APPLICATION_JSON_VALUE)
    public DespesasDTO findByDescricao(
            @PathVariable("descricao") String descricao){
        return service.findByDescricao(descricao);
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE,
                produces = MediaType.APPLICATION_JSON_VALUE)
    public DespesasDTO createDespesa(@RequestBody DespesasDTO despesas){
        return service.crateDespesa(despesas);
    }

    @PutMapping(consumes = MediaType.APPLICATION_JSON_VALUE,
                produces = MediaType.APPLICATION_JSON_VALUE)
    public DespesasDTO updateDespesa(@RequestBody DespesasDTO despesas){
        return service.updateDespesa(despesas);
    }

    @DeleteMapping(value = "/{id_despesa}")
    public ResponseEntity<?> deleteDespesa(@PathVariable("id_despesa")Long id_despesa){
        service.deleteDespesa(id_despesa);
        return ResponseEntity.noContent().build();
    }

}
