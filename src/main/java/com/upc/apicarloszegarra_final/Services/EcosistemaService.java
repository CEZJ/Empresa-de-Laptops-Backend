package com.upc.apicarloszegarra_final.Services;

import com.upc.apicarloszegarra_final.Dtos.ReportDTO;
import com.upc.apicarloszegarra_final.Interfaces.IEcosistemaService;
import com.upc.apicarloszegarra_final.Interfaces.ITemperaturaService;
import com.upc.apicarloszegarra_final.Repositories.EcosistemaRepository;
import com.upc.apicarloszegarra_final.Repositories.TemperaturaRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EcosistemaService implements IEcosistemaService {
    @Autowired
    private EcosistemaRepository cezjEcosistemaRepository;


    @Autowired
    private ModelMapper modelMapper;

    @Override
    public List<ReportDTO> listCount() {
        return modelMapper.map
                (cezjEcosistemaRepository.listCount(),
                        List.class);
    }
}
