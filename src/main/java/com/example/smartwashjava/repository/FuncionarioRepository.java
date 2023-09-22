package com.example.smartwashjava.repository;

import com.example.smartwashjava.model.Proprietario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FuncionarioRepository extends JpaRepository<Proprietario, Long> {
}
