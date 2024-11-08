package org.example.finalworkapi.Presentation;

import org.example.finalworkapi.Application.ApplicationServices.FailureReportAppService;
import org.example.finalworkapi.Application.DTOs.FailureReportDTO.ListFailureReportDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/failureReport")
public class FailureReportController {

    private final FailureReportAppService failureReportAppService;

    @Autowired
    public FailureReportController(FailureReportAppService failureReportAppService) {
        this.failureReportAppService = failureReportAppService;
    }

    @GetMapping("/listFailureReport")
    public List<ListFailureReportDTO> getFailureReport() {
        return failureReportAppService.getAllFailureReport();
    }

}
