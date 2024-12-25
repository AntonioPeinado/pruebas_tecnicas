package org.example;

import org.example.entitys.Empleado;
import org.example.funcionalidades.Funcionalidades;

import java.time.LocalDateTime;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        LocalDateTime hoy= LocalDateTime.now();
        //Empleado empleado = new Empleado(3,"Josefa","Sanchez","peon",hoy);
        Funcionalidades funcionalidades = new Funcionalidades();
        //  empleadoController.create(empleado);
       // funcionalidades.bucarEmpleado();
       // funcionalidades.ListarEmpleados();
       // funcionalidades.actualizar();
          funcionalidades.borrarEmpleado();









    }



}