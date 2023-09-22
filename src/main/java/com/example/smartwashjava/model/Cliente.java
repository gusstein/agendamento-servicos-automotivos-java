package com.example.smartwashjava.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;
import java.util.List;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
public class Cliente extends Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String telefone;
    private Date dataNasc;
    @OneToMany
    private List<Veiculo> veiculos;
    private String idade;
    private String rg;
    private String estadoCivil;

    public Cliente() {
    }
}
