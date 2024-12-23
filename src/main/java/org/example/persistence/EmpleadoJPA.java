package org.example.persistence;

import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.example.entitys.Empleado;

import java.util.List;

public class EmpleadoJPA {
    public static void create(Empleado empleado) {
        EntityManager etm = ConfigJPA.getEntityManager();

        try {
            etm.getTransaction().begin();
            etm.persist(empleado);
            etm.getTransaction().commit();

        }finally {
            etm.close();

        }
    }

    public Empleado findOne(Integer idBuscado) {
        EntityManager etm = ConfigJPA.getEntityManager();
        try{
            return etm.find(Empleado.class, idBuscado);
        }finally {
            etm.close();
        }

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
}

