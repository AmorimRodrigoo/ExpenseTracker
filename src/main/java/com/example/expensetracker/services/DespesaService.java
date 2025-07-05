package com.example.expensetracker.services;

import com.example.expensetracker.dto.DespesasDTO;
import com.example.expensetracker.entity.Despesas;
import static com.example.expensetracker.mapper.ObjectMapper.parseListObject;
import static com.example.expensetracker.mapper.ObjectMapper.parseObject;
import com.example.expensetracker.repository.DespesasRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DespesaService {

    @Autowired
    DespesasRepository repository;

    public List<DespesasDTO> findAll(Long id_despesa) {
        return parseListObject(repository.findAll(), DespesasDTO.class);
    }

    public DespesasDTO findByDescricao(String descricao){

        var entity =  repository.findByDescricao(descricao);
        return parseObject(entity, DespesasDTO.class);
    }

    public DespesasDTO findById(Long id_despesa){
        var entity =  repository.findById(id_despesa);
        return parseObject(entity, DespesasDTO.class);

    }

    public DespesasDTO crateDespesa(DespesasDTO despesa){
        var entity = parseObject(despesa, Despesas.class);
        return parseObject(repository.save(entity), DespesasDTO.class);
    }

    public DespesasDTO updateDespesa(DespesasDTO despesa){

        Despesas entity = repository.findById(despesa.getId_despesa())
                .orElseThrow(() -> new EntityNotFoundException("No Records Found"));

        entity.setDescricao(despesa.getDescricao());
        entity.setValor(despesa.getValor());
        entity.setData_despesa(despesa.getData_despesa());

        return parseObject(repository.save(entity), DespesasDTO.class);
    }

    public void deleteDespesa(Long id_despesa){

        Despesas entity = repository.findById(id_despesa)
                .orElseThrow(() -> new EntityNotFoundException("No Records Found"));
        repository.delete(entity);
    }
}
