package com.example.smartwashjava.controller;

import com.example.smartwashjava.holder.UsuarioHolder;
import com.example.smartwashjava.model.Usuario;
import com.example.smartwashjava.repository.UsuarioRepository;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/usuarios")
@AllArgsConstructor
public class UsuarioController {

    private final UsuarioRepository usuarioRepository;

    //@RequestMapping(method = RequestMapping.GET)
    @GetMapping
    public @ResponseBody List<Usuario> list() {
        return usuarioRepository.findAll();
    }

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public Usuario create(@RequestBody Usuario usuario) {
        return usuarioRepository.save(usuario);
    }

    @PostMapping("/login")
    @ResponseStatus(code = HttpStatus.OK)
    public Usuario login(@RequestBody Usuario usuario) {
        List<Usuario> usuarios = list();

        for (Usuario u : usuarios) {
            if (u.getEmail().equals(usuario.getEmail()) && u.getSenha().equals(usuario.getSenha())) {
                return u;
            }
        }
        return new Usuario();
    }

    @PostMapping("/registrar")
    @ResponseStatus(code = HttpStatus.OK)
    public String criarUsuario(@RequestBody Usuario usuario) {
        List<Usuario> usuarios = list();
        boolean usuarioJaExiste = false;
        if(!usuarios.isEmpty()){
            for (Usuario u : usuarios) {
                if (u.getEmail().equals(usuario.getEmail())) {
                    usuarioJaExiste = true;
                    break;
                }
            }
        }

        if(usuarioJaExiste) {
            return "Usuario já existe";
        } else {
            usuarioRepository.save(usuario);
            return "Usuario registrado";
        }
    }
}
