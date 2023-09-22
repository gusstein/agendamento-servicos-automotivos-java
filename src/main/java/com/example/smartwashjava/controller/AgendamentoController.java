package com.example.smartwashjava.controller;

import com.example.smartwashjava.model.Agendamento;
import com.example.smartwashjava.repository.AgendamentoRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/agendamentos")
@AllArgsConstructor
public class AgendamentoController {

    private final AgendamentoRepository agendamentoRepository;

    @GetMapping
    public List<Agendamento> list() {
        return agendamentoRepository.findAll();
    }

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public Agendamento create(@RequestBody Agendamento agendamento) {
        return agendamentoRepository.save(agendamento);
    }
}
