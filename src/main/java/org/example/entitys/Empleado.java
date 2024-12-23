package org.example.entitys;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.Scanner;

@Entity(name = "empleado")
public class Empleado {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false, length = 250)
    private String nombre;

    @Column(nullable = false, length = 250)
    private String apellido;

    @Column(nullable = false, length = 250)
    private String cargo;

    @Column(nullable = false, length = 250)
    private LocalDateTime fechaInicio;

    public Empleado() {
    }

    public Empleado(Integer id, String nombre, String apellido, String cargo, LocalDateTime fechaInicio) {
        this.id = id;
        this.nombre = nombre;
        this.apellido = apellido;
        this.cargo = cargo;
        this.fechaInicio = fechaInicio;
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

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public LocalDateTime getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDateTime fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", cargo='" + cargo + '\'' +
                ", fechaInicio=" + fechaInicio +
                '}';
    }
}
