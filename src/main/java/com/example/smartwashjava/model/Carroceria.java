package com.example.smartwashjava.model;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;

import java.util.Objects;

@Entity
public class Carroceria {
    @Basic
    @Column(name = "ID")
    private int id;
    @Basic
    @Column(name = "TIPO")
    private Object tipo;
    @Basic
    @Column(name = "TAMANHO_Y")
    private Integer tamanhoY;
    @Basic
    @Column(name = "TAMANHO_X")
    private Integer tamanhoX;
    @Basic
    @Column(name = "TAMANHO_L")
    private Integer tamanhoL;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Object getTipo() {
        return tipo;
    }

    public void setTipo(Object tipo) {
        this.tipo = tipo;
    }

    public Integer getTamanhoY() {
        return tamanhoY;
    }

    public void setTamanhoY(Integer tamanhoY) {
        this.tamanhoY = tamanhoY;
    }

    public Integer getTamanhoX() {
        return tamanhoX;
    }

    public void setTamanhoX(Integer tamanhoX) {
        this.tamanhoX = tamanhoX;
    }

    public Integer getTamanhoL() {
        return tamanhoL;
    }

    public void setTamanhoL(Integer tamanhoL) {
        this.tamanhoL = tamanhoL;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Carroceria that = (Carroceria) o;
        return id == that.id && Objects.equals(tipo, that.tipo) && Objects.equals(tamanhoY, that.tamanhoY) && Objects.equals(tamanhoX, that.tamanhoX) && Objects.equals(tamanhoL, that.tamanhoL);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, tipo, tamanhoY, tamanhoX, tamanhoL);
    }
}
