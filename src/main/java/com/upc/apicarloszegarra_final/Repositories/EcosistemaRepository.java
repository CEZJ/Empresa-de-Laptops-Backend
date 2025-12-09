package com.upc.apicarloszegarra_final.Repositories;

import com.upc.apicarloszegarra_final.Dtos.ReportDTO;
import com.upc.apicarloszegarra_final.Entities.Ecosistema;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface EcosistemaRepository extends JpaRepository<Ecosistema, Long> {
    @Query("SELECT new com.upc.apicarloszegarra_final.Dtos.ReportDTO(t.cezjValor,COUNT(ec)) " +
            "FROM Ecosistema ec " +
            "JOIN ec.cezjTemperatura t " +
            "GROUP BY t.cezjValor")
    List<ReportDTO> listCount();
}
