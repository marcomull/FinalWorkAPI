package org.example.finalworkapi.Application.ApplicationServices;

import org.example.finalworkapi.Application.DTOs.MaintenanceAdministratorDTO;
import org.example.finalworkapi.Application.Mappers.MaintenanceAdministratorMapper;
import org.example.finalworkapi.Domain.DomainServices.MaintenanceAdministratorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import org.example.finalworkapi.Application.DTOs.JobDTO;
import org.example.finalworkapi.Application.Mappers.SpareMapper;
import org.example.finalworkapi.Domain.DomainServices.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class AppServiceJob {

    private final JobService jobService;
    private final SpareMapper jobMapper;

    @Autowired
    public AppServiceJob(JobService jobService, SpareMapper jobMapper) {
        this.jobService = jobService;
        this.jobMapper = jobMapper;
    }

    public List<JobDTO> getAllJobs() {
        List<Object[]> maintenanceList = jobService.getAllJobs();

        return maintenanceList.stream()
                .map(jobMapper::toDTO) // Necesitarás ajustar esto
                .collect(Collectors.toList());
    }


}
