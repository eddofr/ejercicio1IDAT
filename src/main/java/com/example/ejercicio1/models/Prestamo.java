package com.example.ejercicio1.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.time.LocalDate;

@Entity
public class Prestamo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String numeroPrestamo;
    private LocalDate fechaOtorgamiento;
    private String nombreFinancista;
    private String nombreCliente;
    private Double importePrestado;
    private Integer numeroLetras;
    private Double interes;

    // Getters y Setters


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumeroPrestamo() {
        return numeroPrestamo;
    }

    public void setNumeroPrestamo(String numeroPrestamo) {
        this.numeroPrestamo = numeroPrestamo;
    }

    public LocalDate getFechaOtorgamiento() {
        return fechaOtorgamiento;
    }

    public void setFechaOtorgamiento(LocalDate fechaOtorgamiento) {
        this.fechaOtorgamiento = fechaOtorgamiento;
    }

    public String getNombreFinancista() {
        return nombreFinancista;
    }

    public void setNombreFinancista(String nombreFinancista) {
        this.nombreFinancista = nombreFinancista;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public Double getImportePrestado() {
        return importePrestado;
    }

    public void setImportePrestado(Double importePrestado) {
        this.importePrestado = importePrestado;
    }

    public Integer getNumeroLetras() {
        return numeroLetras;
    }

    public void setNumeroLetras(Integer numeroLetras) {
        this.numeroLetras = numeroLetras;
    }

    public Double getInteres() {
        return interes;
    }

    public void setInteres(Double interes) {
        this.interes = interes;
    }
}
