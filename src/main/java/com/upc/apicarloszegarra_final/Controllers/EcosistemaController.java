package com.upc.apicarloszegarra_final.Controllers;

import com.upc.apicarloszegarra_final.Dtos.ReportDTO;
import com.upc.apicarloszegarra_final.Services.EcosistemaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/Zegarra")
public class EcosistemaController {
    @Autowired
    private EcosistemaService cezjEcosistemaService;

    @GetMapping("/laptops")
    @PreAuthorize("hasRole('DOCENTE')")
    public ResponseEntity<List<ReportDTO>> listCount() {
        List<ReportDTO> result = cezjEcosistemaService.listCount();
        return ResponseEntity.ok(result);
    }
}
