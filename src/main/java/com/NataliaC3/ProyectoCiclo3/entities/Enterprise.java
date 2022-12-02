package com.NataliaC3.ProyectoCiclo3.entities;


import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.*;
import java.time.LocalDate;


@Entity
@Table(name = "enterprises")
@ToString @EqualsAndHashCode

public class Enterprise {

    @Id
    @Getter @Setter @Column(name = "id")
    private Long id;
    @Getter @Setter
    @Column(name = "name")
    private String name;
    @Getter @Setter
    @Column(name = "nit")
    private String nit;
    @Getter @Setter @Column(name = "phone")
    private String phone;
    @Getter @Setter @Column(name = "address")
    private String address;
    @Getter @Setter @Column(name = "created_at")
    private LocalDate created_at;
    @Getter @Setter @Column(name = "updated_at")
    private LocalDate updated_at;

}
