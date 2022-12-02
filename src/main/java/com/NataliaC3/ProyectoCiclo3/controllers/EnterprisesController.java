package com.NataliaC3.ProyectoCiclo3.controllers;


import com.NataliaC3.ProyectoCiclo3.entities.Enterprise;
import com.NataliaC3.ProyectoCiclo3.services.EnterpriseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RestController
public class EnterprisesController {

    @Autowired
    private EnterpriseService enterpriseService;

    @RequestMapping(value = "/enterprises")
    public List<Enterprise> getEnterprises(){
        return enterpriseService.getEnterprises();
    }

    @RequestMapping(value = "/enterprises/{id}")
    public Enterprise getEnterprise (@PathVariable Long id) {

        Enterprise enterprise = new Enterprise();
        enterprise.setId(id);
        enterprise.setName("Nat");
        enterprise.setNit("11111");
        enterprise.setAddress("ditecc");
        enterprise.setPhone("33333");
        enterprise.setCreated_at(LocalDate.MIN);
        enterprise.setUpdated_at(LocalDate.MAX);
        return enterprise;
    }

    @RequestMapping(value = "/enterprises564")
    public Enterprise modifyEnterprise() {

        Enterprise enterprise = new Enterprise();
        enterprise.setName("Nat");
        enterprise.setNit("11111");
        enterprise.setAddress("ditecc");
        enterprise.setPhone("33333");
        enterprise.setCreated_at(LocalDate.MIN);
        enterprise.setUpdated_at(LocalDate.MAX);
        return enterprise;
    }

    @RequestMapping(value = "/enterprises86535232")
    public Enterprise deleteEnterprise() {
        Enterprise enterprise = new Enterprise();

        enterprise.setName("Nat");
        enterprise.setNit("11111");
        enterprise.setAddress("ditecc");
        enterprise.setPhone("33333");
        enterprise.setCreated_at(LocalDate.MIN);
        enterprise.setUpdated_at(LocalDate.MAX);
        return enterprise;

    }

    @RequestMapping(value = "/enterprises443")
    public Enterprise searchEnterprise(){
        Enterprise enterprise = new Enterprise();

        enterprise.setName("Nat");
        enterprise.setNit("11111");
        enterprise.setAddress("ditecc");
        enterprise.setPhone("33333");
        enterprise.setCreated_at(LocalDate.MIN);
        enterprise.setUpdated_at(LocalDate.MAX);
        return enterprise;
    }
}

