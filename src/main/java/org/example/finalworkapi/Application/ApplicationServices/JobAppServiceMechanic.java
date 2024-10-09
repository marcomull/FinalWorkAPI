package org.example.finalworkapi.Application.ApplicationServices;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.example.finalworkapi.Application.DTOs.JobMechanicDTO;
import org.example.finalworkapi.Application.Mappers.SparePartMechanicMapper;
import org.example.finalworkapi.Domain.DomainServices.JobMechanicService;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class JobAppServiceMechanic {

    private final JobMechanicService jobService;
    private final SparePartMechanicMapper jobMapper;

    @Autowired
    public JobAppServiceMechanic(JobMechanicService jobService, SparePartMechanicMapper jobMapper) {
        this.jobService = jobService;
        this.jobMapper = jobMapper;
    }

    public List<JobMechanicDTO> getAllJobs() {
        List<Object[]> maintenanceList = jobService.getAllJobs();

        return maintenanceList.stream()
                .map(jobMapper::toDTO)
                .collect(Collectors.toList());
    }
}
