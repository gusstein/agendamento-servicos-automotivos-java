package com.example.smartwashjava.repository;

import com.example.smartwashjava.model.Cliente;
import com.example.smartwashjava.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
}
