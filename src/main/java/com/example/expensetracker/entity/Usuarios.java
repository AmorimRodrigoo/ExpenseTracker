package com.example.expensetracker.entity;

import jakarta.persistence.*;
import org.hibernate.annotations.JdbcTypeCode;
import org.hibernate.type.SqlTypes;

import java.io.Serializable;
import java.time.LocalDateTime;
import java.util.Objects;

@Entity
public class Usuarios implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_usuario")
    private Long id_usuario;

    @Column(name = "email", unique = true, nullable = false)
    private String email;
    @Column(name = "senha_hash", nullable = false)
    private String senha_hash;
    @Column(name = "data_registro")
    private LocalDateTime data_registro;

    public Usuarios() {}

    public Long getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(Long id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha_hash() {
        return senha_hash;
    }

    public void setSenha_hash(String senha_hash) {
        this.senha_hash = senha_hash;
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
        Usuarios usuarios = (Usuarios) o;
        return Objects.equals(id_usuario, usuarios.id_usuario) && Objects.equals(email, usuarios.email) && Objects.equals(senha_hash, usuarios.senha_hash) && Objects.equals(data_registro, usuarios.data_registro);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id_usuario, email, senha_hash, data_registro);
    }
}
