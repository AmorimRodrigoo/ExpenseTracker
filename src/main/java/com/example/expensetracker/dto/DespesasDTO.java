package com.example.expensetracker.dto;


import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Objects;

public class DespesasDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long id_despesa;

    private Long id_usuario;
    private String descricao;
    private BigDecimal valor;
    private LocalDate data_despesa;
    private LocalDateTime data_registro;

    public DespesasDTO() {}

    public Long getId_despesa() {
        return id_despesa;
    }

    public void setId_despesa(Long id_despesa) {
        this.id_despesa = id_despesa;
    }

    public Long getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(Long id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public LocalDate getData_despesa() {
        return data_despesa;
    }

    public void setData_despesa(LocalDate data_despesa) {
        this.data_despesa = data_despesa;
    }

    public LocalDateTime getData_registro() {
        return data_registro;
    }

    public void setData_registro(LocalDateTime data_registro) {
        this.data_registro = data_registro;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        DespesasDTO that = (DespesasDTO) o;
        return Objects.equals(id_despesa, that.id_despesa) && Objects.equals(id_usuario, that.id_usuario) && Objects.equals(descricao, that.descricao) && Objects.equals(valor, that.valor) && Objects.equals(data_despesa, that.data_despesa) && Objects.equals(data_registro, that.data_registro);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id_despesa, id_usuario, descricao, valor, data_despesa, data_registro);
    }
}
