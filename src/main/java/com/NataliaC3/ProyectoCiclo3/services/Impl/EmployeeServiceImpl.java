package com.NataliaC3.ProyectoCiclo3.services.Impl;
import com.NataliaC3.ProyectoCiclo3.entities.Employee;
import com.NataliaC3.ProyectoCiclo3.services.EmployeeService;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
@Transactional
public class EmployeeServiceImpl implements EmployeeService {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Employee> getEmployees() {
        String query = "FROM Employee";
        return entityManager.createQuery(query).getResultList();
    }
}
