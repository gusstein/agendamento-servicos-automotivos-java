package com.example.smartwashjava.model;

import java.util.Date;
import java.util.List;

public abstract class AgendamentoTemplate {

    // Método de template que coordena o agendamento
    public final Agendamento agendar(List<Veiculo> veiculos, List<Servico> servicos, List<Proprietario> funcionarios, Long preco, Date dataEntrada, Date dataSaida) {
        Agendamento agendamento = criarAgendamento();
        definirVeiculos(agendamento, veiculos);
        definirServicos(agendamento, servicos);
        definirFuncionarios(agendamento, funcionarios);
        definirPreco(agendamento, preco);
        definirDataEntrada(agendamento, dataEntrada);
        definirDataSaida(agendamento, dataSaida);
        return agendamento;
    }

    protected abstract Agendamento criarAgendamento();
    protected abstract void definirVeiculos(Agendamento agendamento, List<Veiculo> veiculos);
    protected abstract void definirServicos(Agendamento agendamento, List<Servico> servicos);
    protected abstract void definirFuncionarios(Agendamento agendamento, List<Proprietario> funcionarios);
    protected abstract void definirPreco(Agendamento agendamento, Long preco);
    protected abstract void definirDataEntrada(Agendamento agendamento, Date dataEntrada);
    protected abstract void definirDataSaida(Agendamento agendamento, Date dataSaida);
}


