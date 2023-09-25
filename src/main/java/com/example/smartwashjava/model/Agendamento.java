package com.example.smartwashjava.model;

import com.example.smartwashjava.exception.ExceptionNull;
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
        if (!veiculos.isEmpty()) {
            agendamento.setVeiculos(veiculos);
        } else {
            throw new ExceptionNull("A lista de veículos não pode ser nula.");
        }
    }

    @Override
    protected void definirServicos(Agendamento agendamento, List<Servico> servicos) {
        if (!servicos.isEmpty()) {
            agendamento.setServicos(servicos);
        } else {
            throw new ExceptionNull("A lista de serviços não pode ser nula.");
        }
    }

    @Override
    protected void definirFuncionarios(Agendamento agendamento, List<Proprietario> funcionarios) {
        if (!funcionarios.isEmpty()) {
            agendamento.setFuncionarios(funcionarios);
        } else {
            throw new ExceptionNull("A lista de funcionários não pode ser nula.");
        }
    }

    @Override
    protected void definirPreco(Agendamento agendamento, Long preco) {
        if (preco != null) {
            agendamento.setPreco(preco);
        } else {
            throw new ExceptionNull("O preço não pode ser nulo.");
        }
    }

    @Override
    protected void definirDataEntrada(Agendamento agendamento, Date dataEntrada) {
        if (dataEntrada != null) {
            agendamento.setDataEntrada(dataEntrada);
        } else {
            throw new ExceptionNull("A data de entrada não pode ser nula.");
        }
    }

    @Override
    protected void definirDataSaida(Agendamento agendamento, Date dataSaida) {
        if (dataSaida != null) {
            agendamento.setDataSaida(dataSaida);
        } else {
            throw new ExceptionNull("A data de saída não pode ser nula.");
        }
    }

}
