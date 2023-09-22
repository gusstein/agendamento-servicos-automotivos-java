package com.example.smartwashjava.controller;

import com.example.smartwashjava.model.Servico;
import com.example.smartwashjava.repository.ServicoRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/servicos")
@AllArgsConstructor
public class ServicoController {

    private final ServicoRepository servicoRepository;

    //@RequestMapping(method = RequestMapping.GET)
    @GetMapping
    public @ResponseBody List<Servico> list() {
        return servicoRepository.findAll();
    }

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public Servico create(@RequestBody Servico servico) {
        return servicoRepository.save(servico);
    }


}
