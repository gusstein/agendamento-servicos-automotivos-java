package com.example.smartwashjava.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
public class Proprietario extends Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String turno;
    private String telefone;
    private Date dataNascimento;
    private Date tempoEmpresa;
    private Long faltasDia;
    private Long folga;

    public Proprietario() {
    }
}
