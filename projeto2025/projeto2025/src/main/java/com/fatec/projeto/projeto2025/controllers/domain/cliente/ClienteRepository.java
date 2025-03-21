package com.fatec.projeto.projeto2025.controllers.domain.cliente;
import org.springframework.data.jpa.repository.JpaRepository;

import com.fatec.projeto.projeto2025.Cliente;


public interface ClienteRepository extends JpaRepository<Cliente, Long> {
    
}
