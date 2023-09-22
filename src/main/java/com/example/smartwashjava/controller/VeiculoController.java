package com.example.smartwashjava.controller;

import com.example.smartwashjava.model.Veiculo;
import com.example.smartwashjava.repository.VeiculoRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/veiculos")
@AllArgsConstructor
public class VeiculoController {

    private final VeiculoRepository veiculoRepository;

    //@RequestMapping(method = RequestMapping.GET)
    @GetMapping
    public @ResponseBody List<Veiculo> list() {
        return veiculoRepository.findAll();
    }

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public Veiculo create(@RequestBody Veiculo veiculo) {
        return veiculoRepository.save(veiculo);
    }

}
