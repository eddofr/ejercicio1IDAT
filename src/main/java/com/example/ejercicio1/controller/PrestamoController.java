package com.example.ejercicio1.controller;

import com.example.ejercicio1.models.Prestamo;
import com.example.ejercicio1.service.PrestamoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/prestamos")
public class PrestamoController {
    @Autowired
    private PrestamoService prestamoService;

    @GetMapping
    public List<Prestamo> listarTodos() {
        return prestamoService.listarTodos();
    }

    @PostMapping
    public Prestamo guardar(@RequestBody Prestamo prestamo) {
        return prestamoService.guardar(prestamo);
    }

    @GetMapping("/{id}")
    public Prestamo buscarPorId(@PathVariable Long id) {
        return prestamoService.buscarPorId(id);
    }

    @DeleteMapping("/{id}")
    public void eliminar(@PathVariable Long id) {
        prestamoService.eliminar(id);
    }
}
