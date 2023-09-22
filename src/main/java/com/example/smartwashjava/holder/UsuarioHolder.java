package com.example.smartwashjava.holder;

import com.example.smartwashjava.model.Usuario;

public class UsuarioHolder {
    private Long id;
    private String nome;
    private String cpf;
    private String email;
    private String senha;
    private Boolean empresa;

    public UsuarioHolder(Usuario usuario) {
        this.id = usuario.getId();
        this.empresa = usuario.getEmpresa();
        this.nome = usuario.getNome();
        this.email = usuario.getEmail();
    }

}
