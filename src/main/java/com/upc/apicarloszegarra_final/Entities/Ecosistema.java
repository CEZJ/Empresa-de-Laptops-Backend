package com.upc.apicarloszegarra_final.Entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Ecosistema {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long cezjId;
    private String cezjNombre;
    private String cezjDescripcion;
    private String cezjZona;
    private LocalDate fechaCreacion;
    private Double montoMantenimiento;
    @ManyToOne
    @JoinColumn(name = "temperatura_id")
    private Temperatura cezjTemperatura ;


}
