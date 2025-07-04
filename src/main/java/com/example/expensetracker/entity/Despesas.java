package com.example.expensetracker.entity;

import jakarta.persistence.*;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.Objects;

@Entity
public class Despesas implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_despesa")
    private Long id_despesa;

    @Column(name = "id_usuario", unique = true, nullable = false)
    private Long id_usuario;
    @Column(name = "descricao", nullable = false, length = 500)
    private String descricao;
    @Column(name = "valor", nullable = false, precision = 10, scale = 2)
    private Double valor;
    @Column(name = "data_despesa", nullable = false)
    private Date data_despesa;
    @Column(name = "data_registro")
    private LocalDateTime data_registro;

    public Despesas() {}

    public Long getId() {
        return id_despesa;
    }

    public void setId(Long id) {
        this.id_despesa = id;
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

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public Date getData_despesa() {
        return data_despesa;
    }

    public void setData_despesa(Date data_despesa) {
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
        Despesas despesas = (Despesas) o;
        return Objects.equals(id_despesa, despesas.id_despesa) && Objects.equals(id_usuario, despesas.id_usuario) && Objects.equals(descricao, despesas.descricao) && Objects.equals(valor, despesas.valor) && Objects.equals(data_despesa, despesas.data_despesa) && Objects.equals(data_registro, despesas.data_registro);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id_despesa, id_usuario, descricao, valor, data_despesa, data_registro);
    }
}
