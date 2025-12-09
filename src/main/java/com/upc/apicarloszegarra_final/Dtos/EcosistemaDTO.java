package com.upc.apicarloszegarra_final.Dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class EcosistemaDTO {
    Long cezjId;
    String cezjNombre;
    String cezjDescripcion;
    String cezjZona;
    LocalDate fechaCreacion;
    Double montoMantenimiento;
    TemperaturaDTO cezjTemperatura;
}
