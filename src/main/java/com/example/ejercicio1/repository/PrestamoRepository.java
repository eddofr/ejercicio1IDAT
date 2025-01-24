package com.example.ejercicio1.repository;

import com.example.ejercicio1.models.Prestamo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PrestamoRepository extends JpaRepository<Prestamo, Long> {
}
