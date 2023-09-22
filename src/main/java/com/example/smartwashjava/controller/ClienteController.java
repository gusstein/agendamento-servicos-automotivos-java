package com.example.smartwashjava.controller;

import com.example.smartwashjava.model.Cliente;
import com.example.smartwashjava.repository.ClienteRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/clientes")
@AllArgsConstructor
public class ClienteController {

    private final ClienteRepository clienteRepository;

    //@RequestMapping(method = RequestMapping.GET)
    @GetMapping
    public @ResponseBody List<Cliente> list() {
        return clienteRepository.findAll();
    }

}
