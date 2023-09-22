package com.example.smartwashjava.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;
import java.util.List;

@Data
@Entity
public class Agendamento extends AgendamentoTemplate {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @JsonProperty("_id")
    private Long id;
    @ManyToMany
    private List<Veiculo> veiculos;
    @ManyToMany
    private List<Servico> servicos;
    @ManyToMany
    private List<Proprietario> funcionarios;
    private Long preco;
    private Date dataEntrada;
    private Date dataSaida;

    private static Agendamento instancia;

    public Agendamento() {
        super();
    }

    // garante que uma classe tenha apenas uma instância e fornece um ponto de acesso global para essa instância
    public static Agendamento getInstance() {
        if (instancia == null) {
            instancia = new Agendamento();
        }
        return instancia;
    }

    @Override
    protected Agendamento criarAgendamento() {
        return new Agendamento();
    }

    @Override
    protected void definirVeiculos(Agendamento agendamento, List<Veiculo> veiculos) {
        agendamento.setVeiculos(veiculos);
    }

    @Override
    protected void definirServicos(Agendamento agendamento, List<Servico> servicos) {
        agendamento.setServicos(servicos);
    }

    @Override
    protected void definirFuncionarios(Agendamento agendamento, List<Proprietario> funcionarios) {
        agendamento.setFuncionarios(funcionarios);
    }

    @Override
    protected void definirPreco(Agendamento agendamento, Long preco) {
        agendamento.setPreco(preco);
    }

    @Override
    protected void definirDataEntrada(Agendamento agendamento, Date dataEntrada) {
        agendamento.setDataEntrada(dataEntrada);
    }

    @Override
    protected void definirDataSaida(Agendamento agendamento, Date dataSaida) {
        agendamento.setDataSaida(dataSaida);
    }

}