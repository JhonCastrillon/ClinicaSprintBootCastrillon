package com.example.clinica.modelos;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "tarjetas_profesionales")
public class TarjetaProfesional {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 20, nullable = false, unique = true)
    private String numeroTarjeta;

    private LocalDate fechaExpedicion;

    private LocalDate fechaVencimiento;

    @Column(length = 100, nullable = false)
    private String universidad;

    @Column(length = 50, nullable = false)
    private String especialidad;

    @Column(length = 30, nullable = false, unique = true)
    private String registroMedico;

    @Column(length = 50)
    private String ciudad;

    @Column(length = 50)
    private String departamento;

    private boolean vigente;


    @OneToOne(mappedBy = "tarjetaProfesional")
    private Medico medico;

    public TarjetaProfesional() {
    }

    public TarjetaProfesional(Long id, String numeroTarjeta, LocalDate fechaExpedicion, LocalDate fechaVencimiento, String universidad, String especialidad, String registroMedico, String ciudad, String departamento, boolean vigente, Medico medico) {
        this.id = id;
        this.numeroTarjeta = numeroTarjeta;
        this.fechaExpedicion = fechaExpedicion;
        this.fechaVencimiento = fechaVencimiento;
        this.universidad = universidad;
        this.especialidad = especialidad;
        this.registroMedico = registroMedico;
        this.ciudad = ciudad;
        this.departamento = departamento;
        this.vigente = vigente;
        this.medico = medico;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public void setNumeroTarjeta(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    public LocalDate getFechaExpedicion() {
        return fechaExpedicion;
    }

    public void setFechaExpedicion(LocalDate fechaExpedicion) {
        this.fechaExpedicion = fechaExpedicion;
    }

    public LocalDate getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setFechaVencimiento(LocalDate fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    public String getUniversidad() {
        return universidad;
    }

    public void setUniversidad(String universidad) {
        this.universidad = universidad;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getRegistroMedico() {
        return registroMedico;
    }

    public void setRegistroMedico(String registroMedico) {
        this.registroMedico = registroMedico;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public boolean isVigente() {
        return vigente;
    }

    public void setVigente(boolean vigente) {
        this.vigente = vigente;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }
}



