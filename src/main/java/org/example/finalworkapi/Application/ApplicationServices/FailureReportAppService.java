package org.example.finalworkapi.Application.ApplicationServices;

import org.example.finalworkapi.Application.DTOs.FailureReportDTO.ListFailureReportDTO;
import org.example.finalworkapi.Application.DTOs.VehicleDTO.VehicleDTO;
import org.example.finalworkapi.Application.Mappers.LogicMappers.FailureReportMapper;
import org.example.finalworkapi.Domain.Entities.FailureReport;
import org.example.finalworkapi.Domain.Entities.Vehicle;
import org.example.finalworkapi.Domain.InterfaceService.IFailureReportService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class FailureReportAppService {

    private final IFailureReportService failureReportService;
    private final FailureReportMapper failureReportMapper;

    @Autowired
    public FailureReportAppService(IFailureReportService failureReportService, FailureReportMapper failureReportMapper) {
        this.failureReportService = failureReportService;
        this.failureReportMapper = failureReportMapper;
    }

    //List failureReport
    public List<ListFailureReportDTO> getAllFailureReport() {
        List<FailureReport> failureReports = failureReportService.getAllFailureReport();
        try {
            return failureReports.stream()
                    .map(failureReportMapper::toDTO)
                    .collect(Collectors.toList());
        } catch (ClassCastException e) {
            return Collections.emptyList();
        }
    }
}
