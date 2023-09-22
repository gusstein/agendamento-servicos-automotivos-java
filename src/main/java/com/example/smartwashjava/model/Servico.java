package com.example.smartwashjava.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class Servico {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @JsonProperty("_id")
    private Long id;
    @Column
    private String nome;
    @Column
    private Long preco;
    @Column
    private String descricao;
    @Column
    private String duracao;
    @Column
    private Long avaliacao;

    public Servico() {
    }

}

