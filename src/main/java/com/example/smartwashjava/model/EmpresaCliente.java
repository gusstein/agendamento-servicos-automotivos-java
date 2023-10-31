package com.example.smartwashjava.model;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

import java.util.Objects;

@Entity
@Table(name = "EMPRESA_CLIENTE", schema = "PUBLIC", catalog = "TESTDB")
public class EmpresaCliente {
    @Basic
    @Column(name = "ID")
    private Integer id;
    @Basic
    @Column(name = "CNPJ")
    private Integer cnpj;
    @Basic
    @Column(name = "DESCRICAO")
    private Object descricao;
    @Basic
    @Column(name = "SETOR")
    private Object setor;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCnpj() {
        return cnpj;
    }

    public void setCnpj(Integer cnpj) {
        this.cnpj = cnpj;
    }

    public Object getDescricao() {
        return descricao;
    }

    public void setDescricao(Object descricao) {
        this.descricao = descricao;
    }

    public Object getSetor() {
        return setor;
    }

    public void setSetor(Object setor) {
        this.setor = setor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        EmpresaCliente that = (EmpresaCliente) o;
        return Objects.equals(id, that.id) && Objects.equals(cnpj, that.cnpj) && Objects.equals(descricao, that.descricao) && Objects.equals(setor, that.setor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, cnpj, descricao, setor);
    }
}
