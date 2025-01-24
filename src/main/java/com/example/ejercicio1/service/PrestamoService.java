package com.example.ejercicio1.service;

import com.example.ejercicio1.models.Prestamo;
import com.example.ejercicio1.repository.PrestamoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PrestamoService {
    private final List<Prestamo> prestamos = new ArrayList<>();
    private Long currentId = 1L;

    public List<Prestamo> listarTodos() {
        return prestamos;
    }

    public Prestamo guardar(Prestamo prestamo) {
        if (prestamo.getId() == null) {
            prestamo.setId(currentId++);
        }
        prestamos.add(prestamo);
        return prestamo;
    }

    public Prestamo buscarPorId(Long id) {
        return prestamos.stream()
                .filter(prestamo -> prestamo.getId().equals(id))
                .findFirst()
                .orElse(null);
    }

    public boolean eliminar(Long id) {
        return prestamos.removeIf(prestamo -> prestamo.getId().equals(id));
    }
}
