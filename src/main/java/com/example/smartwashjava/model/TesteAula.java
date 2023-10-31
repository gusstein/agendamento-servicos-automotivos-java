package com.example.smartwashjava.model;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.util.Objects;

@Entity
@Table(name = "TESTE_AULA", schema = "PUBLIC", catalog = "TESTDB")
public class TesteAula {
    @Basic
    @Column(name = "ID")
    private int id;
    @Basic
    @Column(name = "TESTE2")
    private Integer teste2;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Integer getTeste2() {
        return teste2;
    }

    public void setTeste2(Integer teste2) {
        this.teste2 = teste2;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TesteAula testeAula = (TesteAula) o;
        return id == testeAula.id && Objects.equals(teste2, testeAula.teste2);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, teste2);
    }
}
