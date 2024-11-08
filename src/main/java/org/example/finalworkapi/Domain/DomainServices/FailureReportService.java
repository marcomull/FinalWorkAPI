package org.example.finalworkapi.Domain.DomainServices;

import org.example.finalworkapi.Domain.Entities.FailureReport;
import org.example.finalworkapi.Domain.InterfaceService.IFailureReportService;
import org.example.finalworkapi.Infrastructure.InterfaceRepository.IFailureReportRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class FailureReportService implements IFailureReportService {

    private final IFailureReportRepository failureReportRepository;

    @Autowired
    public FailureReportService(IFailureReportRepository failureReportRepository) {
        this.failureReportRepository = failureReportRepository;
    }

    @Override
    public List<FailureReport> getAllFailureReport() {
        return failureReportRepository.findAll();
    }
}
