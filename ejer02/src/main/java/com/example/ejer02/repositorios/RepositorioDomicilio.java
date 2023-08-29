package com.example.ejer02.repositorios;

import com.example.ejer02.entidades.Domicilio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositorioDomicilio extends JpaRepository<Domicilio, Long> {
}
