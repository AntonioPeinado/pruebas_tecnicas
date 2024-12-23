package org.example;

import org.example.controller.EmpleadoController;
import org.example.entitys.Empleado;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Empleado empleado = new Empleado();
        EmpleadoController empleadoController = new EmpleadoController();

        // empleadoController.create(empleado);

       /*
        Integer idBuscado = 1;
       Empleado empleado1= empleadoController.findOne(idBuscado);
        System.out.println(empleado1);
       */


        List<Empleado> todosEmpleados = empleadoController.findAll();

        for (Empleado empleado2 : todosEmpleados) {
            System.out.println(empleado2);


        }


    }

}