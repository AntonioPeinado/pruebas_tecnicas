package org.example.persistence;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.example.entitys.Empleado;
import org.example.funcionalidades.Funcionalidades;
import java.time.LocalDateTime;
import java.util.List;

public class EmpleadoJPA {
    public static void create(Empleado empleado) {
        EntityManager etm = ConfigJPA.getEntityManager();
        Funcionalidades funcionalidades =new Funcionalidades();
        try {

            LocalDateTime hoy= LocalDateTime.now();
         //  funcionalidades.createrEmpleado(empleado.getNombre(), empleado.getApellido(), empleado.getCargo(), LocalDateTime.parse("12/12/2012"));
            etm.getTransaction().begin();
            etm.persist(empleado);
            etm.getTransaction().commit();

        }finally {
            etm.close();

        }
    }

    public Empleado findOne(Integer idBuscado) {
        EntityManager etm = ConfigJPA.getEntityManager();
        try {
            if (idBuscado != null) {
                return etm.find(Empleado.class, idBuscado);
            } else {
                System.err.println("El id " + idBuscado + " No existe, elija otro");
            }

        } finally {
            etm.close();
        }
        return etm.find(Empleado.class, idBuscado);
    }



    public List<Empleado> findAll() {
        EntityManager etm = ConfigJPA.getEntityManager();
        try{
            TypedQuery<Empleado> query = etm.createQuery("SELECT p FROM empleado p", Empleado.class);
            return query.getResultList();
        }finally {
            etm.close();
        }
    }

    public void update(Empleado actualizarEmpleado) {
        EntityManager etm = ConfigJPA.getEntityManager();
        try{
            etm.getTransaction().begin();
            etm.merge(actualizarEmpleado);
            etm.getTransaction().commit();

        }finally {
            etm.close();
        }

    }

    public void delete(Integer eliminar) {
        EntityManager etm = ConfigJPA.getEntityManager();
        try{
            etm.getTransaction().begin(); // Iniciar una transaccion
            Empleado empleado = etm.find(Empleado.class, eliminar);
            if (empleado != null){
                etm.remove(empleado);
            }else{
                System.err.println("El id " + eliminar + " No existe, elija otro");
            }
            etm.getTransaction().commit();
        }finally {
            etm.close();
        }
    }


}


