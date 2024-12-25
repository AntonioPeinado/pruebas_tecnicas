package org.example.funcionalidades;

import org.example.controller.EmpleadoController;
import org.example.entitys.Empleado;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Scanner;

public class Funcionalidades extends Empleado {

    private String ingresaNombre;
    private String ingresaApellido;
    private String ingresaCargo;
    private LocalDateTime ingresafecha;
    EmpleadoController empleadoController = new EmpleadoController();
    public Funcionalidades() {
    }

    public Funcionalidades( String nombre, String apellido, String cargo, LocalDateTime fechaInicio,Integer id, String ingresaNombre, String ingresaApellido, String ingresaCargo, LocalDateTime ingresafecha) {
        super(id, nombre, apellido, cargo, fechaInicio);

        this.ingresaNombre = nombre;
        this.ingresaApellido = apellido;
        this.ingresaCargo = cargo;
        this.ingresafecha = fechaInicio;
    }
/*
    public Empleado createrEmpleado(String nombre,String apellido, String cargo, LocalDateTime fechaInicio){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el nombre");
        String ingresaNombre = scanner.nextLine();
        scanner.nextLine();
        System.out.println("Ingrese su apellido");
        String ingresaApellido = scanner.nextLine();
        scanner.nextLine();
        System.out.println("Ingrese su Cargo");
        String ingresaCargo = scanner.nextLine();
        scanner.nextLine();
        System.out.println("Igrese su fecha");
        LocalDateTime ingresafecha = LocalDateTime.parse(scanner.nextLine());
        scanner.close();
return createrEmpleado(nombre,apellido,cargo,fechaInicio);
    }

 */
public void bucarEmpleado(){
    Integer idBuscado = 3;
    Empleado empleado1= empleadoController.findOne(idBuscado);
    System.out.println(empleado1);
}

public void ListarEmpleados(){
    List<Empleado> todosEmpleados = empleadoController.findAll();

    for (Empleado empleado2 : todosEmpleados) {
        System.out.println(empleado2);


    }

}

public void actualizar (){
    Empleado actualizarEmpleado =empleadoController.findOne(3);
    empleadoController.update(actualizarEmpleado);
    System.out.println(actualizarEmpleado);
}

public void borrarEmpleado (){
    Integer eliminar;
    empleadoController.delete(9);
}




    public String getIngresaNombre() {
        return ingresaNombre;
    }

    public void setIngresaNombre(String ingresaNombre) {
        this.ingresaNombre = ingresaNombre;
    }

    public String getIngresaApellido() {
        return ingresaApellido;
    }

    public void setIngresaApellido(String ingresaApellido) {
        this.ingresaApellido = ingresaApellido;
    }

    public String getIngresaCargo() {
        return ingresaCargo;
    }

    public void setIngresaCargo(String ingresaCargo) {
        this.ingresaCargo = ingresaCargo;
    }

    public LocalDateTime getIngresafecha() {
        return ingresafecha;
    }

    public void setIngresafecha(LocalDateTime ingresafecha) {
        this.ingresafecha = ingresafecha;
    }

    @Override
    public String toString() {
        return "Funcionalidades{" +
                "ingresaNombre='" + ingresaNombre + '\'' +
                ", ingresaApellido='" + ingresaApellido + '\'' +
                ", ingresaCargo='" + ingresaCargo + '\'' +
                ", ingresafecha=" + ingresafecha +
                '}';
    }


}
