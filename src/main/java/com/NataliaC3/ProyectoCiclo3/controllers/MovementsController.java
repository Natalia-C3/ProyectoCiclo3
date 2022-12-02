package com.NataliaC3.ProyectoCiclo3.controllers;


import com.NataliaC3.ProyectoCiclo3.entities.Movement;
import com.NataliaC3.ProyectoCiclo3.services.MovementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RestController
public class MovementsController {

    @Autowired
    private MovementService movementService;

    @RequestMapping(value = "/movements")
    public List<Movement>  getMovements() {

        return movementService.getMovements();
    }



    @RequestMapping(value = "/movements/{id}")
    public Movement getMovement(@PathVariable Long id) {

        Movement movement = new Movement();
        movement.setId(id);
        movement.setConcept("alia");
        movement.setAmount(movement.getAmount());
        movement.setEmployee_id("33333212");
        movement.setEnterprise_id("333098");
        movement.setCreated_at(LocalDate.MIN);
        movement.setUpdated_at(LocalDate.now());
        return movement;
    }

    @RequestMapping(value = "/movements23423")
    public Movement modifyMovement() {
        Movement movement = new Movement();
        movement.setConcept("alia");
        movement.setAmount(movement.getAmount());
        movement.setEmployee_id("33333212");
        movement.setEnterprise_id("333098");
        movement.setCreated_at(LocalDate.MIN);
        movement.setUpdated_at(LocalDate.now());
        return movement;
    }

    @RequestMapping(value = "/movements2342")
    public Movement deleteMovement() {
        Movement movement = new Movement();
        movement.setConcept("alia");
        movement.setAmount(movement.getAmount());
        movement.setEmployee_id("33333212");
        movement.setEnterprise_id("333098");
        movement.setCreated_at(LocalDate.MIN);
        movement.setUpdated_at(LocalDate.now());
        return movement;
    }

    @RequestMapping(value = "/movements2342476")
    public Movement searchMovement() {
        Movement movement = new Movement();
        movement.setConcept("alia");
        movement.setAmount(movement.getAmount());
        movement.setEmployee_id("33333212");
        movement.setEnterprise_id("333098");
        movement.setCreated_at(LocalDate.MIN);
        movement.setUpdated_at(LocalDate.now());
        return movement;
    }






}
