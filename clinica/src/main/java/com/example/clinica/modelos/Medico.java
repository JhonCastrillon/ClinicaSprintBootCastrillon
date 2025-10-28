package com.example.clinica.modelos;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "medicos")
public class Medico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(length = 50, nullable = false)
    private String nombre;

    @Column(length = 50, nullable = false)
    private String apellido;

    @Column(length = 20, nullable = false)
    private String tipoDocumento;

    @Column(length = 30, nullable = false, unique = true)
    private String numeroDocumento;

    private LocalDate fechaNacimiento;

    @Column(length = 10)
    private String genero;

    @Column(length = 20)
    private String telefono;

    @Column(length = 100)
    private String direccion;

    @Column(length = 50)
    private String correo;

    private boolean activo;


    @OneToOne
    @JoinColumn(name = "tarjeta_id")
    private TarjetaProfesional tarjetaProfesional;

    public Medico() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public String getNumeroDocumento() {
        return numeroDocumento;
    }

    public void setNumeroDocumento(String numeroDocumento) {
        this.numeroDocumento = numeroDocumento;
    }

    public LocalDate getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(LocalDate fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public TarjetaProfesional getTarjetaProfesional() {
        return tarjetaProfesional;
    }

    public void setTarjetaProfesional(TarjetaProfesional tarjetaProfesional) {
        this.tarjetaProfesional = tarjetaProfesional;
    }

    public Medico(Integer id, String nombre, String apellido, String tipoDocumento, String numeroDocumento, LocalDate fechaNacimiento, String genero, String telefono, String direccion, String correo, boolean activo, TarjetaProfesional tarjetaProfesional) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.tipoDocumento = tipoDocumento;
        this.numeroDocumento = numeroDocumento;
        this.fechaNacimiento = fechaNacimiento;
        this.genero = genero;
        this.telefono = telefono;
        this.direccion = direccion;
        this.correo = correo;
        this.activo = activo;
        this.tarjetaProfesional = tarjetaProfesional;


    }
}