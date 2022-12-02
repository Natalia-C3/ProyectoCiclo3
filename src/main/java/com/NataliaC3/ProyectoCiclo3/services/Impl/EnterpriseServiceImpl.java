package com.NataliaC3.ProyectoCiclo3.services.Impl;

import com.NataliaC3.ProyectoCiclo3.entities.Enterprise;
import com.NataliaC3.ProyectoCiclo3.services.EnterpriseService;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
@Transactional
public class EnterpriseServiceImpl implements EnterpriseService {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Enterprise> getEnterprises() {
        String query = "FROM Enterprise";
        return entityManager.createQuery(query).getResultList();
    }
}
