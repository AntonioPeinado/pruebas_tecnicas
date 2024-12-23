package org.example.funcionalidades;

import org.example.entitys.Empleado;

import java.time.LocalDateTime;
import java.util.Scanner;

public class Funcionalidades extends Empleado {
private String ingresaNombre;
    private String ingresaApellido;
    private String ingresaCargo;
    private LocalDateTime ingresafecha;

    public Funcionalidades() {
    }

    public Funcionalidades(Integer id, String nombre, String apellido, String cargo, LocalDateTime fechaInicio, String ingresaNombre, String ingresaApellido, String ingresaCargo, LocalDateTime ingresafecha) {
        super(id, nombre, apellido, cargo, fechaInicio);
        this.ingresaNombre = ingresaNombre;
        this.ingresaApellido = ingresaApellido;
        this.ingresaCargo = ingresaCargo;
        this.ingresafecha = ingresafecha;
    }


}
