package com.NataliaC3.ProyectoCiclo3.services.Impl;


import com.NataliaC3.ProyectoCiclo3.entities.Movement;
import com.NataliaC3.ProyectoCiclo3.services.MovementService;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
@Transactional
public class MovementServiceImpl implements MovementService {

    @PersistenceContext
    private EntityManager entityManager;


    @Override
    public List<Movement> getMovements() {
        String query = "FROM Movement";
        return entityManager.createQuery(query).getResultList();
    }
}
