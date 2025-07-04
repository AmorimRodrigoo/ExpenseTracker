package com.example.expensetracker.repository;

import com.example.expensetracker.dto.DespesasDTO;
import com.example.expensetracker.entity.Despesas;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DespesasRepository extends JpaRepository<Despesas, Long> {
    DespesasDTO findByDescricao(String descricao);
}
