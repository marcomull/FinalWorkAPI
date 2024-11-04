package org.example.finalworkapi.Application.ApplicationServices;

import org.example.finalworkapi.Application.DTOs.JobLogisticsDTO;
import org.example.finalworkapi.Application.Mappers.SparePartLogisticsMapper;
import org.example.finalworkapi.Domain.Entities.Job;
import org.example.finalworkapi.Domain.InterfaceService.IJobLogisticsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class JobAppServiceLogistics {

    private final IJobLogisticsService jobLogisticsService;
    private final SparePartLogisticsMapper jobLogisticsMapper;

    @Autowired
    public JobAppServiceLogistics(IJobLogisticsService jobLogisticsService,
                                  SparePartLogisticsMapper jobLogisticsMapper) {
        this.jobLogisticsService = jobLogisticsService;
        this.jobLogisticsMapper = jobLogisticsMapper;
    }

    public List<JobLogisticsDTO> getAllJobsLogistics() {
        List<Job> maintenanceList = jobLogisticsService.getAllJobsLogistics();
        return maintenanceList.stream()
                .map(jobLogisticsMapper::toDTO)
                .collect(Collectors.toList());
    }
}
