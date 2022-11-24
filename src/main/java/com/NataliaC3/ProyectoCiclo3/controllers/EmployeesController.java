package com.NataliaC3.ProyectoCiclo3.controllers;

import com.NataliaC3.ProyectoCiclo3.entities.Employee;
import com.NataliaC3.ProyectoCiclo3.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EmployeesController {
    @Autowired
    private EmployeeService employeeService;

    @RequestMapping(value = "/employees")
    public List<Employee> getEmployees() {
        return employeeService.getEmployees();
    }

    @RequestMapping(value = "/employees/{id}")
    public Employee getEmployee(@PathVariable Long id) {

        Employee employee = new Employee();
        employee.setId(id);
        employee.setName("Natalia");
        employee.setEmail("mataliaa@gmail.com");
        employee.setRole("Analista");
        employee.setEnterprise("GlobalColombia");
        employee.setProfile("natalia");
        employee.setPassword("1236");
        return employee;
    }

    @RequestMapping(value = "/employees23423")
    public Employee modifyEmployees() {
        Employee employee = new Employee();
        employee.setName("Natalia");
        employee.setEmail("mataliaa@gmail.com");
        employee.setRole("Analista");
        employee.setEnterprise("GlobalColombia");
        employee.setProfile("natalia");
        employee.setPassword("1236");
        return employee;
    }

    @RequestMapping(value = "/employees2342")
    public Employee deleteEmployees() {
        Employee employee = new Employee();
        employee.setName("Natalia");
        employee.setEmail("mataliaa@gmail.com");
        employee.setRole("Analista");
        employee.setEnterprise("GlobalColombia");
        employee.setProfile("natalia");
        employee.setPassword("1236");
        return employee;
    }

    @RequestMapping(value = "/employees2342476")
    public Employee searchEmployees() {
        Employee employee = new Employee();
        employee.setName("Natalia");
        employee.setEmail("mataliaa@gmail.com");
        employee.setRole("Analista");
        employee.setEnterprise("GlobalColombia");
        employee.setProfile("natalia");
        employee.setPassword("1236");
        return employee;
    }
}
