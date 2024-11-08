package org.example.finalworkapi.Application.Mappers.LogicMappers;

import org.example.finalworkapi.Application.DTOs.FailureReportDTO.ListFailureReportDTO;
import org.example.finalworkapi.Domain.Entities.FailureReport;
import org.springframework.stereotype.Component;

@Component
public class FailureReportMapper {

    //List FailureReport
    public ListFailureReportDTO toDTO(FailureReport failureReport) {
        ListFailureReportDTO dto = new ListFailureReportDTO();
        dto.setIdFailureReport(failureReport.getIdFailureReport());
        dto.setIdDriver(failureReport.getIdDriver());
        dto.setDescriptionReport(failureReport.getDescriptionReport());
        return dto;
    }

}
