package com.upc.apicarloszegarra_final.Dtos;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class TemperaturaDTO {
    Long cezjId;
    String cezjValor;
    Double cezjLatitud;
    Double cezjLongitud;
}
