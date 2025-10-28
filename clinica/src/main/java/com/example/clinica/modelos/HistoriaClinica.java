package com.example.clinica.modelos;


import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name= "historias_Clinicas")

public class HistoriaClinica {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(nullable = false)
    private Long id;

    @Column(length = 20, nullable = false)
    private String numeroHistoria;

    private LocalDate fechaApertura;

    @Column(length = 5)
    private String grupoSanguineo;

    private double peso;

    private double altura;

    @Column(length = 200)
    private String alergias;

    @Column(length = 200)
    private String enfermedadesPrevias;

    @Column(length = 200)
    private String medicamentosActuales;

    @Column(length = 500)
    private String observaciones;

    private boolean activa;


    @OneToOne
    @JoinColumn(name = "paciente_id", referencedColumnName = "id")
    private Paciente paciente;

    public HistoriaClinica() {
    }

    public HistoriaClinica(Long id, String numeroHistoria, LocalDate fechaApertura, String grupoSanguineo, double peso, double altura, String alergias, String enfermedadesPrevias, String medicamentosActuales, String observaciones, boolean activa, Paciente paciente) {
        this.id = id;
        this.numeroHistoria = numeroHistoria;
        this.fechaApertura = fechaApertura;
        this.grupoSanguineo = grupoSanguineo;
        this.peso = peso;
        this.altura = altura;
        this.alergias = alergias;
        this.enfermedadesPrevias = enfermedadesPrevias;
        this.medicamentosActuales = medicamentosActuales;
        this.observaciones = observaciones;
        this.activa = activa;
        this.paciente = paciente;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumeroHistoria() {
        return numeroHistoria;
    }

    public void setNumeroHistoria(String numeroHistoria) {
        this.numeroHistoria = numeroHistoria;
    }

    public LocalDate getFechaApertura() {
        return fechaApertura;
    }

    public void setFechaApertura(LocalDate fechaApertura) {
        this.fechaApertura = fechaApertura;
    }

    public String getGrupoSanguineo() {
        return grupoSanguineo;
    }

    public void setGrupoSanguineo(String grupoSanguineo) {
        this.grupoSanguineo = grupoSanguineo;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public String getAlergias() {
        return alergias;
    }

    public void setAlergias(String alergias) {
        this.alergias = alergias;
    }

    public String getEnfermedadesPrevias() {
        return enfermedadesPrevias;
    }

    public void setEnfermedadesPrevias(String enfermedadesPrevias) {
        this.enfermedadesPrevias = enfermedadesPrevias;
    }

    public String getMedicamentosActuales() {
        return medicamentosActuales;
    }

    public void setMedicamentosActuales(String medicamentosActuales) {
        this.medicamentosActuales = medicamentosActuales;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public boolean isActiva() {
        return activa;
    }

    public void setActiva(boolean activa) {
        this.activa = activa;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
}


