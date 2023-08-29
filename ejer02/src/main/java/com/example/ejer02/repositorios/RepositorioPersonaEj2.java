package com.example.ejer02.repositorios;

import com.example.ejer02.entidades.PersonaEj2;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositorioPersonaEj2 extends JpaRepository<PersonaEj2, Long> {
}
