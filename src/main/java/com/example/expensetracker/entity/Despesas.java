package com.example.expensetracker.entity;

import jakarta.persistence.*;
import org.hibernate.proxy.HibernateProxy;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
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
    private BigDecimal valor;
    @Column(name = "data_despesa", nullable = false)
    private LocalDate data_despesa;
    @Column(name = "data_registro")
    private LocalDateTime data_registro;

    public Despesas() {
    }

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
    public final boolean equals(Object o) {
        if (this == o) return true;
        if (o == null) return false;
        Class<?> oEffectiveClass = o instanceof HibernateProxy ? ((HibernateProxy) o).getHibernateLazyInitializer().getPersistentClass() : o.getClass();
        Class<?> thisEffectiveClass = this instanceof HibernateProxy ? ((HibernateProxy) this).getHibernateLazyInitializer().getPersistentClass() : this.getClass();
        if (thisEffectiveClass != oEffectiveClass) return false;
        Despesas despesas = (Despesas) o;
        return id_despesa != null && Objects.equals(id_despesa, despesas.id_despesa);
    }

    @Override
    public final int hashCode() {
        return this instanceof HibernateProxy ? ((HibernateProxy) this).getHibernateLazyInitializer().getPersistentClass().hashCode() : getClass().hashCode();
    }
}


