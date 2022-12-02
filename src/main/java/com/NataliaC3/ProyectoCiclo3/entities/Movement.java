package com.NataliaC3.ProyectoCiclo3.entities;


import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "movements")
@ToString
@EqualsAndHashCode
public class Movement {
    @Id
    @Getter @Setter @Column(name = "id")
    private Long id;
    @Getter @Setter @Column(name = "concept")
    private String concept;
    @Getter @Setter @Column(name = "amount")
    private Float amount;
    @Getter @Setter
    @Column(name = "employee_id")
    private String employee_id;
    @Getter @Setter
    @Column(name = "enterprise_id")
    private String enterprise_id;
    @Getter @Setter
    @Column(name = "created_at")
    private LocalDate created_at;
    @Getter @Setter @Column(name = "updated_at")
    private LocalDate updated_at;

}
