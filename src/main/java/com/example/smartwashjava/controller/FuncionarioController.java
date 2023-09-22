package com.example.smartwashjava.controller;

import com.example.smartwashjava.model.Proprietario;
import com.example.smartwashjava.repository.FuncionarioRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/funcionarios")
@AllArgsConstructor
public class FuncionarioController {

    private final FuncionarioRepository funcionarioRepository;

    //@RequestMapping(method = RequestMapping.GET)
    @GetMapping
    public @ResponseBody List<Proprietario> list() {
        return funcionarioRepository.findAll();
    }

}
