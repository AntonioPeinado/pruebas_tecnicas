package org.example.controller;

import org.example.entitys.Empleado;
import org.example.persistence.EmpleadoJPA;

import java.util.List;

public class EmpleadoController {
    EmpleadoJPA empleadoJPA = new EmpleadoJPA();



    public void create(Empleado empleado) {
        empleadoJPA.create(empleado);

    }

    public Empleado findOne(Integer idBuscado) {
        return empleadoJPA.findOne(idBuscado);
    }

    public List<Empleado> findAll() {
        return empleadoJPA.findAll();
    }
}
