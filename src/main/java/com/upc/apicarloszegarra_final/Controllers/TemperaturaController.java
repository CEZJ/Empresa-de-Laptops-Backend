package com.upc.apicarloszegarra_final.Controllers;

import com.upc.apicarloszegarra_final.Interfaces.ITemperaturaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/Zegarra")
public class TemperaturaController {
    @Autowired
    private ITemperaturaService cezjTemperaturaService;
}

