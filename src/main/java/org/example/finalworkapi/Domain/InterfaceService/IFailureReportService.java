package org.example.finalworkapi.Domain.InterfaceService;

import org.example.finalworkapi.Domain.Entities.FailureReport;
import java.util.List;

public interface IFailureReportService {
    List<FailureReport> getAllFailureReport();
}
